package de.ait.homework28;

public class BirdTest {
    public static void main(String[] args) {
        Bird birdEagle = new Eagle();
        birdEagle.takeOff();
        birdEagle.fly();
        birdEagle.breath();
        birdEagle.land();
        birdEagle.eat();
        birdEagle.sleep();
        System.out.println("----------");
        Bird birdPenguin = new Penguin();
        birdPenguin.takeOff();
        birdPenguin.fly();
        birdPenguin.breath();
        birdPenguin.land();
        birdPenguin.eat();
        birdPenguin.sleep();
    }
}
