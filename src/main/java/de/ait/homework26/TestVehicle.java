package de.ait.homework26;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicleCar = new Car("Audi A8", "Gasoline");
        vehicleCar.start();
        System.out.println("Taking his max... : " + Car.MAX_SPEED_CAR);
        vehicleCar.honk();
        vehicleCar.stop();
        vehicleCar.repair();
        System.out.println(vehicleCar.getColor());
        System.out.println("-----");

        Vehicle vehicleBicycle = new Bicycle();
        vehicleBicycle.start();
        System.out.println("Taking his max... : " + Bicycle.MAX_SPEED_BICYCLE);
        vehicleBicycle.honk();
        vehicleBicycle.stop();
        vehicleBicycle.repair();
        System.out.println(vehicleBicycle.getColor());
        System.out.println("-----");

        ElectricCar electricCar = new ElectricCar(2000);
        electricCar.showEngineType();
        System.out.println(electricCar.getAkkuValue());
        electricCar.setAkkuValue(4000);
        System.out.println(electricCar.getAkkuValue());
        Vehicle vehicleElectricCar = new ElectricCar(2500);

        System.out.println("----------------------------ARRYLIST-----------------------------");
        Vehicle[] vehicles = {vehicleCar, vehicleBicycle, vehicleElectricCar};
        for(int i = 0; i < vehicles.length; i++) {
            vehicles[i].start();
            vehicles[i].honk();
            vehicles[i].stop();
            System.out.println("__________________");
        }

    }
}
