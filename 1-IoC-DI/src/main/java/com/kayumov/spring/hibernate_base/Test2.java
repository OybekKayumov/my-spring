package com.kayumov.spring.hibernate_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {

        //* factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            //* create an object to save in db
            Employee employee = new Employee(
                    "Bob", "Walter", "HR", 700);

            //* open transaction
            session.beginTransaction();
            session.save(employee);             //* insert obj to db
            //session.getTransaction().commit();  //* transaction closed

            int myId = employee.getId();        //* not empty

            //* new session
            //session = factory.getCurrentSession();
            //session.beginTransaction();
            //* get id from db, get object from db
            Employee employee1 = session.get(Employee.class, myId);  //* select
            session.getTransaction().commit();

            System.out.println(employee1);
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
