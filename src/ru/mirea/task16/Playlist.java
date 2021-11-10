package ru.mirea.task16;

import java.util.ArrayList;

public class Playlist {
    String name;
    Listener creator;
    ArrayList<Song> songs;

    Playlist(String name, Listener creator) {
        this.name = name;
        this.creator = creator;
    }
}
