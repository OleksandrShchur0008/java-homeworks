package de.ait.homework04;

import java.util.Scanner;

public class homework25072023ex2 {

    //Задание 2: Напишите программу, которая принимает строку.
    // Если строка равна "Привет", программа должна ответить "Привет!".
    // Если строка равна "Пока", программа должна ответить "До встречи!".
    // Если строка не равна ни одному из этих вариантов, программа должна ответить "Я вас не понимаю".
    // Реализуйте это с помощью switch-case и if-else.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The chat");
        String input = scanner.nextLine();

        switch (input){
            case "Hello":
                System.out.println("Hello!");
                break;
            case "Bye":
                System.out.println("See you soon!");
                break;
            default:
                System.out.println("Sorry, I don't understand you(");
        }
        scanner.close();
    }
}
