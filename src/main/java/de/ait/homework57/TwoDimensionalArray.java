package de.ait.homework57;

import java.util.Random;

public class TwoDimensionalArray {

    public static int[][] myIntArray = new int[5][5];

    public static Random random = new Random();

    public static int maxValueInArray = 0;

    public static double sumOfAllValuesInArray = 0;

    public static int counter = 0;

    public static double arithmeticMeanOfArray = 0;

    public static int[] valuesThatIsBiggerThenArithmeticMeanOfArray = new int[25];

    public static void main(String[] args) {

        //Создаю двумерный массив 5х5 с случайными значениями от 1 до 100.
        System.out.println("Random 2d Array 5x5: ");

        for (int i = 0; i < myIntArray.length; i++) {
            for (int j = 0; j < myIntArray[i].length; j++) {
                //Задаю для каждого элемента случайное значение с помощью класа Random.
                myIntArray[i][j] = random.nextInt(100) + 1;
                System.out.print(myIntArray[i][j] + " ");

                //Одновременно проверяю больше ли оно за значение задекларированной переменной.
                // Если да то сохранняю ее в переменную как максимальное значение
                if (myIntArray[i][j] > maxValueInArray) {
                    maxValueInArray = myIntArray[i][j];
                }
                //Сложение всех значений в одно
                sumOfAllValuesInArray += myIntArray[i][j];
                //Считаю количество значений в массиве
                counter++;

                if (myIntArray[i][j] > arithmeticMeanOfArray) {
                    valuesThatIsBiggerThenArithmeticMeanOfArray = new int[]{myIntArray[i][j]};
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Maximal values in Array is: " + maxValueInArray);
        System.out.println();
        System.out.println("The sum of all values in Array is: " + sumOfAllValuesInArray);
        arithmeticMeanOfArray = sumOfAllValuesInArray / counter;
        System.out.println("The arithmetic mean of all values in the Array is: " + arithmeticMeanOfArray);
        System.out.println();

        for (int i = 0; i < valuesThatIsBiggerThenArithmeticMeanOfArray.length; i++) {
            System.out.println(valuesThatIsBiggerThenArithmeticMeanOfArray[i]);
        }
    }
}

