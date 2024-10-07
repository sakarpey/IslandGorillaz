package com.javarush.island.karpeev.map;

import com.javarush.island.khmelov.entity.organizm.animals.Animal;

import java.util.ArrayList;
import java.util.List;

// Класс Cell представляет одну ячейку карты
class Cell {
    private List<Animal> animals;

    public Cell() {

        this.animals = new ArrayList<>();
    }

    public boolean isOccupied() {

        return !animals.isEmpty();
    }

    public void addAnimal(Animal animal) {

        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {

        animals.remove(animal);
    }

    public List<Animal> getAnimals() {

        return animals;
    }
}
