package com.kayumov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        context.close();
    }
}


//Cat bean is created
//Meow-meow

//@Component class Cat --> default BEAN ID will be      cat
//@Component class FavoriteSong --> default will be     favoriteSong
//@Component class SQLTest --> default will be          SQLTest