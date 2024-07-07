package com.kayumov.spring.introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")  //* singleton

public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

//    @PostConstruct
//    //* init
//    public void init() {
//        System.out.println("Class Cat: init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Cat: destroy method");
//    }
}
