package de.ait.softwareCinema2;

import java.time.LocalDateTime;

public class Movie {

    private String title;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private int availableTickets;

    public Movie(String title, LocalDateTime startTime, LocalDateTime endTime, int availableTickets) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.availableTickets = availableTickets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public boolean checkMovieOverlapWithMovie(Movie movie, Movie movieToCheck) {
        return movie.getStartTime().isBefore(movieToCheck.getEndTime()) &&
                movieToCheck.getStartTime().isBefore(movie.getEndTime());
    }
}
