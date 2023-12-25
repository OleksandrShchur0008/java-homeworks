package de.ait.homework3;

import java.util.Scanner;

public class homework22072023ex6 {

    //Задание 6*: Напишите программу, которая определяет знак зодиака, исходя из
    // даты рождения пользователя. Знак зодиака определяется по диапазону дат,
    // поэтому вам потребуется использовать логические операторы для определения
    // правильного знака зодиака.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write only number of your day of birth: ");
        int day = scanner.nextInt();
        System.out.println("Write only number of your month of birth: ");
        int month = scanner.nextInt();

        String sign1 = "Aries(Ram)";
        String sign2 = "Taurus(Bull)";
        String sign3 = "Gemini(Twins)";
        String sign4 = "Cancer(Crab)";
        String sign5 = "Leo(Lion)";
        String sign6 = "Virgo(Virgin)";
        String sign7 = "Libra(Balance)";
        String sign8 = "Scorpius(Scorpion)";
        String sign9 = "Sagittarius(Archer)";
        String sign10 = "Capricornus(Goat)";
        String sign11 = "Aquarius(Water bearer)";
        String sign12 = "Pisces(Fish)";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println(sign1);
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.println(sign2);
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            System.out.println(sign3);
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            System.out.println(sign4);
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 21)) {
            System.out.println(sign5);
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println(sign6);
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            System.out.println(sign7);
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 21)) {
            System.out.println(sign8);
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println(sign9);
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.println(sign10);
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.println(sign11);
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            System.out.println(sign12);
        }
        scanner.close();
    }
}
