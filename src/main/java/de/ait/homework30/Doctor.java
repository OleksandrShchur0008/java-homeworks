package de.ait.homework30;

public class Doctor extends Employee {

    private String specialization;

    public Doctor(String name, int age, double salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    @Override
    public void doWork() {
        System.out.println("Im Dr. " + getName() + ".\nMy specialization is " + getSpecialization() + ".");
    }

    public String getSpecialization() {
        return specialization;
    }
}
