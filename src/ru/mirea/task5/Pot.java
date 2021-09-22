package ru.mirea.task5;

public class Pot extends Dish {
    @Override
    public void crashOnHusband() {
        System.out.println("Throw");
    }

    @Override
    public void eatIn() {
        System.out.println("Eat!!!");
    }

    Pot(String material){
        super(material);
    }
}
