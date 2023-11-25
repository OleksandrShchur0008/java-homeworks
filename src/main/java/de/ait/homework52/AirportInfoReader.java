package de.ait.homework52;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AirportInfoReader {
    private static final Logger LOGGER = LoggerFactory.getLogger(AirportInfoReader.class);
    private static final String PATH = "C:/Aufgaben/aithomeworks/airports.txt";

    public static void main(String[] args) {

        File airports = new File(PATH);
        createFile(airports);


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(airports))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ", 3);
                if (words.length == 3) {
                    String airportName = words[0];
                    String codeIATA = words[1];
                    String country = words[2];
                    System.out.println("Airport name: " + airportName +
                            ".\nIATA: " + codeIATA +
                            ".\nCountry: " + country + "\n");
                }
            }

        } catch (FileNotFoundException fileNotFoundException) {
            LOGGER.error("File {} not found.", airports.getName());
        } catch (IOException ioException) {
            LOGGER.error("Error reading file. File {}. Path {}", airports.getName(), airports.getAbsoluteFile());
        }
    }


    public static void createFile(File file) {
        try {
            if (!file.exists()) {
                boolean created = file.createNewFile();
                if (created) {
                    LOGGER.info("File {} created successfully. Path {}", file.getName(), file.getAbsolutePath());
                }
            }
        } catch (IOException ioException) {
            LOGGER.error("File {} already exists. Path {}", file.getName(), file.getAbsoluteFile());
        }
    }
}
