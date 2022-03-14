package com.jonkim.h2;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create Session factory object and Session and then open the session
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        // Start transaction
        Transaction t = session.beginTransaction();
        // Create new instances of objects
        com.jonkim.model.Student s1 = new com.jonkim.model.Student("Jack","Kim",25,"Java");
        com.jonkim.model.Student s2 = new com.jonkim.model.Student("astrid","Johnson",28,"Java");
        com.jonkim.model.Student s3 = new com.jonkim.model.Student("cailou","Young",32,"Math");
        com.jonkim.model.Student s4 = new com.jonkim.model.Student("rick","Jackson",21,"English");
        com.jonkim.model.Student s5 = new Student("danny","Hope",43,"Math");

        // Save the sessions/ change them from transient to persistent
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        session.save(s5);
        // Commit it and go from dirty to clean as the table is relfecting the changes now
        t.commit();
    }
}
