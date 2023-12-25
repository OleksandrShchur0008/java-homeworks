package de.ait.homework2;

public class Test2 {
    public static void main(String[] args) {

        int age = 25;

        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершенолетний");
        }

        String firstName = "Oleksandr ";
        String lastName = "Shchur";
        String fullName = firstName + lastName;
        System.out.println("I am " + fullName);

        double num1 = 13.1;
        double num2 = 34.9;
        double num3 = 11.6;
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Среднее значение: " + average);
    }
}
