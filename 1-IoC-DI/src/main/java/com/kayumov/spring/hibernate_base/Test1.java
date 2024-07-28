package com.kayumov.spring.hibernate_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

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
                    "John", "Doe", "IT", 500);

            //* open transaction
            session.beginTransaction();
            session.save(employee);             //* insert obj to db
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
