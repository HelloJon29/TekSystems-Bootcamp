package jpa.service;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class StudentService implements StudentDAO {
    @Override
    public List<Student> getAllStudents() {
        // start session using ManageSession Class
        ManageSession manager = new ManageSession();
        manager.start();
        try {
            List<Student> getAllStudents;
            TypedQuery query = manager.session.createQuery("FROM Student");
            getAllStudents = query.getResultList();
            return getAllStudents;
        } catch (Exception e) {
            System.out.println("No Students Available");
            return null;
        } finally {
            // dispose of session after all logic is done
            manager.stop();
        }
    }

    @Override
    public Student getStudentByEmail(String sEmail) {
        // Open factory and session
        ManageSession manager = new ManageSession();
        manager.start();

        try {
            // fetch student object by passed in argument
            Student student = manager.session.get(Student.class, sEmail);
            return student;
        } catch (NullPointerException e) {
            System.out.println("No student exists");
            return null;
        } finally {
            // close session and factory to prevent memory leak
            manager.stop();
        }
    }

    @Override
    public boolean validateStudent(String sEmail, String sPass) {
        return false;
    }

    @Override
    public void registerStudentToCourse(String sEmail, int cId) {

    }

    @Override
    public List<Course> getStudentCourses(String sEmail) {
        return null;
    }
}
