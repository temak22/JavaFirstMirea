package ru.mirea.task18;

import ru.mirea.task16.Album;

import java.util.ArrayList;

public class ExceptionTest {

    static int subscribers;
    static ArrayList<Album> singles = new ArrayList<>();

    // сгенерировать исключение в методе
    static void subEx() {
        try {
            subscribers = singles.size() - 1;
            if (subscribers == -1)
                throw new RuntimeException("ошибка кол-ва подписчиков");
        } finally {
            System.out.println("Произошла ошибка кол-ва подписчиков! Их -1!");
        }
    }


    static void doubleEx () {
        try {
            int statInfo = subscribers/(singles.size()); //1 ex
            singles.get(1);                              //2 ex
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА!!!\nДеление на нуль: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ОШИБКА!!!\nОшибка индексации за пределами списка: " + e);
        }
        System.out.println("\nВсе ошибки обработаны!");
    }

    public static void main(String[] args) {
        try {
            subEx();
        } catch (Exception e) {
            subscribers = 0;
            System.out.println("Исключение перехвачено: теперь подписчиков 0");
            System.out.println();
        }
        doubleEx();
    }
}
