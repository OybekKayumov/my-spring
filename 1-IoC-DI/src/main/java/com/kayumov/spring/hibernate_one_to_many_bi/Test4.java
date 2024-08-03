package com.kayumov.spring.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {

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

            Employee employee = session.get(Employee.class, 4);

            //! delete department too, db is empty (cascade all)
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
