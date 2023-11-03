package de.ait.homework28.homework28ex1;

public class Eagle extends Bird {
    @Override
    public void takeOff() {
        System.out.println("I'm Taking off epically ");
    }

    @Override
    public void land() {
        System.out.println("I'm Landing carefully ");
    }

    @Override
    public void fly() {
        System.out.println("I'm Flew for a long time ");
    }

    @Override
    public void eat() {
        System.out.println("I'm Eating some bug or beetle ");
    }

    @Override
    public void sleep() {
        System.out.println("I'm Sleeping silently ");
    }

    @Override
    public void breath() {
        System.out.println("I'm Breathing deeply ");
    }
}
