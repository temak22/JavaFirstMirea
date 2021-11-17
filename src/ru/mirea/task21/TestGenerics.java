package ru.mirea.task21;

import ru.mirea.task16.Artist;
import ru.mirea.task16.Listener;
import ru.mirea.task16.Person;

import java.util.ArrayList;

public class TestGenerics {

    static ArrayList<Artist> artists = new ArrayList<>();
    static ArrayList<Listener> listeners = new ArrayList<>();

    static public <T extends Person> void print(ArrayList<T> tArrayList) {
        for (int i = 0; i < tArrayList.size(); i++) {
            System.out.println(tArrayList.get(i) + " " + tArrayList.get(i).getName() + " " + tArrayList.get(i).getEmail());
        }
    }

    public static void main(String[] args) {
        Artist artist = new Artist("artist", "art@", 10, "rap");
        Listener listener = new Listener("listener", "listen@");
        artists.add(artist);
        listeners.add(listener);

        print(artists);
        System.out.println();
        print(listeners);

        /*
        следущие действия не сработают, потому что generics позволяет вызывать print только для
        ArrayList<Artist> и ArrayList<Listener>, наследуемые от Person

        Album album = new Album("album", artist, "rap", "2021");
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album);
        print(albums);*/
    }
}
