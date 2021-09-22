package ru.mirea.task5;

public class Test {
    public static void main(String[] args) {
        Pot pot = new Pot("clay");
        System.out.println(pot.getMaterial());
        pot.crashOnHusband();
        pot.eatIn();

        System.out.println();

        Poodle poodle = new Poodle("long");
        System.out.println(poodle.getWool());
        poodle.tame();
        poodle.run();

        System.out.println();

        Closet closet = new Closet("wood");
        System.out.println(closet.getMaterial());
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.buyFurniture(closet);
        furnitureShop.printStore();
        System.out.println();
        Closet closet2 = new Closet("plastic");
        furnitureShop.buyFurniture(closet2);
        furnitureShop.printStore();
    }
}
