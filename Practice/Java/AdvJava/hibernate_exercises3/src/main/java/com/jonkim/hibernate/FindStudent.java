package com.jonkim.hibernate;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        int studentId = 3;
        Student s = session.load(Student.class, studentId);
        System.out.println("Firstname: " + s.getFirstName());
        System.out.println("Lastname: " + s.getLastName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Course: " + s.getCourse());

        t.commit();
        factory.close();
        session.close();

    }
}
