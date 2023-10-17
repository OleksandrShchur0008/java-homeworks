package de.ait.SoftwareCinema;

import java.util.UUID;

abstract class Film {

    private String id;

    private String title;

    private int durationInMin;

    private double rating;

    private String genre;

    private int availableTickets;


    abstract void showTrailer();

    public void removeAvailableTicket() {
        availableTickets--;
    }

    public void addAvailableTicket() {
        availableTickets++;
    }

    public Film(String title, int durationInMin, double rating, String genre, int availableTickets) {
        this.title = title;
        this.durationInMin = durationInMin;
        this.rating = rating;
        this.genre = genre;
        this.availableTickets = availableTickets;
        this.id = generateId();
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    private String generateId() {
        String uniqueId = UUID.randomUUID().toString();
        return uniqueId;
    }

    public String getId() {
        return id;
    }
}


