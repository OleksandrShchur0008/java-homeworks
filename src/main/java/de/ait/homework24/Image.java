package de.ait.homework24;

public class Image implements Saveable {

    @Override
    public void save() {
        System.out.println("Image saved successfully");
    }

    @Override
    public void load() {
        System.out.println("Image loaded successfully");
    }

    void crop() {
        System.out.println("Image cropped successfully");
    }
}
