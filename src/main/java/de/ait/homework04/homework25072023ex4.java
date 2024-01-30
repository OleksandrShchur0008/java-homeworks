package de.ait.homework04;

import java.util.Scanner;

public class homework25072023ex4 {

    //Задание 4* (Симулятор торговой машины): Напишите программу, которая симулирует торговую машину.
    // У вас есть продукты, такие как "Coca-Cola"(3 евро), "Water"(2 евро), "Chocolate"(5 евро).
    // Пользователь вводит название продукта и количество денег.
    // Если денег недостаточно, программа должна попросить пользователя внести больше денег.
    // Если денег достаточно, программа должна сказать "Вот ваш [товар] и ваша сдача [x] евро.".
    // Используйте switch-case и if-else для выполнения этой задачи.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your product: 1-Coca-Cola 2$, 2-Water 1.75$, 3-Chocolate 1.50$.");
        String product = scanner.nextLine();
        System.out.println("How much money do you have?");
        double inputtedAmount = scanner.nextInt();

        switch (product){
            case "1":
                if (inputtedAmount < 2 ){
                    System.out.println("Not enough money!");
                } else if (inputtedAmount == 2 ){
                    System.out.println("Here is your Coca-Cola");
                } else {
                    System.out.println("Here is your Coca-Cola " + product + ". Your rest " + (inputtedAmount - 2));
                }
                break;
            case "2":
                if (inputtedAmount < 1.75 ){
                    System.out.println("Not enough money!");
                } else if (inputtedAmount == 1.75 ){
                    System.out.println("Here is your Water");
                } else {
                    System.out.println("Here is your Water " + product + ". Your rest " + (inputtedAmount - 1.75));
                }
                break;
            case "3":
                if (inputtedAmount < 1.50 ){
                    System.out.println("Not enough money!");
                } else if (inputtedAmount == 1.50 ){
                    System.out.println("Here is your Chocolate");
                } else {
                    System.out.println("Here is your Chocolate " + product + ". Your rest " + (inputtedAmount - 1.50));
                }
                break;
        }
        scanner.close();
    }
}
