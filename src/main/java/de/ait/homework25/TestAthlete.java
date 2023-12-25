package de.ait.homework25;

public class TestAthlete {

    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        athlete.warmUp();
        athlete.swim();
        athlete.dive();
        System.out.println();
        athlete.stretch();
        athlete.run();
        athlete.jump();
    }
}
