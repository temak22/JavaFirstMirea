package ru.mirea.task8.ex1;

import java.awt.*;

public class Circle extends Shape {
    protected int radius;

    public Circle(int x, int y, int radius, Color color) {
        this.color=color;
        this.point= new Point(x,y);
        this.radius = radius;
    };
    public double getX() {
        return point.getX();
    }

    public double getY() {
        return point.getY();
    }

    public int getRadius() {
        return radius;
    }

    public  Color getColor() {
        return color;
    }

}