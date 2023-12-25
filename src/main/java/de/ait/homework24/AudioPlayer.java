package de.ait.homework24;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Audio is playing");
    }

    @Override
    public void pause() {
        System.out.println("Audio playback is paused");
    }

    @Override
    public void stop() {
        System.out.println("Audio playback is stopped");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding audio");
    }

    void adjustVolume() {
        System.out.println("Adjusting audio volume");
    }
}
