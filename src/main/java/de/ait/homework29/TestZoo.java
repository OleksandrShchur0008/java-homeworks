package de.ait.homework29;

import java.util.ArrayList;
import java.util.List;

public class TestZoo {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        Zoo zoo = new Zoo(animalsList);

        Animal birdPigeon = new Bird("Pigeoin (rare Orange)", true);
        Animal birdPenguin = new Bird("Penguin (Australian)", false);
        Animal birdOwl = new Bird("Owl (White)", true);
        Animal predatorLion = new Predator("Lion", 31);
        Animal predatorWolf = new Predator("Wolf", 4);
        Animal predatorAlligator = new Predator("Alligator", 9);
        Predator predatorTiger = new Tiger("Australian Tiger", 4,"grey");
        Bird birdSwan = new Swan("Lovely Swan", true);

        zoo.addAnimal(birdPigeon);
        zoo.addAnimal(birdPenguin);
        zoo.addAnimal(birdOwl);
        zoo.addAnimal(predatorLion);
        zoo.addAnimal(predatorWolf);
        zoo.addAnimal(predatorAlligator);
        zoo.addAnimal(predatorTiger);
        zoo.addAnimal(birdSwan);

        zoo.displayAllAnimals();

        System.out.println("---------------------------------After sorting by Name of Animal-------------------------------");

        zoo.sortAnimalsByName(animalsList, true);
        predatorTiger.setPreyCaught(5);
        zoo.displayAllAnimals();
    }
}

