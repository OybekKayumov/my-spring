package com.kayumov.spring.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {

        //* factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
             session = factory.getCurrentSession();

            //* open transaction
            session.beginTransaction();

            System.out.println("Get Department");

            Department department = session.get(Department.class, 4);

            System.out.println("Show Department");
            System.out.println(department);

            department.getEmployees().get(0);  //* no error

            session.getTransaction().commit();

            System.out.println("Show Employees of the Department");
            System.out.println(department.getEmployees());

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
