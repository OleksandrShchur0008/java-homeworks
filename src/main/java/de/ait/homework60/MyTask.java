package de.ait.homework60;

public class MyTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("IllegalArgumentException -> " + illegalArgumentException.getMessage());
            } catch (InterruptedException interruptedException) {
                System.out.println("InterruptedException -> " + interruptedException.getMessage());
            }
        }
    }
}
