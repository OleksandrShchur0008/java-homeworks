package de.ait.SoftwareCalculator;

public class Calculator {

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int sub(int num1, int num2) {
        return num1 - num2;
    }
//пример использование публичного метода чтобы добраться к приватному методу для тестирования
    public int makeOperation(int num1, int num2, String operation) {
        int result = 0;

        switch (operation) {
            case "add":
                result = add(num1,num2);
                break;
            case "sub":
                result = sub(num1,num2);
                break;
            default:
                System.out.println("Illegal function!");
                return -1;
        }
        return result;
    }
}
