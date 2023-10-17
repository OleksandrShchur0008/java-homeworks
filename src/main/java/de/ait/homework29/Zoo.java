package de.ait.homework29;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private List<Animal> animalsList;

    public Zoo(List<Animal> animals) {
        this.animalsList = animals;
    }

    public void addAnimal(Animal newAnimal) {
        animalsList.add(newAnimal);
    }

    public void displayAllAnimals() {
        for(Animal animalsToDisplay : animalsList) {
            System.out.println(animalsToDisplay.displayInfo() + "\n");
        }
    }

    public List<Animal> sortAnimalsByName(List<Animal> animalsList, boolean asc) {
        if (asc) {
            Collections.sort(animalsList, Comparator.comparing(Animal::getName));
        } else {
            Collections.sort(animalsList, Comparator.comparing(Animal::getName).reversed());
        }
        return animalsList;
    }
}
