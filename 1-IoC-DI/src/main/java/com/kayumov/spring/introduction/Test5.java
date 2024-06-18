package com.kayumov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
        myCat.say();

        Cat myCat2 = context.getBean("myPet", Cat.class);
        myCat2.say();

        context.close();
    }
}

//! init вызывается только 1 раз в singleton, каждый раз в prototype
//! destroy не вызывается в prototype, нажо написать код отдельно для
// освобождения ресурсов

//Cat bean is created
//Class Cat: init method
//Meow-meow
//Class Cat: destroy method