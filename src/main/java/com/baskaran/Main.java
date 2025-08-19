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

        Laptop laptop3=new Laptop();
        laptop3.setLid(3);
        laptop3.setModel("I9");
        laptop3.setName("Asus");
        laptop3.setRam(16);

        Learner learner1=new Learner();
        learner1.setLearnerId(1);
        learner1.setLname("Arun");
        learner1.setTech("Java");


        Learner learner2=new Learner();
        learner2.setLearnerId(2);
        learner2.setLname("bala");
        learner2.setTech("Java");
        learner2.setLaptops(Arrays.asList(laptop,laptop2));

        Learner learner3=new Learner();
        learner3.setLearnerId(3);
        learner3.setLname("bala");
        learner3.setTech("Java");

        learner1.setLaptops(Arrays.asList(laptop,laptop2));
        learner2.setLaptops(Arrays.asList(laptop2,laptop3));
        learner3.setLaptops(Arrays.asList(laptop));

        laptop.setLearners(Arrays.asList(learner1,learner3));
        laptop2.setLearners(Arrays.asList(learner1,learner2));
        laptop3.setLearners(Arrays.asList(learner2));



        SessionFactory sf=new Configuration()
                .addAnnotatedClass(com.baskaran.Learner.class)
                .addAnnotatedClass(com.baskaran.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(laptop);
        session.persist(laptop2);
        session.persist(laptop3);
        session.persist(learner1);
        session.persist(learner2);
        session.persist(learner3);
        transaction.commit();

//        Learner l1=session.get(Learner.class,1);
//        System.out.println(l1);


    }
}