package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class AlbumInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String[] songsInfo;

    public AlbumInfo(String[] songsInfo){
        this.songsInfo = songsInfo;
    }

    public String[] getSongsInfo() {
        return songsInfo;
    }

    public void setSongsInfo(String[] songsInfo) {
        this.songsInfo = songsInfo;
    }

    @Override
    public String toString() {
        return "AlbumInfo{" +
                "songsInfo=" + Arrays.toString(songsInfo) +
                '}';
    }
}