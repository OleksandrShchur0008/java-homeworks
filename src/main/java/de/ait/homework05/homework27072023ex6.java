package de.ait.homework05;

import java.util.Scanner;

public class homework27072023ex6 {

    //Задание 6: Напишите программу, которая принимает на вход трехзначное число и проверяет,
    // является ли это число "самовлюбленным" (самовлюбленное число в степени n равно самому себе;
    // например n=3, 153 = 1^3 + 5^3 + 3^3).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your three digit number to check if its narcissistic");
        int number = scanner.nextInt();
        int n = String.valueOf(number).length();

        if (n != 3) {
            System.out.println("error, not three digit number!");
        } else {






        }
        scanner.close();
    }
}
