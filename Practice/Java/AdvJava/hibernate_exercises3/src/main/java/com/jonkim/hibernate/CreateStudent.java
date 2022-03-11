package com.jonkim.hibernate;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create Session factory object and Session and then open the session
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        // Start transaction
        Transaction t = session.beginTransaction();
        // Creante new instances of objects
        Student s1 = new Student("Jon","Kim",25,"Java");
        Student s2 = new Student("David","Johnson",28,"Java");
        Student s3 = new Student("Lou","Young",32,"Math");
        Student s4 = new Student("Shelby","Jackson",21,"English");
        Student s5 = new Student("Erica","Hope",43,"Math");

        // Save the sessions/ change them from transient to persistent
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        session.save(s5);
        // Commit it and go from dirty to clean as the table is relfecting the changes now
        t.commit();
        System.out.println("Saved");
        factory.close();
        session.close();
    }

}
