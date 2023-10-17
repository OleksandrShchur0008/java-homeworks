package de.ait.homework29;

public class Predator extends Animal implements Feeding {

    private int preyCaught;

    public Predator(String name, int preyCaught) {
        super(name);
        this.preyCaught = preyCaught;
    }

    @Override
    public String displayInfo() {
        return "Predator name: " + name + "\nNumber of prey caught: " + preyCaught + "\n" + eat();
    }

    @Override
    public String eat() {
        return name + " - eats prey.";
    }


    public int getPreyCaught() {
        return preyCaught;
    }

    public void setPreyCaught(int preyCaught) {
        this.preyCaught = preyCaught;
    }
}
