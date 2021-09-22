package ru.mirea.task7;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Shape: MovableCircle, x:" + x + ", y:" + y + ", xSpeed:" + xSpeed + ", ySpeed:" + ySpeed + ", radius:" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }
}
