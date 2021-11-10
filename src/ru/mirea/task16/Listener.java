package ru.mirea.task16;

import java.util.ArrayList;

public class Listener extends Person {
    ArrayList<Playlist> playlists;
    ArrayList<Artist> artists;
    ArrayList<Album> albums;
    ArrayList<Song> songs;


    public Listener(String name, String email) {
        super(name, email);
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    void addSong(Song song) {
        songs.add(song);
    }

    void addAlbum(Album album) {
        albums.add(album);
    }

    void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
}
