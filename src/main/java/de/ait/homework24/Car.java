package de.ait.homework24;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    @Override
    public void fuelUp() {
        System.out.println("Car us fueled up");
    }

    void honk() {
        System.out.println("Honk! Honk!");
    }
}
