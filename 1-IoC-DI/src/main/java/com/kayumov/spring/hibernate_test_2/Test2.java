package com.kayumov.spring.hibernate_test_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {

        //* factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
             session = factory.getCurrentSession();

            Employee employee = new Employee(
                    "Mike", "Sid", "HR", 850
            );
            Detail detail = new Detail(
                    "London", "987321456", "mike@mail.com"
            );
            detail.setEmployee(employee);

            //* open transaction
            session.beginTransaction();

            session.save(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
