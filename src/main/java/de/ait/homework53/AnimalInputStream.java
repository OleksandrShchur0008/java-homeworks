package de.ait.homework53;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnimalInputStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalInputStream.class);

    public static void readAnimalsFromFile(String file) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String animalLine;

            while ((animalLine = bufferedReader.readLine()) != null) {
                System.out.println(animalLine);
            }

        } catch (FileNotFoundException exception) {
            LOGGER.error("Error file not found : {}", exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error("Error reading file : {}", exception.getMessage());
        }
    }
}
