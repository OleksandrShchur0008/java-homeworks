package de.ait.testJavaIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CooperatorFromFileToFile {

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperatorFromFileToFile.class);

    public static void main(String[] args) {
        File firstFile = new File("C:/Aufgaben/aithomeworks/firstFile.txt");
        File secondFile = new File("C:/Aufgaben/aithomeworks/secondFile.txt");

        try {
            if (!firstFile.exists()) {
                boolean created = firstFile.createNewFile();
                if (created) {
                    LOGGER.info("File {} created successfully. Path {}", firstFile.getName(), firstFile.getAbsolutePath());
                }
            }
        } catch (IOException ioException) {
            LOGGER.error("File {} already exists. Path {}", firstFile.getName(), firstFile.getAbsoluteFile());
            throw new RuntimeException(ioException.getMessage());
        }

        try {
            if (!secondFile.exists()) {
                boolean created = secondFile.createNewFile();
                if (created) {
                    LOGGER.info("File {} created successfully. Path {}", secondFile.getName(), secondFile.getAbsolutePath());
                }
            }
        } catch (IOException ioException) {
            LOGGER.error("File {} already exists. Path {}", secondFile.getName(), secondFile.getAbsoluteFile());
            throw new RuntimeException(ioException.getMessage());
        }

        try (FileReader fileReader = new FileReader(firstFile);
             FileWriter fileWriter = new FileWriter(secondFile)) {

            writeTextFromFirstFileToSecondFile(fileReader, fileWriter);

        } catch (FileNotFoundException fileNotFoundException) {
            LOGGER.error("File not Found");

        } catch (IOException ioException) {
            LOGGER.error("IOException");

        }

    }
    public static void writeTextFromFirstFileToSecondFile(Reader reader, Writer writer) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String allTextInFile = bufferedReader.readLine();

        bufferedWriter.write(allTextInFile);
        bufferedWriter.flush();
        LOGGER.info("Text copied to chosen file");
    }
}
