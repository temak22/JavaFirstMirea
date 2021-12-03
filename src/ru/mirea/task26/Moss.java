package ru.mirea.task26;

public class Moss extends Album {
    public Moss(){
        this.getNameStrategy = new MossStrategy();
    }
}
