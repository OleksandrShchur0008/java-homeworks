package de.ait.homework28.homework28ex2;

public class Circle extends Shape {

    private double radius;

    @Override
    void area() {
        System.out.println("3.14 * r^2");
    }

    @Override
    void perimeter() {
        System.out.println("(2 * 3.14) * r");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
