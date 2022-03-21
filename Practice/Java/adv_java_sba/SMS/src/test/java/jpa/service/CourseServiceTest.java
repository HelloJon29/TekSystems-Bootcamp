package jpa.service;

import jpa.entitymodels.Course;
import org.junit.jupiter.api.Test;

import javax.persistence.TypedQuery;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    @Test
    void getAllCourses_returns_all_values_in_Course_table_when_called() {
        // start session using ManageSession Class
        ManageSession manager = new ManageSession();
        manager.start();

            List<Course> getAllCourses;
            TypedQuery query = manager.session.createQuery("FROM Course");
            getAllCourses = query.getResultList();
            for(Course c : getAllCourses) {
                System.out.println("Course ID: " + c.getcId() +
                        " Name: " + c.getcName() +
                        " Insturctor: " + c.getcInstructorName());
            }
            // dispose of session after all logic is done
            manager.stop();
            // Assert getAllCourses is equal to expected output
    }
}