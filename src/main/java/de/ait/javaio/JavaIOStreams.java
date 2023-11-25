package de.ait.javaio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JavaIOStreams {

    private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOStreams.class);

    private static final String PATH = "C:/Aufgaben/aithomeworks/password.txt";

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream(PATH);
            LOGGER.info("File was founded.");
            inputStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            LOGGER.error("File {} Not Found Exception: {}.", PATH, fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            LOGGER.error("Error with stream closing: {}.", ioException.getMessage());
        }
    }
}
