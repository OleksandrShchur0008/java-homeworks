package de.ait.homework53;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AnimalOutputStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalOutputStream.class);

    public static void saveAnimalsInFile(List<Animal> animalsToSave, String file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (Animal animal : animalsToSave) {
                fileWriter.write(animal.toString() + "\n");
            }

        } catch (IOException exception) {
            LOGGER.error("Error writing in file : {}", exception.getMessage());
        }
    }
}
