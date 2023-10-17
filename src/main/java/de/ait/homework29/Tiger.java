package de.ait.homework29;

public class Tiger extends Predator implements Running, Roaring, Swimming {

    private String colorSkin;

    public Tiger(String name, int preyCaught, String colorSkin) {
        super(name, preyCaught);
        this.colorSkin = colorSkin;
    }

    @Override
    public String roar() {
        return "Tiger " + getName() + "is roaring";
    }

    @Override
    public String run() {
        return "Tiger " + getName() + "is running";
    }

    @Override
    public String swim() {
        return "Tiger " + getName() + "is swimming";
    }
}
