package com.kayumov.spring.aop;

import org.springframework.stereotype.Component;

//@Component("libraryBean")
@Component  //* unilibrary
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    protected String returnBook() {

        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "return - ok";
    }

    public void getMagazine() {

        System.out.println("Мы берем журнал из UniLibrary");
    }
}
