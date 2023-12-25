package de.ait.homework24;

public class TextDocument implements Saveable {

    @Override
    public void save() {
        System.out.println("Doc saved successfully");
    }

    @Override
    public void load() {
        System.out.println("Doc loaded successfully");
    }

    void edit() {
        System.out.println("Doc edited successfully");
    }
}
