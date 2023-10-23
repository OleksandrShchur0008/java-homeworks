package de.ait.homework39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentDatabaseTest {

    private Set<Student> students;

    private StudentDatabase studentDatabase;

    private Student studentDima;
    private Student studentShoni;
    private Student studentSasha;
    private Student studentNikita;
    private Student studentSlavik;

    @BeforeEach
    void setUp() {
        students = new HashSet<>();
        studentDatabase = new StudentDatabase(students);
        studentDima = new Student("Dmytro", 18);
        studentShoni = new Student("Oleksandr", 17);
        studentSasha = new Student("Oleksandr", 18);
        studentNikita = new Student("Nikita", 17);
        studentSlavik = new Student("Yaroslav", 17);
        assertEquals(0, studentDatabase.printAllStudents().size());
    }

    @Test
    void addStudentHappyPath() {
        studentDatabase.addStudent(studentNikita);
        studentDatabase.addStudent(studentSasha);
        studentDatabase.addStudent(studentSlavik);
        studentDatabase.addStudent(studentShoni);
        studentDatabase.addStudent(studentDima);
        assertEquals(5, studentDatabase.printAllStudents().size());
    }

    @Test
    void addStudentError() {
        studentDatabase.addStudent(studentDima);
        assertEquals(1, studentDatabase.printAllStudents().size());
        studentDatabase.addStudent(studentDima);
        assertEquals(1, studentDatabase.printAllStudents().size());
    }

    @Test
    void removeStudentHappyPath() {
        studentDatabase.addStudent(studentNikita);
        studentDatabase.addStudent(studentSasha);
        assertEquals(2, studentDatabase.printAllStudents().size());
        studentDatabase.removeStudent(studentSasha);
        assertEquals(1, studentDatabase.printAllStudents().size());
    }

    @Test
    void removeStudentError() {
        studentDatabase.addStudent(studentNikita);
        studentDatabase.addStudent(studentSasha);
        assertEquals(2, studentDatabase.printAllStudents().size());
        studentDatabase.removeStudent(studentSlavik);
        assertEquals(2, studentDatabase.printAllStudents().size());
    }

    @Test
    void containsStudentHappyPath() {
        studentDatabase.addStudent(studentSlavik);
        studentDatabase.addStudent(studentShoni);
        studentDatabase.addStudent(studentNikita);
        assertEquals(3, studentDatabase.printAllStudents().size());
        assertTrue(studentDatabase.containsStudent(studentShoni));
        assertTrue(studentDatabase.containsStudent(studentNikita));
        assertTrue(studentDatabase.containsStudent(studentSlavik));
    }

    @Test
    void containsStudentError() {
        studentDatabase.addStudent(studentSlavik);
        studentDatabase.addStudent(studentShoni);
        studentDatabase.addStudent(studentNikita);
        assertEquals(3, studentDatabase.printAllStudents().size());
        assertFalse(studentDatabase.containsStudent(studentDima));
        assertFalse(studentDatabase.containsStudent(studentSasha));
    }
}