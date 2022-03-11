package com.jonkim.hibernate;


import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t2 = session.beginTransaction();

        Student s = new Student();

        s.setId(3);
        session.delete(s);

        t2.commit();
        System.out.println("Deleted Student");
        factory.close();
        session.close();
    }
}
