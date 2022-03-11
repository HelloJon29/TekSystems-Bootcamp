package com.jonkim.hibernate;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Student s = new Student();
        s.setId(5);
        s.setFirstName("Alicia");
        s.setLastName("Jacobs");
        s.setAge(32);
        s.setCourse("English");

        // THis updates the fields
        session.merge(s);

        // returns when changes are made
        System.out.println("Session dirty? " + session.isDirty());

        t.commit();
        System.out.println("Updated student");
        session.close();
        factory.close();
    }
}
