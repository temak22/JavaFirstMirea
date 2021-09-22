package ru.mirea.task7;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        super(0,0, xSpeed, ySpeed); //x и y, равные нулю, не используются далее
        
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;

        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public boolean isEqualSpeed() {
        return (topLeft.ySpeed == bottomRight.ySpeed && topLeft.xSpeed == bottomRight.xSpeed);
    }

    @Override
    public String toString() {
        return "Shape: MovableRectangle, topLeft: (" + topLeft + "), bottomRight: (" + bottomRight + "), xSpeed:" + xSpeed + ", ySpeed:" + ySpeed;
    }

    @Override
    public void moveUp() {
        if (isEqualSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (isEqualSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveRight() {
        if (isEqualSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft() {
        if (isEqualSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
}
