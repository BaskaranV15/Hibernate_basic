package com.baskaran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Laptop laptop=new Laptop();
//        laptop.setLid(5);
//        laptop.setModel("I7");
//        laptop.setName("Dell");
//        laptop.setRam(8);



        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(com.baskaran.Learner.class)
                .addAnnotatedClass(com.baskaran.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();
//        Transaction transaction=session.beginTransaction();
//
//        session.persist(laptop);
//
//        transaction.commit();

        String name="HP";
        Query query=session.createQuery("from Laptop where name like ?1"); // Entity names are case-sensitive in HQL

        query.setParameter(1,name);
        List<Laptop> l=query.getResultList();
        System.out.println(l);
//        Learner l1=session.get(Learner.class,1);
//        System.out.println(l1);


    }
}