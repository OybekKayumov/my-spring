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
        System.out.println("-".repeat(30));
        //uniLibrary.returnMagazine();
        //System.out.println("-".repeat(30));
        //uniLibrary.addBook();

        //uniLibrary.getBook("New Book 1");
        //uniLibrary.returnBook();
        //uniLibrary.getMagazine(18);
        uniLibrary.getMagazine();

    }
}

//beforeGetAndReturnLoggingAdvice: writing Log #3
//beforeGetLoggingAdvice: writing Log #1
//beforeGetLoggingAdvice: попытка получить книгу/журнал
//beforeGetSecurityAdvice: проверка прав на получение книги/журнала
//Мы берем книгу из UniLibrary
//------------------------------
//beforeGetAndReturnLoggingAdvice: writing Log #3
//beforeReturnLoggingAdvice: writing Log #2
//Мы возвращаем журнал в UniLibrary
//------------------------------
//Мы добавляем книгу в UniLibrary