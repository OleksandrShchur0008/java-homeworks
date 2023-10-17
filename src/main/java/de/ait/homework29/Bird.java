package de.ait.homework29;

public class Bird extends Animal implements Feeding {

    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public String displayInfo() {
        return "Birds name: " + name + "\nThis bird flies - " + canFly + "\n" + eat();
    }

    @Override
    public String eat() {
        return name + " - are bites Grains.";
    }

    public boolean isCanFly() {
        return canFly;
    }

}
