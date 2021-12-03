package ru.mirea.task25;

public class Album implements SystemClass{
    private SystemClass systemClass;
    private int price;

    public Album(SystemClass systemClass, int price) {
        this.systemClass = systemClass;
        this.price = price;
    }

    @Override
    public int getPriceOf() {
        return systemClass.getPriceOf() + getPriceOf();
    }
}
