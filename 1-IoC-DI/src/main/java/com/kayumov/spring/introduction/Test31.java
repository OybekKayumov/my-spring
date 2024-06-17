package com.kayumov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test31 {

    public static void main(String[] args) {

        //* using spring
        //* create application context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
