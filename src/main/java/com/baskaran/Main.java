package com.baskaran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Learner learner=new Learner();
        learner.setLid(1);
        learner.setLname("Arun");
        learner.setTech("Java");

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.baskaran.Learner.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(learner);
        transaction.commit();

    }
}