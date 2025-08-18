package com.baskaran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop laptop=new Laptop();
        laptop.setLid(1);
        laptop.setModel("I5");
        laptop.setName("HP");
        laptop.setRam(8);

        Learner learner=new Learner();
        learner.setLid(1);
        learner.setLname("Arun");
        learner.setTech("Java");
        learner.setLaptop(laptop);

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.baskaran.Learner.class)
                .addAnnotatedClass(com.baskaran.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(laptop);
        session.persist(learner);
        transaction.commit();

    }
}