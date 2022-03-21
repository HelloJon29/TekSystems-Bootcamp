package jpa.service;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import javax.persistence.TypedQuery;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

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
}