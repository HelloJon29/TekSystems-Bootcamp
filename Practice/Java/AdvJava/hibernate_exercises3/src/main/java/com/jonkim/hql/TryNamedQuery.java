package com.jonkim.hql;

import com.jonkim.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class TryNamedQuery {
    public static void main(String[] args) {
        NamedQuery1 n1 = new NamedQuery1();
        n1.getRows();

        NamedQuery2 n2 = new NamedQuery2();
        n2.getMaxAge();


    }
}
// Class to use 1st NamedQuery from Student Entity
class NamedQuery1 {
    public void getRows() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        TypedQuery query = session.getNamedQuery("getRowsLessThanX");
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
// Class to use 2nd NamedQuery from Student Entity
class NamedQuery2 {
    public void getMaxAge() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        TypedQuery query = session.getNamedQuery("getMaxAge");
        int maxAge = (int) query.getSingleResult();
        System.out.println("Max age: " + maxAge);

        factory.close();
        session.close();
    }

}
