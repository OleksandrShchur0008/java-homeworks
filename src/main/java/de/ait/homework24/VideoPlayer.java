package de.ait.homework24;

public class VideoPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video playback is paused");
    }

    @Override
    public void stop() {
        System.out.println("Video playback is stopped");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding video");
    }

    void changeResolution() {
        System.out.println("Changing video resolution");
    }
}
