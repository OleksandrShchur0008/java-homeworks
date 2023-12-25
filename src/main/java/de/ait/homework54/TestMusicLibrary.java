package de.ait.homework54;

import java.util.ArrayList;
import java.util.List;

public class TestMusicLibrary {

    public static void main(String[] args) {
        Album album1 = new Album("Dawn FM", "The Weeknd", MusicGenre.POP);
        Album album2 = new Album("Starboy", "The Weeknd", MusicGenre.POP);
        Album album3 = new Album("ASTROWORLD", "Travis Scoot", MusicGenre.HIPHOP);
        Album album4 = new Album("Utopia", "Travis Scoot", MusicGenre.HIPHOP);
        Album album5 = new Album("i am > i was", "21 Savage", MusicGenre.HIPHOP);
        Album album6 = new Album("HEROES & VILLAINS", "Metro Boomin", MusicGenre.ELECTRONIC);
        Album album7 = new Album("Walking On A Dream", "Empire of the Sun", MusicGenre.JAZZ);
        Album album8 = new Album("Mutter", "Rammstein", MusicGenre.ROCK);
        Album album9 = new Album("Sehnsucht", "Rammstein", MusicGenre.ROCK);
        Album album10 = new Album("DAMN.", "Kendrick Lamar", MusicGenre.HIPHOP);

        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.add(album4);
        albums.add(album5);
        albums.add(album6);
        albums.add(album7);
        albums.add(album8);
        albums.add(album9);
        albums.add(album10);

        System.out.println("All saved albums in Library: ");
        for(Album album : albums) {
            System.out.println(album);
        }

        MusicLibrary musicLibrary = new MusicLibrary(albums);

        System.out.println("\nSorted by genre:\n");
        List<Album> hiphopAlbums = musicLibrary.getAlbumsByGenre(MusicGenre.HIPHOP);
        for(Album sortedAlbum : hiphopAlbums) {
            System.out.println(sortedAlbum);
        }

    }
}
