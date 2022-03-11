package com.test.hib.controller;

import com.test.hib.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CreateStudent {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // Create SessionFactory object to allow creation of Session object and open it for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // Create Transaction object and begin it
        Transaction t = session.beginTransaction();

        // Create new Model/Entity Object and pass values through constructor
        Student s1 = new Student("David","Kim",25,"Java2");

        session.save(s1);

        t.commit();
        System.out.println("Successfully saved");
        factory.close();
        session.close();


    }
}
