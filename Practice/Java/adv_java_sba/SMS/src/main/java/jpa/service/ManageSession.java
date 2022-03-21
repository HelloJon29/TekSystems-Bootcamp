package jpa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// This class is for creating and disposing of a hibernate session
public class ManageSession {
    // declare fields to be used in start and stop methods
    protected static SessionFactory factory = null;
    protected static Session session = null;

    // start method begins the session
    public void start() {
        factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
    }

    // stop method closes the session to prevent memory leaks
    public void stop() {
        session.close();
        factory.close();
    }
}
