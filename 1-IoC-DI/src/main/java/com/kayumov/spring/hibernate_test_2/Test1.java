package com.kayumov.spring.hibernate_test_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        //* factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee(
//              "John", "Doe", "IT", 500
//            );
//            Detail detail = new Detail(
//                "BigCity", "123456789", "john@mail.com"
//            );
//
//            employee.setEmpDetail(detail);
//
//            //* open transaction
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            Session session = factory.getCurrentSession();

            Employee employee = new Employee(
                    "Cindy", "Mac", "SALES", 700
            );
            Detail detail = new Detail(
                    "SmallCity", "987654321", "cindy@mail.com"
            );

            employee.setEmpDetail(detail);

            //* open transaction
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
