package de.ait.homework60;

public class TestTask {

    public static void main(String[] args) {

        Task task1 = new Task("First");
        Task task2 = new Task("Second");
        Task task3 = new Task("Third");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        MyTask myTask1 = new MyTask();
        Thread threadMyTask1 = new Thread(myTask1);
        threadMyTask1.start();

        MyTask myTask2 = new MyTask();
        Thread threadMyTask2 = new Thread(myTask2);
        threadMyTask2.start();
    }
}
