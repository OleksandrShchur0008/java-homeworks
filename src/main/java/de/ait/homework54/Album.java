package de.ait.homework54;

public class Album {

    private String title;

    private String artist;

    private MusicGenre genre;

    public Album(String title, String artist, MusicGenre genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public MusicGenre getGenre() {
        return genre;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Album -> " + title +
                ", Author - " + artist +
                ", Genre - " + genre;
    }
}
