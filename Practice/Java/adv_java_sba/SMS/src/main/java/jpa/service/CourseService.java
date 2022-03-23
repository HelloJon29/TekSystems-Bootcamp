package jpa.service;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class CourseService implements CourseDAO {
    @Override
    public List<Course> getAllCourses() {
        // start session using ManageSession Class
        ManageSession manager = new ManageSession();
        manager.start();
        try {
            List<Course> getAllCourses;
            TypedQuery query = manager.session.createQuery("FROM Course");
            getAllCourses = query.getResultList();
            return getAllCourses;
        } catch (Exception e) {
            System.out.println("No Course");
            return null;
        } finally {
            // dispose of session after all logic is done
            manager.stop();
        }
    }

    public Course getCourseById(int cID) {
        ManageSession manager = new ManageSession();
        manager.start();

        Course course = manager.session.get(Course.class, cID);
        return course;
    }
}
