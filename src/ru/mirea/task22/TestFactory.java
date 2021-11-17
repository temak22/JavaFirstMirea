package ru.mirea.task22;

import java.util.Scanner;

enum MusicGenres {
    Rock(1), HipHop(2), Punk(3), Alternative(4), Metal(5);
    private int num;
    int getNum() { return num; }
    MusicGenres(int num) { this.num = num; }
}

public class TestFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicGenres genre;
        System.out.println("""
                Укажите жанр своего альбома :
                0 - Отмена
                1 - Рок
                2 - Хип-хоп
                3 - Панк-рок
                4 - Альтернативный рок
                5 - Метал""");

        int n = scanner.nextInt();
        genre = switch (n) {
            case 1 -> MusicGenres.Rock;
            case 2 -> MusicGenres.HipHop;
            case 3 -> MusicGenres.Punk;
            case 4 -> MusicGenres.Alternative;
            case 5 -> MusicGenres.Metal;
            default -> null;
        };
        System.out.println("\n" + genre);
    }
}