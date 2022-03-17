package com.example.jdbc.daoAndUseInterface03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDaoImplTest {
    private StudentDaoImpl studentDao;
    private Student student;
    @BeforeEach
    void setUp() {
      studentDao = new StudentDaoImpl();
      student = new Student();
    }

    @Test
    void getStudentById_should_return_valid_student_given_valid_id() {
        Student actualStudent = studentDao.getStudentById(1);
        Student expectedStudent = student;
        expectedStudent.setId(1);
        expectedStudent.setlName("shin");
        expectedStudent.setfName("sang");
        expectedStudent.setEmail("sang@tek.com");
        assertEquals(expectedStudent, actualStudent);
    }

    @Test
    void getStudentById_should_throw_IncorrectIdException_given_invalid_Id() {

        assertThrows(IncorrectIdException.class,
                () -> studentDao.getStudentById(5));
    }
}