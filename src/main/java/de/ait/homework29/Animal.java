package de.ait.homework29;

abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String displayInfo();


    public String getName() {
        return name;
    }
}
