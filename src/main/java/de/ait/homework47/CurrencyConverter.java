package de.ait.homework47;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConverter.class);

    private static double inputAmount;

    private static String originalCurrency;

    private static String targetCurrency;

    private static String info = "Min 1 Unit"; //по рекомендации SonarLint вынес в локальную переменную так как часто повторимая фраза
    private static String infoTwo = "Here is your "; //по рекомендации SonarLint вынес в локальную переменную так как часто повторимая фраза

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        while (!flag) {

            try {
                System.out.println("Enter amount to convert:    (numeric value).");
                inputAmount = scanner.nextDouble();
            } catch (InputMismatchException inputMismatchException) {
                flag = true;
                System.out.println("Please enter a numeric value. Error: " +
                        inputMismatchException.getMessage());
                LOGGER.error("Error: The entered value is not a numeric value. Entered: {}", inputAmount);
            }

            try {
                System.out.println("Enter original currency:    (USD, EUR, UAH).");
                originalCurrency = scanner.next();
            } catch (IllegalArgumentException illegalArgumentException) {
                flag = true;
                System.out.println("Please enter existent currency. Error: " +
                        illegalArgumentException.getMessage());
                LOGGER.error("Error: Non-existent currency code. Entered: {}", originalCurrency);
            }

            try {
                System.out.println("Enter target currency:      (USD, EUR, UAH).");
                targetCurrency = scanner.next();
            } catch (IllegalArgumentException illegalArgumentException) {
                flag = true;
                System.out.println("Please enter existent currency. Error: " +
                        illegalArgumentException.getMessage());
                LOGGER.error("Error: Non-existent currency code. Entered: {}", targetCurrency);
            }

            if (originalCurrency.equalsIgnoreCase("USD") &&
                    targetCurrency.equalsIgnoreCase("EUR")) {
                System.out.println(infoTwo + USDtoEUR(inputAmount) + " EUR.");
                flag = true;
            }
            if (originalCurrency.equalsIgnoreCase("USD") &&
                    targetCurrency.equalsIgnoreCase("UAH")) {
                System.out.println(infoTwo + USDtoUAH(inputAmount) + " UAH.");
                flag = true;
            }
            if (originalCurrency.equalsIgnoreCase("EUR") &&
                    targetCurrency.equalsIgnoreCase("USD")) {
                System.out.println(infoTwo + EURtoUSD(inputAmount) + " USD.");
                flag = true;
            }
            if (originalCurrency.equalsIgnoreCase("EUR") &&
                    targetCurrency.equalsIgnoreCase("UAH")) {
                System.out.println(infoTwo + EURtoUAH(inputAmount) + " UAH.");
                flag = true;
            }
            if (originalCurrency.equalsIgnoreCase("UAH") &&
                    targetCurrency.equalsIgnoreCase("USD")) {
                System.out.println(infoTwo + UAHtoUSD(inputAmount) + " USD.");
                flag = true;
            }
            if (originalCurrency.equalsIgnoreCase("UAH") &&
                    targetCurrency.equalsIgnoreCase("EUR")) {
                System.out.println(infoTwo + UAHtoEUR(inputAmount) + " EUR.");
                flag = true;
            }
        }
        scanner.close();
    }

    private static double USDtoEUR(double originalAmount) {
        double result = 0;
        if (originalAmount > 1) {
            result = originalAmount * 0.94;
        } else {
            throw new IllegalArgumentException(info);
        }
        LOGGER.info("USD converted to EUR; Received: {} USD. Given: {} EUR.", originalAmount, result);
        return result;
    }

    private static double USDtoUAH(double originalAmount) {
        double result = 0;
        if (originalAmount > 1) {
            result = originalAmount * 36.10;
        } else {
            throw new IllegalArgumentException(info);
        }
        LOGGER.info("USD converted to UAH; Received: {} USD. Given: {} UAH.", originalAmount, result);
        return result;
    }

    private static double EURtoUSD(double originalAmount) {
        double result = 0;
        if (originalAmount > 1) {
            result = originalAmount * 1.07;
        } else {
            throw new IllegalArgumentException(info);
        }
        LOGGER.info("EUR converted to USD; Received: {} EUR. Given: {} USD.", originalAmount, result);
        return result;
    }

    private static double EURtoUAH(double originalAmount) {
        double result = 0;
        if (originalAmount > 1) {
            result = originalAmount * 38.55;
        } else {
            throw new IllegalArgumentException(info);
        }
        LOGGER.info("EUR converted to UAH; Received: {} EUR. Given: {} UAH.", originalAmount, result);
        return result;
    }

    private static double UAHtoUSD(double originalAmount) {
        double result = 0;
        if (originalAmount > 1) {
            result = originalAmount * 0.028;
        } else {
            throw new IllegalArgumentException(info);
        }
        LOGGER.info("UAH converted to USD; Received: {} UAH. Given: {} USD.", originalAmount, result);
        return result;
    }

    private static double UAHtoEUR(double originalAmount) {
        double result = 0;
        if (originalAmount > 1) {
            result = originalAmount * 0.026;
        } else {
            throw new IllegalArgumentException(info);
        }
        LOGGER.info("UAH converted to EUR; Received: {} UAH. Given: {} EUR.", originalAmount, result);
        return result;
    }

}
