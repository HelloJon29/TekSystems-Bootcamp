package com.jonkim.hibernate;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class CreateStudent {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create Session factory object and Session and then open the session
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        // Start transaction
        Transaction t = session.beginTransaction();
        // Create new instances of objects
        Student s1 = new Student("Jack","Kim",25,"Java");
        Student s2 = new Student("astrid","Johnson",28,"Java");
        Student s3 = new Student("cailou","Young",32,"Math");
        Student s4 = new Student("rick","Jackson",21,"English");
        Student s5 = new Student("danny","Hope",43,"Math");

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
