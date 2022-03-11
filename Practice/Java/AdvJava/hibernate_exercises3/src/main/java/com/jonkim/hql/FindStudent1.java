package com.jonkim.hql;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

class App {
    public static void main(String[] args) {
        FindStudent1 student = new FindStudent1();
        student.findStudent();

    }
}
public class FindStudent1 {

    public void findStudent() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "FROM Student WHERE id < 4";
        TypedQuery query = session.createQuery(hql);
        List<Student> results = query.getResultList();

        for (Student s : results) {
            System.out.println("Student ID: " + s.getId() + " | " +
                    "First Name: " + s.getFirstName() + " | " +
                    "First Name: " + s.getLastName() + " | " +
                    "First Name: " + s.getAge() + " | " +
                    "First Name: " + s.getCourse() + " | "
                    );
        }
        factory.close();
        session.close();
    }
}
