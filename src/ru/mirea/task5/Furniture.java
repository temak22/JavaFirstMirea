package ru.mirea.task5;

public abstract class Furniture {

    private String material;

    Furniture(String material) {
        this.material = material;
    }

    public abstract void printName();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}