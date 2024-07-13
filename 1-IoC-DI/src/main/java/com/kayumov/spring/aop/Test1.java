package com.kayumov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary",
                UniLibrary.class);
        uniLibrary.getBook("New Book 1");
        //uniLibrary.returnBook();
        //uniLibrary.getMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
//        context.close();
    }
}


//beforeGetBookAdvice: попытка получить книгу
//Мы берем книгу из UniLibrary
//beforeGetBookAdvice: попытка получить книгу
//Мы берем книгу из SchoolLibrary