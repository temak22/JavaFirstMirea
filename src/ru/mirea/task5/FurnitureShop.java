package ru.mirea.task5;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> store;

    FurnitureShop() {
        store = new ArrayList<>();
    }

    public void buyFurniture (Furniture furniture){
        store.add(furniture);
    }

    public void sellFurniture (Furniture furniture){
        store.remove(furniture);
    }

    public void printStore (){
        for (int i = 0; i < store.size(); i++) {
            store.get(i).printName();
        }
    }
}
