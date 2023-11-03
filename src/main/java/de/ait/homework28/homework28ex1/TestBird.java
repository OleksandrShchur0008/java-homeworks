package de.ait.homework28.homework28ex1;

public class TestBird {
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
