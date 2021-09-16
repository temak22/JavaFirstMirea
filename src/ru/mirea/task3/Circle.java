package ru.mirea.task3;

public class Circle {
    private double radius;

    Circle() {};

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double perimeter) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius;
    }
}

