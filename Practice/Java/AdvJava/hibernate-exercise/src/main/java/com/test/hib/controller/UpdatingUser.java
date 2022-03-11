package com.test.hib.controller;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdatingUser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        User u = new User();
<<<<<<< HEAD
        u.setId(1);
        u.setAge(22);
        u.setCity("MN");
        u.setEmail("mhaseeb@perscholas");
        u.setFullname("M haseeb");
=======
        u.setId(3);
        u.setEmail("sang@perscholas");
        u.setFullname("Sang SHin2");
>>>>>>> 5a7ea107b7f1339c19a5a075aa42c82d2fda8c87
        u.setPassword("123456");
        session.merge(u);

        // Returns true only when value of a field is changed
        System.out.println("session dirty2? " + session.isDirty());

        session.getTransaction().commit();
        session.close();
    }
}

