package ru.mirea.task17;

import java.util.Scanner;

enum MusicGenres {
    Rock(1), HipHop(2), Punk(3), Alternative(4), Metal(5);
    private int num;
    int getNum() { return num; }
    MusicGenres(int num) { this.num = num; }
}

public class TestEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicGenres genre1 = MusicGenres.Rock;
        MusicGenres genre2 = MusicGenres.Punk;
        MusicGenres genre3;
        System.out.println("""
                Укажите жанр своего альбома :
                0 - Отмена
                1 - Рок
                2 - Хип-хоп
                3 - Панк-рок
                4 - Альтернативный рок
                5 - Метал""");

        int n = scanner.nextInt();
        genre3 = switch (n) {
            case 1 -> MusicGenres.Rock;
            case 2 -> MusicGenres.HipHop;
            case 3 -> MusicGenres.Punk;
            case 4 -> MusicGenres.Alternative;
            case 5 -> MusicGenres.Metal;
            default -> null;
        };
        System.out.println("\nЖанры ваших альбомов:\n" +
                "1) " + genre1.name() + "\n2) " + genre2.name());
        if (genre3 != null)
            System.out.println("3) " + genre3.name());

        System.out.println("\nЗначения всех enum и номеров операций:\n" +
                MusicGenres.Rock + " (" + MusicGenres.Rock.getNum() + "), " +
                MusicGenres.HipHop + " (" + MusicGenres.HipHop.getNum() + "), " +
                MusicGenres.Punk + " (" + MusicGenres.Punk.getNum() + "), " +
                MusicGenres.Alternative + " (" + MusicGenres.Alternative.getNum() + "), " +
                MusicGenres.Metal + " (" + MusicGenres.Metal.getNum() + ")");
        System.out.println("\nКонстанты:");
        for (MusicGenres genre : MusicGenres.values()) {
            System.out.println(genre + " " + genre.ordinal());
        }
        if (genre3 == null) return; //throw new Exception("NullPointer");
        if (genre1.equals(genre3) | genre2.equals(genre3)) {
            System.out.println("\nequals() использовано");
        }
        if (genre1 == genre3 | genre2 == genre3) {
            System.out.println("сравнение проведено");
        }
        if (genre1.compareTo(genre3) == 0 | genre2.compareTo(genre3) == 0) {
            System.out.println("compareTo() использовано");
        }
        else
            System.out.println("\nнет равенств");

    }
}