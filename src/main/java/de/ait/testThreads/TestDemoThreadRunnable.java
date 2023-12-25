package de.ait.testThreads;

public class TestDemoThreadRunnable {

    public static void main(String[] args) {
        DemoThreadRunnable demoThreadRunnable = new DemoThreadRunnable("PiPO");
        demoThreadRunnable.start();

        DemoThreadRunnable demoThreadRunnable1 = new DemoThreadRunnable("PaPI");
        demoThreadRunnable1.start();
    }
}
