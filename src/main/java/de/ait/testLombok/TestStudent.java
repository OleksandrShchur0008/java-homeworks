package de.ait.testLombok;

public class TestStudent {
    static StudentLombok studentLombok = new StudentLombok("Max", "Mustermann");

    public static void main(String[] args) {
        System.out.println(studentLombok.getFirstName());
        System.out.println(studentLombok.getSecondName());
        studentLombok.setFirstName("Misha");
        System.out.println(studentLombok.getFirstName());
        studentLombok.getInfo();
    }
}
