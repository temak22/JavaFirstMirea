package ru.mirea.task5;

public abstract class Dish {

    private String material;

    Dish(String material) {
        this.material = material;
    }

    public abstract void crashOnHusband();

    public abstract void eatIn();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
