package com.kayumov.spring.introduction;

import org.springframework.stereotype.Component;

@Component("catBean")  //* singleton
public class Cat implements Pet{

//    private String name;

    public Cat() {
        System.out.println("Cat bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    //* init
    public void init() {
        System.out.println("Class Cat: init method");
    }

    public void destroy(){
        System.out.println("Class Cat: destroy method");
    }
}
