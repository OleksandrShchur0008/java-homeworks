package de.ait.homework46;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class AccountRegistrationValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRegistrationValidator.class);

    private static String login;

    private static String password;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validateResult = false;

        while (!validateResult) {
            System.out.println("Enter your login: ");
            login = scanner.next();
            if (login.isEmpty()) {
                LOGGER.error("User name is empty");
                throw new IllegalArgumentException("User name cannot be empty!");
            }

            if (login.equalsIgnoreCase("Exit")) {
                LOGGER.info("Quited on stage enter login.");
                System.out.println("Quiting...");
                break;
            }

            System.out.println("Enter your password: ");
            password = scanner.next();

            if (password.equalsIgnoreCase("Exit")) {
                LOGGER.info("Quited on stage enter password.");
                System.out.println("Quiting...");
                break;
            }

            try {
                validateUserPassword(password);
                System.out.println("Registration successful.");
                LOGGER.info("Registration successful.");
                validateResult = true;
            } catch (IllegalArgumentException exception) {
                System.out.println("Error " + exception.getMessage());
                LOGGER.error("IllegalArgumentException");
            }

        }
        scanner.close();
    }

    public static void validateUserPassword(String password) {

        if (password.isEmpty()) {
            LOGGER.error("Password is empty");
            throw new IllegalArgumentException("Password cannot be empty!");
        }

        if (password.length() < 8) {
            LOGGER.error("Password is less than 8 symbols. Input password: {}", password);
            throw new IllegalArgumentException("Password must contain min 8 symbols!");
        }

        if (!password.matches(".*\\d.*")) {
            LOGGER.error("Password doesn't contain any number. Input password: {}", password);
            throw new IllegalArgumentException("Password must contain min one number.");
        }

        if (!password.matches(".*[!@#].*")) {
            LOGGER.error("Password doesn't contain any special symbol. Input password: {}", password);
            throw new IllegalArgumentException("Password must contain min one special symbol (ex. !, @, #).");
        }

    }
}
