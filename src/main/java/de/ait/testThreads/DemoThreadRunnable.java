package de.ait.testThreads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoThreadRunnable implements Runnable {

    private Thread thread;

    private String threadName;

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoThreadRunnable.class);

    public DemoThreadRunnable(String threadName) {
        LOGGER.info("Creating {}", threadName );
        this.threadName = threadName;
    }

    @Override
    public void run() {
        LOGGER.info("Running {}", threadName );
        for (int i = 10; i > 0; i--) {
            try {
            LOGGER.info("Thread {} , {}", threadName, i);
                Thread.sleep(100);
            } catch (InterruptedException interruptedException) {
                LOGGER.error("Thread {} was dead. Exception --> {}", threadName, interruptedException);
            }
        }
    }

    public void start() {
        LOGGER.info("Started Thread {}", threadName);
        if(thread == null) {
            thread = new Thread(this, threadName);

        }
    }
}
