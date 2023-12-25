package de.ait.homewrok61;

public class TeaMasterThread extends Thread {

    private String typeOfTea;

    public TeaMasterThread(String typeOfTea) {
        this.typeOfTea = typeOfTea;
    }

    @Override
    public void run() {
        System.out.println("Brewing " + typeOfTea + " Tea...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
        System.out.println("Your " + typeOfTea + " Tea is ready!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
    }
}
