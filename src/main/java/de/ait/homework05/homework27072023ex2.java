package de.ait.homework05;

import java.util.Scanner;

public class homework27072023ex2 {

    //Задание 2: Напишите программу, которая принимает три числа и выводит true,
    // если сумма квадратов первых двух равна квадрату третьего.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Write your second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Write your third number: ");
        int thirdNum = scanner.nextInt();

        int sum1 = firstNum * firstNum + secondNum * secondNum;
        int sum2 = thirdNum * thirdNum;

        boolean result = false;

        if (sum1 == sum2) {
            result = true;
        }
        System.out.println(result);
        scanner.close();
    }
}

