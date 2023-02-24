package com.fdm.hibernate.annotation;

import com.fdm.hibernate.annotation.entities.PersonName;
import com.fdm.hibernate.annotation.entities.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetTeacherMain {

    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        Teacher teacher = new Teacher(1, new PersonName("Emanuel", "Neculai"), "CN Ferdinand");

        session.save(teacher);

        tx.commit();

        Teacher teacherDb = session.get(Teacher.class, 1);

        session.close();

        sessionFactory.close();

        System.out.println(teacherDb);

    }

}
