package ru.mirea.task26;

public class Album {
    public void whatWeDo(){
        System.out.println("Даем имя шедевру:");
    }

    GetNameStrategy getNameStrategy;
    public void getName(String name){
        getNameStrategy.getName(name);
    }
}