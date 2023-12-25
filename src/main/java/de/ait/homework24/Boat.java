package de.ait.homework24;

public class Boat implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Boat is sailing");
    }

    @Override
    public void stop() {
        System.out.println("Boat has anchored");
    }

    @Override
    public void fuelUp() {
        System.out.println("Boat is refueled");
    }

    void floatOnWater() {
        System.out.println("Boat is floating on water.");
    }
}
