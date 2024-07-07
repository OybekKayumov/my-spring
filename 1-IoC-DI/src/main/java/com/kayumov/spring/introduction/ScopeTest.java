package com.kayumov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        Cat yourCat = context.getBean("cat", Cat.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myCat == yourCat));
        System.out.println(myCat);
        System.out.println(yourCat);

        context.close();
    }
}
