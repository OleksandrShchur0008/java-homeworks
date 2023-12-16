package de.ait.homework59;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    private double GPA;

    public Student(String firstName, String lastName, int age, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student - " + firstName +
                " " + lastName +
                ", " + age +
                " years old , GPA --> " + GPA;
    }
}
