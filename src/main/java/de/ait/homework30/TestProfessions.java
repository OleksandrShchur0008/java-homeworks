package de.ait.homework30;

public class TestProfessions {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Smith", 45, 4100, "Surgeon");
        Engineer engineer = new Engineer("Larry", 30, 3400, "Software Development");
        Teacher teacher = new Teacher("Rick", 38, 3200, "History");

        doctor.doWork();
        System.out.println("----------");
        engineer.doWork();
        System.out.println("----------");
        teacher.doWork();

    }

}
