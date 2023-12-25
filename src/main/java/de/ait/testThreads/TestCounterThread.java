package de.ait.testThreads;

public class TestCounterThread {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);

        counterThread.start();
        counterThread2.start();

        counterThread.join();
        counterThread2.join();

        System.out.println("Counter --> " + counter.getCount());
    }
}
