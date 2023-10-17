package de.ait.homework29;

public class Swan extends Bird implements Swimming, Flying, Running, Roaring {

    public Swan(String name, boolean canFly) {
        super(name, canFly);
    }

    @Override
    public String fly() {
        return "Swan " + getName() + "is Flying";
    }

    @Override
    public String roar() {
        return "Swan " + getName() + "is roaring";
    }

    @Override
    public String run() {
        return "Swan " + getName() + "is running";
    }

    @Override
    public String swim() {
        return "Swan " + getName() + "is swimming";
    }
}
