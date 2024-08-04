package com.kayumov.spring.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

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

            Department department = new Department("HR", 500, 1500);

            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
            Employee employee2 = new Employee("Andrey", "Sidorov", 1000);

            department.addEmpToDep(employee1);
            department.addEmpToDep(employee2);

            //* open transaction
            session.beginTransaction();
            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
