package de.ait.homework28.homework28ex2;

abstract class Shape {

    private String color;

    abstract void area();
    abstract void perimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
