package ru.mirea.task16;

import java.util.ArrayList;

public class Artist extends Person{
    int subscribers;
    String genre;
    ArrayList<Album> singles;
    ArrayList<Album> albums;

    public Artist(String name, String email, int subscribers, String genre) {
        super(name, email);
        this.subscribers = subscribers;
        this.genre = genre;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public String getGenre() {
        return genre;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public ArrayList<Album> getSingles() {
        return singles;
    }

    void createSingle(Album single) {
        singles.add(single);
    }

    void createAlbum(Album album) {
        singles.add(album);
    }
}