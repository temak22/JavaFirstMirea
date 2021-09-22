package ru.mirea.task5;

public abstract class Dog {

    private String wool;

    Dog(String wool) {
        this.wool = wool;
    }

    public abstract void run();

    public abstract void tame();

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }
}
