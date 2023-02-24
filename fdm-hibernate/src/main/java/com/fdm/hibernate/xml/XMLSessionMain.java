package com.fdm.hibernate.xml;

import com.fdm.hibernate.xml.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class XMLSessionMain {

    public static void main(String[] args) {

        //Configuration configuration = new Configuration().configure();

        Configuration configuration = new Configuration().configure("hibernate.configuration.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        Student student = new Student("Emanuel", 30 , "11A");

        session.save(student);

        tx.commit();

        session.close();

        sessionFactory.close();

        System.out.println("Test");
    }

}
