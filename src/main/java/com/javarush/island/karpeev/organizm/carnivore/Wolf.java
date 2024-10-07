package com.javarush.island.karpeev.organizm.carnivore;

import java.util.Map;

public class Wolf extends Carnivore{
    public Wolf(Map map, int startRow, int startCol) {
        super(map, startRow, startCol);
    }


    public String getIcon() {
        return "🐺"; // Иконка волка
    }
}
