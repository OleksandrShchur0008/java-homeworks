package de.ait.homework25;

public interface Runner {

    int MIN_RUN_DISTANCE = 100;

    void run();

    void jump();

    default void stretch() {
        System.out.println("Stretching before running.");
    }
}
