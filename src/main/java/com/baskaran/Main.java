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
//        stu.setsName("Baskaran");
//        stu.setRollNo(6);
//        stu.setsAge(20);


//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(com.baskaran.Student.class);
//        cfg.configure();
        SessionFactory sf=new Configuration()
                          .addAnnotatedClass(com.baskaran.Student.class)
                          .configure()
                          .buildSessionFactory();
        Session session=sf.openSession();
        /*
        // select - get

        Student stud=null;
        stud= session.get(Student.class,6); // where it return some value
        System.out.println(stud);
        */

        /* insert - persist
        Transaction transaction=session.beginTransaction();

        session.persist(stu);
        transaction.commit();
         */

        /*
        // Update
        Transaction transaction=session.beginTransaction();
        session.merge(stu);
        session.close();
        sf.close();
         */

        //Delete

        stu= session.get(Student.class,6);
        Transaction transaction=session.beginTransaction();
        session.remove(stu);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(stu);
    }
}