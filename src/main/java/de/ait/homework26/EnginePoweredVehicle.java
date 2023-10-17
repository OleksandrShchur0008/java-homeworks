package de.ait.homework26;

public class EnginePoweredVehicle implements Vehicle {

    private String engineType;

    public EnginePoweredVehicle(String engineType) {
        this.engineType = engineType;
    }

    public void showEngineType() {
        System.out.println("Engine Type: " + engineType);
    }

    @Override
    public void start() {
        System.out.println("Engine has launched. Type " + engineType);
    }

    @Override
    public void stop() {
        System.out.println("Engine has stopped. Type " + engineType);
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
