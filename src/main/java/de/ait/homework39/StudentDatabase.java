package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

    private Set<Student> students;

    public StudentDatabase(Set<Student> students) {
        this.students = new HashSet<>();
    }

    //нет необходимости делать проверку на наличие студента так как HashSet не позволит добавить мне дубликат
    public boolean addStudent(Student newStudent) {
        if(newStudent == null){
            return false;
        }
        if (students.add(newStudent)) {
            System.out.println("Student \"" + newStudent.getName() + "\" successfully added into the database.");
            return true;
        } else {
            System.out.println("Student \"" + newStudent.getName() + "\" already exists in the database.");
            return false;
        }
    }

    public boolean removeStudent(Student deleteStudent) {
        if (students.contains(deleteStudent)) {
            students.remove(deleteStudent);
            System.out.println("Student \"" + deleteStudent.getName() + "\" successfully removed from the database.");
            return true;
        } else {
            System.out.println("Student \"" + deleteStudent.getName() + "\" to remove not found in database.");
            //throw new IllegalArgumentException("Student to remove not found in database.");
            return false;
        }

    }

    public boolean containsStudent(Student checkStudent) {
        if (students.contains(checkStudent)) {
            System.out.println("Student \"" + checkStudent.getName() + "\" is in database.");
            return true;
        } else {
            System.out.println("Student \"" + checkStudent.getName() + "\" not found");
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
