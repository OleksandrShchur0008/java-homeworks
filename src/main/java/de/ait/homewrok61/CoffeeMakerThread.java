package de.ait.homewrok61;

public class CoffeeMakerThread extends Thread {

    public void run() {
        System.out.println("Grinding Coffee...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println("ERROR while Grinding Coffee -> " + e.getMessage());
        }
        System.out.println("Brewing Coffee...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println("ERROR while Brewing Coffee -> " + e.getMessage());
        }
        System.out.println("Your Coffee is ready!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
    }
}
