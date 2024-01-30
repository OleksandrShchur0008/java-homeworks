package de.ait.homework05;

import java.util.Scanner;

public class homework27072023ex5 {

    //Задание 5:Напишите программу, которая принимает на вход число и проверяет, является ли оно
    // "счастливым" (счастливым числом считается число, сумма цифр в первой половине которого
    // равна сумме цифр во второй половине).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first number to check if your number is lucky: ");
        int luckyNum1 = scanner.nextInt();
        System.out.println("Write your second number to check if your number is lucky: ");
        int luckyNum2 = scanner.nextInt();
        System.out.println("Write your third number to check if your number is lucky: ");
        int luckyNum3 = scanner.nextInt();
        System.out.println("Write your fourth number to check if your number is lucky: ");
        int luckyNum4 = scanner.nextInt();

        int firstPart = luckyNum1 + luckyNum2;
        int secondPart = luckyNum3 + luckyNum4;

        if (firstPart == secondPart) {
            System.out.println("Woohoo your number is lucky!");
        } else if (firstPart != secondPart) {
            System.out.println("Unfortunately your number isn't lucky.");
        }
        scanner.close();
    }
}

