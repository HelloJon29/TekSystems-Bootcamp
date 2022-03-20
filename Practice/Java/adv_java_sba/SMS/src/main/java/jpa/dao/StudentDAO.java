package jpa.dao;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();

    Student getStudentByEmail();

    boolean validateStudent();

    void registerStudentToCourse();

    List<Course> getStudentCourses();
}
