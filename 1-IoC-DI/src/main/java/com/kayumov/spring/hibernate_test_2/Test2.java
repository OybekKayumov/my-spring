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

//            Employee employee = new Employee(
//                    "Niko", "Ive", "HR", 850
//            );
//            Detail detail = new Detail(
//                    "NY", "456123789", "niko@mail.com"
//            );
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);

            //* open transaction
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            //System.out.println(detail.getEmployee());
            session.delete(detail);


            //session.save(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
