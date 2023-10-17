package de.ait.SoftwareCinema;

public class Cartoon extends Film {

    private String animationType;

    public Cartoon(String title, int durationInMin, double rating, String genre, String animationType, int availableTickets) {
        super(title, durationInMin, rating, genre, availableTickets);
        this.animationType = animationType;
    }
    @Override
    protected void showTrailer() {
        System.out.println("Cartoon Trailer screening \"" + getTitle() + "\"."
                + "\nThis cartoon created in " + animationType + " type of Animation.");
    }

    public String getAnimationType() {
        return animationType;
    }
}
