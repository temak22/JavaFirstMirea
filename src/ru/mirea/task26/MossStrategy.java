package ru.mirea.task26;

public class MossStrategy implements GetNameStrategy {
    public void getName(String name){
        System.out.println("Имя шедевра: " + name);
    }
}