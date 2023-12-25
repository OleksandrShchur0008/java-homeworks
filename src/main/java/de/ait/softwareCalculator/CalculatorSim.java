package de.ait.softwareCalculator;

public class CalculatorSim {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Unacceptable! Dividing by zero");
            return -1;
        } else {
            return (double) a / b;
        }
    }


}
