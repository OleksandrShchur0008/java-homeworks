package de.ait.homework04;

import java.util.Random;
import java.util.Scanner;

public class homework25072023ex3 {

    //Задание 3: Разработайте "игру угадай число".
    // Компьютер "загадывает" число от 1 до 5, и пользователь должен угадать это число.
    // Если пользователь вводит число, которое больше загаданного, программа выводит "слишком большое".
    // Если пользователь вводит число, которое меньше загаданного, программа выводит "слишком маленькое".
    // Если пользователь угадывает число, программа выводит "Поздравляем, вы угадали число!".
    // Используйте if-else для сравнения чисел.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guess the number from 1 to 5");
        int myNumber = random.nextInt(5) + 1;
        int guess = scanner.nextInt();

        if (guess == myNumber) {
            System.out.println("Congrats! You guessed the number!");
        }else {
            System.out.println("Unfortunately it's not my number!");
        }
    }
}
