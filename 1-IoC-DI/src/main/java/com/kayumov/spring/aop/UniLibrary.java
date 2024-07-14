package com.kayumov.spring.aop;

import org.springframework.stereotype.Component;

//@Component("libraryBean")
@Component  //* unilibrary
public class UniLibrary extends AbstractLibrary {

    public void getBook() {

        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("-".repeat(40));
    }

    public String returnBook() {

        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "War and Piece";
    }

    public void getMagazine() {

        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("-".repeat(40));

    }

    public void returnMagazine() {

        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("-".repeat(40));

    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-".repeat(40));

    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("-".repeat(40));

    }
}
