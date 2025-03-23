package com.example.CRUDOperationsDemo.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {

        student = new Student("Jahnavi Undela", "1CR21CS074", 21, 8, "A", LocalDate.of(2003, 10, 4));

    }

    @Test
    void studentGettersTest() {
        assertEquals("Jahnavi Undela", student.getStudentName());
        assertEquals("1CR21CS074", student.getStudentUSN());
        assertEquals(8, student.getStudentSem());
        assertEquals(21, student.getStudentAge());
        assertEquals(LocalDate.of(2003, 10, 4), student.getStudentDOB());
        assertEquals("A", student.getStudentClass());
    }

    @Test
    void studentSettersTest() {

        student.setStudentName("Jahnavi");
        assertEquals("Jahnavi", student.getStudentName());

        student.setStudentAge(20);
        assertEquals(20, student.getStudentAge());

        student.setStudentUSN("USN789");
        assertEquals("USN789", student.getStudentUSN());

        student.setStudentSem(4);
        assertEquals(4, student.getStudentSem());

        student.setStudentClass("B");
        assertEquals("B", student.getStudentClass());

        student.setStudentDOB(LocalDate.of(2003, 5, 15));
        assertEquals(LocalDate.of(2003, 5, 15), student.getStudentDOB());

    }

    @AfterEach
    void tearDown() {
        student = null;
        System.out.println("Test completed: Student instance cleared.");
    }
}

