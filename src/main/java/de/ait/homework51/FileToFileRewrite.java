package de.ait.homework51;

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

public class FileToFileRewrite {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileToFileRewrite.class);
    private static String pathSource = "C:/Users/AIT TR Student/OneDrive/Рабочий стол/AIT TR/test/source.txt";
    private static String pathDestination = "C:/Users/AIT TR Student/OneDrive/Рабочий стол/AIT TR/test/destination.txt";

    public static void main(String[] args) {

        File sourceFile = new File(pathSource);

        try {
            if (!sourceFile.exists()) {
                boolean created = sourceFile.createNewFile();
                if (created) {
                    LOGGER.info("File {} created successfully. Path {}", sourceFile.getName(), sourceFile.getAbsolutePath());
                    System.out.println("File created successfully");
                }
            }
        } catch (IOException e) {
            LOGGER.warn("Impossible to create file. ALREADY EXISTS");
            throw new RuntimeException(e);
        }

        File destinationFile = new File(pathDestination);

        try {
            if (!destinationFile.exists()) {
                boolean created = destinationFile.createNewFile();
                if (created) {
                    LOGGER.info("File {} created successfully. Path {}", destinationFile.getName(), destinationFile.getAbsolutePath());
                    System.out.println("File created successfully");
                }
            }
        } catch (IOException ioException) {
            LOGGER.error("Impossible to create file. ALREADY EXISTS! {}", ioException.getMessage());

            throw new RuntimeException(ioException);
        }

        try (FileReader fileReader = new FileReader(pathSource);
             FileWriter fileWriter = new FileWriter(pathDestination)) {

            writeReverseTextToFile(fileReader, fileWriter);

        } catch (FileNotFoundException fileNotFoundException) {
            LOGGER.error("File not Found {}", fileNotFoundException.getMessage());

        } catch (IOException ioException) {
            LOGGER.error("Error processing files {}", ioException.getMessage());

        }


    }

    public static void writeReverseTextToFile(Reader reader, Writer writer) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\\s+");

            for (int i = 0; i < words.length; i++) {
                String reversedWord = reverseString(words[i]);
                bufferedWriter.write(reversedWord);
                bufferedWriter.write(" ");
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        LOGGER.info("Rewriting successful");
    }

    public static String reverseString(String wordToReverse) {
        char[] lettersArray = new char[wordToReverse.length()];

        for (int i = 0, j = wordToReverse.length() - 1; i <= j; i++, j--) {
            lettersArray[i] = wordToReverse.charAt(j);
            lettersArray[j] = wordToReverse.charAt(i);
        }
        LOGGER.info("Word {} successful operated", wordToReverse);
        String wordToReturn = new String(lettersArray);
        return wordToReturn;
    }
}


