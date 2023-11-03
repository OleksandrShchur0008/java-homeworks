package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class TestStudentDatabase {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        StudentDatabase studentDatabase = new StudentDatabase(students);
        Student studentDima = new Student("Dmytro", 18);
        Student studentShoni = new Student("Oleksandr", 17);
        Student studentSasha = new Student("Oleksandr", 18);
        Student studentNikita = new Student("Nikita", 17);
        Student studentSlavik = new Student("Yaroslav", 17);

        studentDatabase.addStudent(studentDima);
        studentDatabase.addStudent(studentShoni);
        studentDatabase.addStudent(studentSasha);
        studentDatabase.addStudent(studentNikita);
        System.out.println("-----------");

        //проверка на добавление уже существующего студента в список
        studentDatabase.addStudent(studentDima);
        System.out.println("-----------");

        studentDatabase.removeStudent(studentSasha);
        System.out.println("-----------");

        //проверка на удаление несуществующего студента в списке
        studentDatabase.removeStudent(studentSlavik);
        System.out.println("-----------");

        studentDatabase.containsStudent(studentNikita);
        System.out.println("-----------");

        //проверка на наличие несуществующего студента в списке
        studentDatabase.containsStudent(studentSlavik);
        System.out.println("-----------");

        studentDatabase.printAllStudents();
        System.out.println("-----------");

        studentDatabase.removeStudent(studentDima);
        studentDatabase.removeStudent(studentSasha);
        studentDatabase.removeStudent(studentShoni);
        studentDatabase.removeStudent(studentNikita);
        System.out.println("-----------");

        studentDatabase.printAllStudents();

    }
}
