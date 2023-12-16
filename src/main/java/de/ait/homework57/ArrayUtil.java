package de.ait.homework57;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ArrayUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayUtil.class);

    public static void main(String[] args) {
        int [][] myArray = createArray(5,5);
        System.out.println(findMaxValue(myArray));
        System.out.println(findAverage(myArray));
        showElementsGraterThen(myArray, 50);
    }

    public static int [][] createArray(int lineSize, int cologneSize) {
        if (lineSize <= 0 || cologneSize <= 0) {
            LOGGER.error("Wrong value in method {} {}", lineSize, cologneSize);
            throw new NumberFormatException("Wrong value in method");
        }
        int [][] arrayToReturn = new int[lineSize][cologneSize];
        Random random = new Random();
        for (int i = 0; i < arrayToReturn.length; i++) {
            for (int y = 0; y < arrayToReturn[i].length; y++) {
                int randomInt = random.nextInt(100) + 1;;
                arrayToReturn[i][y] = randomInt;
                LOGGER.info("ArrayToReturn Position {}-{} Value = {}", i, y, randomInt);
            }
        }
        return arrayToReturn;
    }

    public static int findMaxValue (int [][] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if (array[i][y] > maxValue) {
                    maxValue = array[i][y];
                }
            }
        }
        LOGGER.info("Max value - {}", maxValue);
        return maxValue;
    }

    public static double findAverage(int [][] array) {
        double sum = 0;
        int count = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                count++;
                sum += array[i][y];
            }
        }
        LOGGER.info("Sum - {}", sum);
        LOGGER.info("Elements - {}", count);
        average = sum/count;
        LOGGER.info("Average - {}", average);
        return average;
    }

    public static void showElementsGraterThen(int [][] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if (array[i][y] > 50) {
                    System.out.print(array[i][y] + " ");
                }
            }
        }
    }
}
