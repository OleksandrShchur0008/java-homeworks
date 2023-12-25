package de.ait.homewrok61;

public class BartenderThread extends Thread {

    private String beverage;

    public BartenderThread(String beverage) {
        this.beverage = beverage;
    }

    public void run() {
        System.out.println("I'm making the " + beverage + ".");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
        System.out.println("Your " + beverage + " is ready!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
    }
}
