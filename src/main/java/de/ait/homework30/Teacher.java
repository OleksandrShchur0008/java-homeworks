package de.ait.homework30;

public class Teacher extends Employee {

    private String subject;

    public Teacher(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    @Override
    public void doWork() {
        System.out.println("Im Mr/Mrs " + getName() + ".\nMy subject is " + getSubject() + ".");
    }

    public String getSubject() {
        return subject;
    }
}
