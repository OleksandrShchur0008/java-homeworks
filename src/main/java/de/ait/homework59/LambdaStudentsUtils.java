package de.ait.homework59;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaStudentsUtils {

    public static void main(String[] args) {

        Student student1 = new Student("Tyrese","Haliburton", 20, 1.6);
        Student student2 = new Student("Kyle","Lowry", 19,3.3);
        Student student3 = new Student("Steve", "Madden", 21,2.3);
        Student student4 = new Student("Ryan", "Gosling", 21,1.9);
        Student student5 = new Student("Anthony", "Joshua", 20,4.5);
        Student student6 = new Student("Bronny", "James", 19,4.1);

        List<Student> studentsList = Arrays.asList(student1,student2,student3,student4,student5,student6);
        double certainValue = 4.0;

        List<Student> filteredStudentsByGPA =
                studentsList.stream().filter(student -> student.getGPA() >= certainValue).toList();

        System.out.println("Students with average more than 4.0:");
        filteredStudentsByGPA.forEach(System.out::println);
        System.out.println();


        studentsList.sort(Comparator.comparing(Student::getLastName));
        System.out.println("Students sorted by their last name: ");
        studentsList.forEach(System.out::println);
        System.out.println();


        List<String> studentsFirstName = studentsList.stream().map(Student::getFirstName).toList();
        System.out.println("Students by their first name: ");
        studentsFirstName.forEach(System.out::println);
        System.out.println();


        int certainValueAge = 20;
        long studentsOlderThen20 = studentsList.stream().filter(student -> student.getAge() > certainValueAge).count();
        System.out.println("Quantity of students that are older then 20 years - " + studentsOlderThen20);


        Optional<Student> maxGPA = studentsList.stream().max(Comparator.comparingDouble(Student::getGPA));
        Optional<Student> minGPA = studentsList.stream().min(Comparator.comparingDouble(Student::getGPA));

        maxGPA.ifPresent(student ->
                System.out.println("MAX GPA has " + student.getFirstName() + " " + student.getLastName() + " - " + student.getGPA()));
        minGPA.ifPresent(student ->
                System.out.println("MIN GPA has " + student.getFirstName() + " " + student.getLastName() + " - " + student.getGPA()));

    }
}
