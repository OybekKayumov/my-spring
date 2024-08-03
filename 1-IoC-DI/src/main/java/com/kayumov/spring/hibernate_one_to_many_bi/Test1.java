package com.kayumov.spring.hibernate_one_to_many_bi;

import com.kayumov.spring.hibernate_one_to_one.Detail;
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

            //* open transaction
            session.beginTransaction();

             Department department = new Department("IT", 200, 1200);

             Employee employee1 = new Employee("John", "Doe", 800);
             Employee employee2 = new Employee("Jane", "Doe", 1000);

             department.addEmpToDep(employee1);
             department.addEmpToDep(employee2);

            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
