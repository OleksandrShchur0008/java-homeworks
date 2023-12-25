package de.ait.homework3;

import java.util.Scanner;

public class homework22072023ex5 {

    //Задание 5: Напишите программу, которая принимает возраст пользователя и
    // выводит возрастную категорию:
    // ребенок (до 12 лет), подросток (13-18 лет), взрослый (19-59 лет), пожилой (60 лет и старше).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your age: ");
        int age = scanner.nextInt();

        if (age >= 1 && age <= 10) {
            System.out.println("You are child.");
        } else if (age >= 11 && age <= 17) {
            System.out.println("You are teenager.");
        } else if (age >= 18 && age <= 59) {
            System.out.println("You are adult.");
        } else if (age >= 60 && age <= 128) {
            System.out.println("You are senior.");
        } else {
            System.out.println("Please write your true age.");
        }
        scanner.close();
    }
}
