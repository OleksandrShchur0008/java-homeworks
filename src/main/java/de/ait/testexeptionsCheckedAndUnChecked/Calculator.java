package de.ait.testexeptionsCheckedAndUnChecked;

public class Calculator {
    //We are trying to catch Exceptions

    public static void divide(int numberOne, int numberTwo) {
        int result;
        System.out.println("Start...");

        try {
            result = numberOne / numberTwo;
        } catch (ArithmeticException exception) {
            System.out.println("Why dividing by 0???");
            System.out.println("exception -> " + exception);
            result = 0;
        }

        System.out.println(result);
        System.out.println("End.");
    }

    public static void divideSec(int numberOne, int numberTwo) {
        System.out.println("Start...");
        if(numberTwo == 0) {
            throw new ArithmeticException("Stop dividing by zero!");
        }
        int result = numberOne / numberTwo;
        System.out.println(result);
        System.out.println("End.");
    }

    public static void divideThird(int numberOne, int numberTwo) throws ArithmeticException {
        System.out.println("Start...");
        int result = numberOne / numberTwo;
        System.out.println(result);
        System.out.println("End.");
    }

    public static void main(String[] args) {
        //divide(10, 0);
        //divideSec(10,0);

        try {
            divideThird(10,0);
        } catch (ArithmeticException exception) {
            System.out.println("Sorry i didn't know that i " +
                    "" +
                    "" +
                    "" +
                    "have divided by zero.");
        }

    }
}
