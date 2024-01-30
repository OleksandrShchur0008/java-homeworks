package de.ait.homework5;

import java.util.Scanner;

public class homework27072023ex4 {

    //Задание 4: Напишите программу, которая принимает на вход три числа и выводит true,
    // если они упорядочены в возрастающем или убывающем порядке.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Write your second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Write your third number: ");
        int thirdNum = scanner.nextInt();

        boolean True = true;
        boolean False = false;


        if (firstNum < secondNum && firstNum < thirdNum && secondNum < thirdNum) {
            System.out.println("The numbers are sorted in ascending order and its: " + True + " " + firstNum + " " + secondNum + " " + thirdNum);
        } else if (firstNum > secondNum && firstNum > thirdNum && secondNum > thirdNum) {
            System.out.println("The numbers are sorted in descending order and its: " + True  + " " + firstNum + " " + secondNum + " " + thirdNum);
        } else {
            System.out.println("The numbers are sorted in chaotic order and its: " + False + " " + firstNum + " " + secondNum + " " + thirdNum);
        }
        scanner.close();
    }
}
