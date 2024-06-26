package com.kayumov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
        Cat yourCat = context.getBean("myPet", Cat.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myCat == yourCat));
        //! true - singleton, false - prototype
        System.out.println(myCat);
        System.out.println(yourCat);

//        myCat.setName("Belka");
//        yourCat.setName("Strelka");
//todo_                                               singleton     prototype
//        System.out.println(myCat.getName());        //* Strelka     Belka
//        System.out.println(yourCat.getName());      //* Strelka     Strelka
//        //! содаётся только 1 объект.

        context.close();
    }
}

//Cat bean is created - singleton ok, prototype - won't display