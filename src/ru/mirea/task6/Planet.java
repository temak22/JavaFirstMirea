package ru.mirea.task6;

public class Planet implements Nameable{

    String name;

    Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
