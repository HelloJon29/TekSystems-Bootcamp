package jpa.service;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.HibernateException;
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

        try {
            manager.start();
            TypedQuery query = manager.session.createQuery("FROM Student");
            List<Student> getAllStudents = query.getResultList();
            return getAllStudents;
        } catch (HibernateException e) {
            System.out.println("Hibernate error encountered");
            return null;
        } finally {
            // dispose of session
            manager.stop();
        }
    }

    @Override
    public Student getStudentByEmail(String sEmail) {
        // Open factory and session
        ManageSession manager = new ManageSession();

        try {
            // fetch student object by passed in argument
            manager.start();
            Student student = manager.session.get(Student.class, sEmail);
            return student;
        } catch (HibernateException e) {
            System.out.println("Hibernate error encountered");
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

        try {
            // create list of student to populate given the named query that returns results if email and pass match the db
            manager.start();
            TypedQuery query = manager.session.getNamedQuery("validateStudent");
            query.setParameter("sEmail", sEmail);
            query.setParameter("sPass", sPass);
            List<Student> student = query.getResultList();

            // if statement to return false if no values are shown
            if (student.isEmpty()) {
                return false;
            }
            // Returns true if values are fetched
            return true;
        } catch(HibernateException e) {
            System.out.println("Hibernate error encountered");
            return false;
        } finally {
            manager.stop();
        }
    }

    @Override
    public void registerStudentToCourse(String sEmail, int cId) {
        ManageSession manager = new ManageSession();
        CourseService getCourses = new CourseService();
        // Initialize objects for checking and List for placement
        Student student = getStudentByEmail(sEmail);
        Course course = getCourses.getCourseById(cId);
        List<Course> courseList = getStudentByEmail(sEmail).getsCourses();

        try {
            manager.start();
            // if the courseList is empty, add course
            if (!courseList.contains(course)) {
                manager.session.getTransaction().begin();
                student.getsCourses().add(course);
                manager.session.update(student);
                manager.session.getTransaction().commit();
            } else {
                // if courseList already contains the same course, print output
                System.out.println("student already attending course");
            }
        } catch(HibernateException e) {
            System.out.println("Hibernate error encountered");
        } finally {
            manager.stop();
        }
    }

    @Override
    public List<Course> getStudentCourses(String sEmail) {
        // Instantiate helper class
        ManageSession manager = new ManageSession();
        try {
            // open session
            manager.start();
            Student student;
            List<Course> courseList;

            student = manager.session.get(Student.class, sEmail);
            courseList = student.getsCourses();

            return courseList;

        } catch(HibernateException e) {
            System.out.println("Hibernate error");
            return null;
        } finally {
            // close session
            manager.stop();
        }
    }
}
