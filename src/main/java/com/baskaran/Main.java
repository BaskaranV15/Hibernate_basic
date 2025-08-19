package com.baskaran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop laptop=new Laptop();
        laptop.setLid(1);
        laptop.setModel("I5");
        laptop.setName("HP");
        laptop.setRam(8);

        Laptop laptop2=new Laptop();
        laptop2.setLid(2);
        laptop2.setModel("I7");
        laptop2.setName("Dell");
        laptop2.setRam(16);

        Learner learner=new Learner();
        learner.setLearnerId(1);
        learner.setLname("Arun");
        learner.setTech("Java");
        learner.setLaptops(Arrays.asList(laptop,laptop2));

        laptop.setLearner(learner);
        laptop2.setLearner(learner);

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.baskaran.Learner.class)
                .addAnnotatedClass(com.baskaran.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(laptop);
        session.persist(laptop2);
        session.persist(learner);
        transaction.commit();

//        Learner l1=session.get(Learner.class,1);
//        System.out.println(l1);


    }
}