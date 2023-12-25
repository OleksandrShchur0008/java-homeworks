package de.ait.homework60;

public class Task implements Runnable {

    private Thread thread;

    private String threadName;

    public Task(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " task completed.");
    }
}
