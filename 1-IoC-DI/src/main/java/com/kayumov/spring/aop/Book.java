package com.kayumov.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Book New 1")
    private String name;

    @Value("Author 1")
    private String author;

    @Value("1866")
    private int yearsOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }
}
