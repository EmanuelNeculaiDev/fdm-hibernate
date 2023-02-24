package com.fdm.hibernate.annotation;

import com.fdm.hibernate.annotation.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudentMain {

    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        Student student = new Student("Emanuel", 30 , "11A");

        session.save(student);

        tx.commit();

        session.close();

        sessionFactory.close();

    }

}
