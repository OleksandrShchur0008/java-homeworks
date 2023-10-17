package de.ait.homework28.homework28ex2;

public class Triangle extends Shape {

    private double side;

    @Override
    void area() {
        System.out.println("1/2 (b * h)");
    }

    @Override
    void perimeter() {
        System.out.println("a + b + c");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
