package de.ait.homework05;

import java.util.Scanner;

public class homework27072023ex3 {

    //Задание 3: Напишите программу, которая проверяет, делится ли одно заданное число
    // на другое без остатка.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Write your second number: ");
        double secondNum = scanner.nextDouble();

        double result = (firstNum/secondNum);

        if (secondNum == 0){
            System.err.println("You cannot divide by 0!");
        } else if ((firstNum % secondNum) %2 == 0){
            System.out.println("You have number without remainder: " + result);
        } else {
            System.out.println("You have number with remainder: " + result);
        }
        scanner.close();
    }
}
