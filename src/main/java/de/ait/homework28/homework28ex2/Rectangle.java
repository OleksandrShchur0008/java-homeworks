package de.ait.homework28.homework28ex2;

public class Rectangle extends Shape {

    private double side;

    @Override
    void area() {
        System.out.println("a * b");
    }

    @Override
    void perimeter() {
        System.out.println("P = (L + W) * 2");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
