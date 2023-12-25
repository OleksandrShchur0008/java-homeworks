package de.ait.homework25;

public class Athlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println("My min running distance is " + MIN_RUN_DISTANCE);
    }

    @Override
    public void jump() {
        System.out.println("Jumping during the run.");
    }

    @Override
    public void swim() {
        System.out.println("My min swim distance is " + MIN_SWIM_DISTANCE);
    }

    @Override
    public void dive() {
        System.out.println("Diving into the water.");
    }
}
