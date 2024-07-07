package com.kayumov.spring.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean   //* manually
    public Pet catBean() {
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}

//!!!
//Cat bean is created
//Person bean is created
//Meow-meow

//*
//!!!
//Cat bean is created
//Person bean is created
//John Doe
//34