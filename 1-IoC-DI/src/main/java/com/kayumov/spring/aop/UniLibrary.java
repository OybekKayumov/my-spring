package com.kayumov.spring.aop;

import org.springframework.stereotype.Component;

//@Component("libraryBean")
@Component  //* unilibrary
public class UniLibrary extends AbstractLibrary {

    public void getBook() {

        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook() {

        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void getMagazine() {

        System.out.println("Мы берем журнал из UniLibrary");
    }

    public void returnMagazine() {

        System.out.println("Мы возвращаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addBMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
    }
}
