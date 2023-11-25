package de.ait.homework50;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryFileCreator {
    //C:\Aufgaben\aithomeworks -> example
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryFileCreator.class);
    private static String beginText = "Enter path of directory to create it:";
    private static String directoryName = "MyDirectory";

    public static void main(String[] args) {
        System.out.println(beginText);
        Scanner scanner = new Scanner(System.in);
        String inputPathToCreate = scanner.nextLine();

        String path = inputPathToCreate + File.separator + directoryName;
        File directoryToCreate = new File(path);

        if (directoryToCreate.exists()) {
            LOGGER.warn("This directory already exists! -> " + path);
            System.out.println("This directory already exists! -> " + path);
        } else {
            boolean created = directoryToCreate.mkdir();
            if (created) {
                LOGGER.info("Directory {} has been successfully created.", path);
                System.out.println("Directory " + path + " has been successfully created.");
                createFileInDirectory(path, "MyFile.txt");
            } else {
                LOGGER.warn("Directory {} was not created!", path);
                System.out.println("Directory " + path + " was not created!");
            }
        }
    }

    private static boolean createFileInDirectory(String directory, String fileName) {
        File file = new File(directory + File.separator + fileName);
        try {
            boolean resultFileCreated = file.createNewFile();
            if(resultFileCreated) {
                LOGGER.info("File {} in directory {} was successfully created.", fileName, directory);
                return true;
            } else {
                LOGGER.warn("Cannot create file {} in directory {}!", fileName, directory );
                return false;
            }

        } catch (IOException e) {
            LOGGER.error("Exception while creating file {} in directory {} ", fileName, directory);
            return false;
        }
    }

    private static boolean deleteFileAndDirectory(File fileToDelete) {
        boolean result = fileToDelete.delete();
        if(result) {
            LOGGER.info("File {} was successfully deleted in directory {} ", fileToDelete.getName(), fileToDelete.getAbsolutePath());
        } else {
            LOGGER.warn("File {} was not deleted in directory {} ", fileToDelete.getName(), fileToDelete.getAbsolutePath());
        }

        return result;
    }
}
