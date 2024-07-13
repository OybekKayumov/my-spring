package com.kayumov.spring.aop;

import org.springframework.stereotype.Component;

//@Component("libraryBean")
@Component  //* unilibrary
public class UniLibrary extends AbstractLibrary {

    //@Override
    public void getBook(String bookName) {

        System.out.println("Мы берем книгу из UniLibrary " + bookName);
    }

    //public void returnBook() {
    //public String returnBook() {
    protected String returnBook() {

        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "return - ok";
    }

    //public void getMagazine() {
    public void getMagazine(int a) {

        System.out.println("Мы берем журнал из UniLibrary");
    }
}
