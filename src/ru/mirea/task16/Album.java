package ru.mirea.task16;

import java.util.ArrayList;

public class Album {
    String name;
    Artist artist;
    String genre;
    String year;
    ArrayList<Song> songs;

    public Album(String name, Artist artist, String genre, String year) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }
}
