package de.ait.homework54;

public enum MusicGenre {
    POP("Popular and Mainstream"),
    ROCK("Hard and Strong"),
    JAZZ("Chill and Vibe"),
    CLASSICAL("Quiet and Calm"),
    ELECTRONIC("Electric and Techno"),
    HIPHOP("Rap and rhythmic");

    private final String description;

    MusicGenre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
