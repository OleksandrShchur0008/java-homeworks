package de.ait.homework53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimalWriterReader {

    private static final String PATH = "zooAnimals.txt";
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Animal kangarooAnimal = new Animal("Kangaroo", "Macropus", 9);
        Animal zebraAnimal = new Animal("Zebra", "Grevys", 15);
        Animal rhinoAnimal = new Animal("Rhino", "White", 22);

        animals = Arrays.asList(kangarooAnimal, zebraAnimal, rhinoAnimal);

        AnimalOutputStream.saveAnimalsInFile(animals, PATH);

        AnimalInputStream.readAnimalsFromFile(PATH);

    }
}
