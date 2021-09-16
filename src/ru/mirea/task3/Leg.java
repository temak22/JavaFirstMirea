package ru.mirea.task3;

public class Leg {
    private boolean isExist;
    private boolean isHairy;

    public Leg(boolean isExist, boolean isHairy) {
        this.isExist = isExist;
        this.isHairy = isHairy;
    }

    public Leg() {
        this.isExist = true;
        this.isHairy = false;
    }

    public void setExistance(boolean isExist) {
        this.isExist = isExist;
    }

    public void setHairiance(boolean isHairy) {
        this.isHairy = isHairy;
    }

    public boolean getExistance() {
        return isExist;
    }

    public boolean getHairiance() {
        return isHairy;
    }
}
