package de.ait.homework28.homework28ex2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.area();
        shape.perimeter();
        shape = new Rectangle();
        shape.area();
        shape.perimeter();
        shape = new Triangle();
        shape.area();
        shape.perimeter();
    }
}
