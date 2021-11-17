package ru.mirea.task20;

import ru.mirea.task16.Artist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    public static String dateFormatAlbum(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        Artist oxxxy = new Artist("Oxxxymiron", "oxxxy@yandex.ru", 100000000, "hip-hop");
        Album mohkoleso = new Album("Моховое колесо", oxxxy, "hip-hop");
        Scanner scanner = new Scanner(System.in);

        Date date = new Date();
        mohkoleso.setDate(date);
        System.out.println(date);

        System.out.println("Релиз альбома \"" + mohkoleso.name + "\" был " + dateFormatAlbum(mohkoleso.date) + "! \nПроверяйте группу в вк!");
    }
}