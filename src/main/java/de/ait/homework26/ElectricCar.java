package de.ait.homework26;

public class ElectricCar extends EnginePoweredVehicle {

    public static final int MAX_SPEED = 220;

    private int akkuValue;

    public ElectricCar(int akkuValue) {
        super("Electric engine");
        this.akkuValue = akkuValue;
    }

    @Override
    public void start() {
        System.out.println("The E-car is driving. The max speed is: " + MAX_SPEED);
    }

    @Override
    public void stop() {
        System.out.println("The E-car has stopped.");
    }

    @Override
    public void honk() {
        System.out.println("ZEEP-ZEEP!");;
    }

    @Override
    public void repair() {
        System.out.println("E-car is Repairing.");;
    }

    @Override
    public void showEngineType() {
        System.out.println("Engine Type: " + super.getEngineType()
                + ". Accumulator capacity: " + akkuValue);
    }

    public int getAkkuValue() {
        return akkuValue;
    }

    public void setAkkuValue(int akkuValue) {
        this.akkuValue = akkuValue;
    }
}
