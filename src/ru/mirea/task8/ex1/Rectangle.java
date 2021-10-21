package ru.mirea.task8.ex1;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width, length;

    public Rectangle(int x, int y, int width, int length,Color color) {
        this.color=color;
        this.point= new Point(x,y);
        this.width = width;
        this.length = length;
    };
    public double getX() {
        return point.getX();
    }

    public double getY() {
        return point.getY();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public  Color getColor() {
        return color;
    }

}
