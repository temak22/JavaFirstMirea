package ru.mirea.task20;

import ru.mirea.task16.Artist;
import ru.mirea.task16.Song;

import java.util.ArrayList;
import java.util.Date;

public class Album {
    String name;
    Artist artist;
    String genre;
    Date date;
    ArrayList<Song> songs;

    Album(String name, Artist artist, String genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
