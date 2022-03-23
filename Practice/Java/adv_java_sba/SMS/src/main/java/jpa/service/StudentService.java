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
            TypedQuery query = manager.session.createQuery("FROM Student");
            List<Student> getAllStudents = query.getResultList();
            return getAllStudents;
        } catch (Exception e) {
            System.out.println("No Students Available");
            return null; // either return null or return empty list, refactor here
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
        // open session
        ManageSession manager = new ManageSession();
        manager.start();

        // create list of student to populate given the named query that returns results if email and pass match the db
        TypedQuery query = manager.session.getNamedQuery("validateStudent");
        query.setParameter("sEmail", sEmail);
        query.setParameter("sPass", sPass);
        List<Student> student = query.getResultList();
        // if statement to return false if no values are shown
        if(student.isEmpty()) {
            return false;
        }
        // Returns true if values are fetched
        manager.stop();
        return true;

    }

    @Override
    public void registerStudentToCourse(String sEmail, int cId) {
        ManageSession manager = new ManageSession();
        manager.start();

        Student getStudent = null;
        Course addCourse= null;
        String sql = "SELECT * FROM Student_Courses WHERE Student_email=? AND sCourses_id=?";

        TypedQuery query = manager.session.createNativeQuery(sql);
        query.setParameter(1, sEmail);
        query.setParameter(2, cId);
        getStudent = manager.session.get(Student.class,sEmail);
        boolean validate = manager.session.createNativeQuery(sql).getResultList().isEmpty();

        if(getStudent != null) {
            addCourse = manager.session.get(Course.class, cId);
            if(!validate) {
                manager.stop();
            }
            manager.session.getTransaction().begin();
            getStudent.getsCourses().add(addCourse);
            manager.session.save(getStudent);
            manager.session.getTransaction().commit();

            manager.stop();
        }
    }

    @Override
    public List<Course> getStudentCourses(String sEmail) {
        ManageSession manager = new ManageSession();
        manager.start();

        Student student = null;
        List<Course> courseList = null;

        student = manager.session.get(Student.class, sEmail);
        courseList = student.getsCourses();

        return courseList;

    }
}
