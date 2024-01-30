package de.ait.homework04;

import java.util.Scanner;

public class homework25072023ex1 {

    //Задание 1: Напишите программу, которая использует switch-case,
    // чтобы реализовать простой калькулятор.
    // Программа должна принимать два числа и операцию (+, -, *, /, ^),
    // а затем выполнять эту операцию и выводить результат.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your first number to calculate");
        double number1 = scanner.nextDouble();
        System.out.println("Write your second number to calculate");
        double number2 = scanner.nextDouble();
        System.out.println("Write your operator to calculate");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '^':
                System.out.println(Math.pow(number1, number2));
                break;
        }
        scanner.close();
    }
}
