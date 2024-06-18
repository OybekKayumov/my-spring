package com.kayumov.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {

        //* standard creation, without spring
        Pet pet = new Dog();
        Pet pet1 = new Cat();
        //Person person = new Person(pet);
        //Person person1 = new Person(pet1);

        //person.callYourPet();
        //person1.callYourPet();

        System.out.println();
        //* using spring
        //* create application context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet2 = context.getBean("myPet", Pet.class);
        //Person person2 = new Person(pet2);
        //person2.callYourPet();  //* Dog class

        context.close();
    }
}
