package de.ait.homewrok61;

public class SommelierThread extends Thread {

    private String wine;

    public SommelierThread(String wine) {
        this.wine = wine;
    }

    @Override
    public void run() {
        System.out.println("Choosing some wine...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
        System.out.println("The wine " + wine + " chosen.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ERROR -> " + e.getMessage());
        }
    }
}
