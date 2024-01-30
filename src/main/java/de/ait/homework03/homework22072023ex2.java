package de.ait.homework03;

import java.util.Scanner;

public class homework22072023ex2 {

    //Задание 2: Нечетное или четное: Напишите программу, которая определяет, является ли
    // введенное число четным или нечетным. Используйте операторы "И" и "ИЛИ" для обработки
    // нескольких условий.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && number != 0) {
            System.out.println("Number " + number + " is even");
        } else if (number % 2 != 0) {
            System.out.println("Number " + number + " is odd");
        } else {
            System.out.println("This number equals zero");
        }
        scanner.close();
    }
}
