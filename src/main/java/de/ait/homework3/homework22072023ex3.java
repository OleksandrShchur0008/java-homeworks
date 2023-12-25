package de.ait.homework3;

import java.util.Scanner;

public class homework22072023ex3 {

    //Задание 3: Промежутки чисел: Напишите программу, которая проверяет, находится ли
    // введенное число в определенном диапазоне. Например, вы можете проверить,
    // является ли число отрицательным, положительным или нулевым, используя логические операторы.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number " + number + " is zero");
        }
        if (number > 0) {
            System.out.println("Number " + number + " is positive");
        }
        if (number < 0) {
            System.out.println("Number " + number + " is negative");
        }
        scanner.close();
    }
}

