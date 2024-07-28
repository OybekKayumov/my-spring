package com.kayumov.spring.hibernate_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        //* factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            //* open transaction
            session.beginTransaction();

            //todo_ get object from db using hql - work with class (Employee)
            //* NOT with db tables (employees)
            // all data
//            List<Employee> employees =
//                    session.createQuery("from Employee").getResultList();

            //* get objects from db using condition
            // here 'name' is from Employee class, not from db
            List<Employee> employees =
                    session.createQuery("from Employee where name = 'Alex'")
                    .getResultList();
            for (Employee employee : employees) {
                System.out.println(employee);
            }


            //* close transaction
            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
