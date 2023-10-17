package de.ait.homework26;

public class Car extends EnginePoweredVehicle implements Vehicle {

    public static final int MAX_SPEED_CAR = 250;

    private String model;

    public Car(String model, String engineType) {
        super(engineType);
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("The car is driving. The max speed is: " + MAX_SPEED_CAR);
        System.out.println("speed difference " + (MAX_SPEED - MAX_SPEED_CAR));
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }

    @Override
    public void honk() {
        System.out.println("BEEP-BEEP!");;
    }

    @Override
    public void repair() {
        System.out.println("Car is Repairing.");;
    }

    @Override
    public String getColor() {
        return "red";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
