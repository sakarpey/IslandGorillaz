package com.javarush.island.karpeev.map;

import com.javarush.island.khmelov.entity.organizm.animals.Animal;

class Map {
    private Cell[][] cells;
    private int rows;
    private int cols;

    public Map(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return cells[row][col];
        }
        return null; // Вернуть null, если ячейка вне границ карты
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void printMap() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Cell cell = cells[i][j];
                if (cell.isOccupied()) {
                    // Печатаем иконки животных в ячейке
                    for (Animal animal : cell.getAnimals()) {
                        System.out.print(animal.getIcon() + " ");
                    }
                } else {
                    System.out.print(". "); // Печатаем точку для пустой ячейки
                }
            }
            System.out.println();
        }
    }
}

