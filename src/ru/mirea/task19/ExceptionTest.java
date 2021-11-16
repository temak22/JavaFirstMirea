package ru.mirea.task19;

import ru.mirea.task16.Album;

import java.util.ArrayList;

class ExceptionTest {

    static int subscribers;
    static ArrayList<Album> singles = new ArrayList<>();

    static void printSubs() throws Exception {
        subscribers = singles.size() - 1;
        if (subscribers < 0)
            throw new Exception("Число подписчиков меньше 0!");
        System.out.println(subscribers);
    }

    public static void main(String[] args) {
        try {
            printSubs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}