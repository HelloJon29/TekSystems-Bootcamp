package com.test.hib.Hql;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

class App5 {
    public static void main(String[] args) {
        FindUser_Hql5 u = new FindUser_Hql5();
        u.getCityExample();

    }
}

public class FindUser_Hql5 {

    public void getCityExample() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM User u WHERE u.city : city";
        TypedQuery query = session.createQuery(hql);
        List<User> results = query.getResultList();
        for (User u : results) {
            System.out.println("User Id: " + u.getId() + "|"
                    + " Full name: " + u.getFullname() +" | "
                    + " City: " + u.getCity() +" | "
                    + " Email: " + u.getEmail() +" | "
                    + " password " + u.getPassword());
        }
    }
}
