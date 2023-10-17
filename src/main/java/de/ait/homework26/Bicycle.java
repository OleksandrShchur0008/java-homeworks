package de.ait.homework26;

public class Bicycle implements Vehicle {

    public static final int MAX_SPEED_BICYCLE = 35;

    @Override
    public void start() {
        System.out.println("The bicycle is riding. The max speed is: " + MAX_SPEED_BICYCLE);
    }

    @Override
    public void stop() {
        System.out.println("The bicycle has stopped.");
    }

    @Override
    public void honk() {
        System.out.println("SHMACK-SHMACK!");;
    }

    @Override
    public void repair() {
        System.out.println("Bicycle is Repairing.");;
    }

    @Override
    public String getColor() {
        return "white";
    }
}
