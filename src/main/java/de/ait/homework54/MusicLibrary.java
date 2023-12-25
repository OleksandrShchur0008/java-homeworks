package de.ait.homework54;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

    private List<Album> albums;

    public MusicLibrary(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public List<Album> getAlbumsByGenre(MusicGenre genre) {
        List<Album> albumsByGenre = new ArrayList<>();
        for (Album album : albums) {
            if(album.getGenre() == genre) {
                albumsByGenre.add(album);
            }
        }
        return albumsByGenre;
    }
}
