package com.baskaran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setsName("baskaran");
        stu.setRollNo(6);
        stu.setsAge(20);


//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(com.baskaran.Student.class);
//        cfg.configure();
        SessionFactory sf=new Configuration()
                          .addAnnotatedClass(com.baskaran.Student.class)
                          .configure()
                          .buildSessionFactory();
        Session session=sf.openSession();

        Transaction transaction=session.beginTransaction();
        session.persist(stu);
        transaction.commit();
        sf.close();
    }
}