package de.ait.homework25;

public interface Swimmer {

    int MIN_SWIM_DISTANCE = 25;

    void swim();

    void dive();

    default void warmUp() {
        System.out.println("Warming up before swimming.");
    }
}
