package com.jonkim.hql;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

class App2 {
    public static void main(String[] args) {
        FindStudent2 student = new FindStudent2();
        student.findStudent();

    }
}
public class FindStudent2 {

    public void findStudent() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "SELECT MAX(S.age) FROM Student S";
        TypedQuery query = session.createQuery(hql);
        int maxAge = (int) query.getSingleResult();
        System.out.println("Max age: " + maxAge);

        factory.close();
        session.close();
    }
}
