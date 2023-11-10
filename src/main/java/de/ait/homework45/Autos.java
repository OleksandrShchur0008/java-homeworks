package de.ait.homework45;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Autos {
    private static final Logger LOGGER = LoggerFactory.getLogger(Autos.class);
    private static String[] arrayAutos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        arrayAutos = new String[]{"BMW", "Mercedes", "Volkswagen", "Porsche", "Audi", "Opel"};

        boolean flag = false;
        while (!flag) {
            System.out.println("Enter index of element to extract: ");

            String input = null;
            int inputUserIndex = 0;

            try {
                input = scanner.nextLine();
                inputUserIndex = Integer.parseInt(input);

                String extractedUserElement = safeArrayElementExtraction(arrayAutos, inputUserIndex);
                LOGGER.info("Extracted element is {} ", extractedUserElement);

                flag = true;

            } catch (NumberFormatException exceptionNotNumber) {
                LOGGER.error("Error. Not an index. Input {}", input);
            } catch (ArrayIndexOutOfBoundsException exceptionOutOfBounds) {
                LOGGER.error("Error. Index out of bounds. Input {}", input);
            }
            finally {
                System.out.println("Operation ended.");
            }
        }
        LOGGER.info("Quitting...");
        scanner.close();
    }

    public static String safeArrayElementExtraction(String[] array, int index) {
        return array[index];
    }
}
