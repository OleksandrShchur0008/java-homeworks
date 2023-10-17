package de.ait.SoftwareZoo;

abstract class Pet {
    String name;

    abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
