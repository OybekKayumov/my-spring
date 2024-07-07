package com.kayumov.spring.introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        //* 2
        myDog.say();

        context.close();
    }
}

//@Scope("prototype") = false
//@Scope("singleton") = true