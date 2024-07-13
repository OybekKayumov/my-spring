package com.kayumov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary",
                UniLibrary.class);

        //* get bean from context
        //Book book = context.getBean("book", Book.class);


        uniLibrary.getBook();
        uniLibrary.getMagazine();

        //uniLibrary.getBook("New Book 1");
        //uniLibrary.returnBook();
        //uniLibrary.getMagazine(18);
        //uniLibrary.getMagazine();

    }
}
