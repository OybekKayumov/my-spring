package com.kayumov.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;
    private String surname;
    private int age;

//    @Autowired  //* default autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    //* pet -> setPet
    @Autowired
    public void setPet(Pet pet) {
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