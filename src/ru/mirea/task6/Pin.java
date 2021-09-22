package ru.mirea.task6;

public class Pin implements Priceable{

    int price;

    Pin(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
