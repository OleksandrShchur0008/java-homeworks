package de.ait.softwareLibrary;

public class AudioBook extends Book {
    private int duration; // Длительность аудиокниги в минутах

    public AudioBook(String id, String title, String author, String genre, int duration) {
        super(id, title, author, genre);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                "} " + super.toString();
    }

    public int getDuration() {
        return duration;


    }
}
