package jpa.service;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.junit.jupiter.api.Test;

import javax.persistence.TypedQuery;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyStudentServiceTest {

    @Test
    void getStudentByEmail_returns_String_values_student_object_given_an_email() {
        ManageSession manager = new ManageSession();
        manager.start();

        Student student = manager.session.get(Student.class, "cjaulme9@bing.com");
        System.out.println("email: " + student.getsEmail());
        System.out.println("name: " + student.getsName());
        System.out.println("password: " + student.getsPass());

        manager.stop();
        // Assert that the Student object is equal to the expected object
    }

    @Test
    void getStudentByEmail_returns_null__given_a_wrong_email() {
        ManageSession manager = new ManageSession();
        manager.start();

        Student student = manager.session.get(Student.class, "jonkim29@gmail.com");
        if(student != null) {
            System.out.println("email: " + student.getsEmail());
            System.out.println("name: " + student.getsName());
            System.out.println("password: " + student.getsPass());
        } else {
            System.out.println("student is null");
        }


        manager.stop();
        // Assert that the Student object is equal to the expected value of null
        assertNull(student);
    }

    @Test
    void getAllStudents_returns_list_of_all_students_when_called() {
        // start session using ManageSession Class
        ManageSession manager = new ManageSession();
        manager.start();

        List<Student> getAllStudents;
        TypedQuery query = manager.session.createQuery("FROM Student");
        getAllStudents = query.getResultList();
        for(Student s : getAllStudents) {
            System.out.println("Email: " + s.getsEmail() +
                    " Name: " + s.getsName() +
                    " Password: " + s.getsPass());
        }
        // dispose of session after all logic is done
        manager.stop();
        // Assert getAllStudents is equal to expected output
    }

    @Test
    void getStudentCourses_returns_list_of_all_a_students_courses_given_email() {
        ManageSession manager = new ManageSession();
        manager.start();

        Student student = null;
        List<Course> courseList = null;

        student = manager.session.get(Student.class, "cjaulme9@bing.com");
        courseList = student.getsCourses();

        for(Course c : courseList) {
            System.out.println(c.toString());
        }
    }
}