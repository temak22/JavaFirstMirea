package ru.mirea.task3;

public class Hand {
    private boolean isExist;
    private boolean isHairy;
    private boolean isSporty;


    public Hand(boolean isExist, boolean isHairy, boolean isSporty) {
        this.isExist = isExist;
        this.isHairy = isHairy;
        this.isSporty = isSporty;
    }

    public Hand() {
        this.isExist = true;
        this.isHairy = false;
        this.isSporty = false;
    }

    public void setExistance(boolean isExist) {
        this.isExist = isExist;
    }

    public void setHairiance(boolean isHairy) {
        this.isHairy = isHairy;
    }

    public void setSport(boolean isSporty) {
        this.isSporty = isHairy;
    }

    public boolean getExistance() {
        return isExist;
    }

    public boolean getHairiance() {
        return isHairy;
    }

    public boolean getSport() {
        return isSporty;
    }
}
