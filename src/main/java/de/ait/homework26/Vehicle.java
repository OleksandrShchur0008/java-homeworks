package de.ait.homework26;

public interface Vehicle {

    int MAX_SPEED = 100;

    void start();

    void stop();

    default void honk() {
        System.out.println("Vehicle Honking.");
    }

    default void repair() {
        System.out.println("Vehicle Repairing.");
    }

    default String getColor() {
        System.out.println("Black Color");
        return "black";
    }
}

