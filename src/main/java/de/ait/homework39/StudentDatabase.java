package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

    private Set<Student> students;

    public StudentDatabase(Set<Student> students) {
        this.students = new HashSet<>();
    }

    //нет необходимости делать проверку на наличие студента так как HashSet не позволит добавить мне дубликат
    public void addStudent(Student student) {
        if (students.add(student)) {
            System.out.println("Student \"" + student.getName() + "\" successfully added into the database.");
        } else {
            System.out.println("Student \"" + student.getName() + "\" already exists in the database.");
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println("Student \"" + student.getName() + "\" successfully removed from the database.");
        } else {
            System.out.println("Student \"" + student.getName() + "\" to remove not found in database.");
            //throw new IllegalArgumentException("Student to remove not found in database.");
        }

    }

    public boolean containsStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student \"" + student.getName() + "\" is in database.");
            return true;
        } else {
            System.out.println("Student \"" + student.getName() + "\" not found");
            return false;
        }
    }

    public Set<Student> printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students here... (Database Empty).");
        } else {
            for (Student student : students) {
                System.out.println("Student - " + student.getName() +
                        ".\nID: " + student.getId() +
                        ".\nAge: " + student.getAge() +
                        ".\n");
            }
        }
        return new HashSet<>(students);
    }
}
