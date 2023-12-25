package de.ait.softwareCinema;

import java.util.List;

public class FeatureFilm extends Film {

    private String director;

    private List<String> mainActors;

    public FeatureFilm(String title, int durationInMin, double rating, String genre, String director, List<String> mainActors, int availableTickets) {
        super(title, durationInMin, rating, genre, availableTickets);
        this.director = director;
        this.mainActors = mainActors;
    }

    @Override
    protected void showTrailer() {
        System.out.println("Film Trailer screening \"" + getTitle() + "\"."
                + "\nDirector: " + director + "\nMain Actors: " + mainActors);
    }

    public String getDirector() {
        return director;
    }

    public List<String> getMainActors() {
        return mainActors;
    }
}