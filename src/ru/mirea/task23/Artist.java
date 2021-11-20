package ru.mirea.task23;

import ru.mirea.task16.Album;
import ru.mirea.task16.Person;

import java.util.ArrayList;

public class Artist extends Person {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist that = (Artist) o;

        return getEmail().equals(that.getEmail());
    }

    @Override
    public int hashCode() {
        int result =  (getEmail() == null)  ?  0 : getEmail().hashCode();
        result = 31 * result;
        return result;
    }
}
