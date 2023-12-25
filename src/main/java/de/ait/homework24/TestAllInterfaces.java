package de.ait.homework24;

public class TestAllInterfaces {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();
        car.stop();
        car.fuelUp();
        System.out.println();
        Vehicle boat = new Boat();
        boat.drive();
        boat.stop();
        boat.fuelUp();
        System.out.println();
        Saveable textDocument = new TextDocument();
        textDocument.save();
        textDocument.load();
        System.out.println();
        Saveable image = new Image();
        image.save();
        image.load();
        System.out.println();
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();
        audioPlayer.rewind();
        System.out.println();
        MediaPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        videoPlayer.rewind();
    }
}

