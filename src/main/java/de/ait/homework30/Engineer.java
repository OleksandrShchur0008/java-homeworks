package de.ait.homework30;

public class Engineer extends Employee {

    private String projectName;

    public Engineer(String name, int age, double salary, String projectName) {
        super(name, age, salary);
        this.projectName = projectName;
    }

    @Override
    public void doWork() {
        System.out.println("Im Mr/Mrs " + getName() + ".\nRight now im working on my project - \"" + getProjectName() + "\".");

    }

    public String getProjectName() {
        return projectName;
    }
}
