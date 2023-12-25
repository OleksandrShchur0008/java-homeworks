package de.ait.homework3;

import java.util.Scanner;

public class homework22072023ex1 {

    //Задание 1: Напишите программу, которая получает на вход два числа и выводит большее из них.
    // Используйте логические операторы в вашем условии.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The first number is bigger then second: " + num1);
        } else if (num1 == num2) {
            System.out.println("The first number is equal to second number: " + num1);
        } else {
            System.out.println("The second number is bigger then first: " + num2);
        }
        scanner.close();
    }
}
