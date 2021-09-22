package ru.mirea.task5;

public class Closet extends Furniture{
    @Override
    public void printName() {
        System.out.println("Closet " + getMaterial());
    }

    Closet(String material){
        super(material);
    }
}
