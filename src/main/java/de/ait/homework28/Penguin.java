package de.ait.homework28;

public class Penguin extends Bird {
    @Override
    public void takeOff() {
        System.out.println("I can't Take off (");
    }

    @Override
    public void land() {
        System.out.println("I'm landing on my Belly to slide )");
    }

    @Override
    public void fly() {
        System.out.println("Oh no I can't fly ");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating fish ");
    }

    @Override
    public void sleep() {
        System.out.println("I'm sleeping calmly");
    }

    @Override
    public void breath() {
        System.out.println("I'm breathing deeper then Eagle! )");
    }
}
