package com.kayumov.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    //@Autowired      //* field - внедрение зависимости
    //@Qualifier("dog")
    //@Qualifier("catBean")
    private Pet pet;

    //@Value("John")
    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

//    @Autowired  //* default autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    //@Autowired
    //! @Qualifier("dog") error
    public Person() {
        System.out.println("Person bean is created");
    }

    //* pet -> setPet
    @Autowired
    //@Qualifier("dog")
    public void setPet(@Qualifier("dog") Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}

//Cat bean is created
//Person bean is created
//Class Person: set pet
//Class Person: set surname
//Class Person: set age
//Hello, my lovely pet!
//Meow-meow
//Kayumov
//50

//@Autowired setter
//Cat bean is created
//Class Person: set pet
//Hello, my lovely pet!
//Meow-meow