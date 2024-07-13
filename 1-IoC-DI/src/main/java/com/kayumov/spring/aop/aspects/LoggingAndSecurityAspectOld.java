package com.kayumov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspectOld {

    //*  Объявление Pointcut
    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")  //! wildcard
    public void beforeGetLoggingAdvice() {

        System.out.println("beforeGetLoggingAdvice: попытка получить " +
                "книгу/журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на " +
                "получение книги/журнала");
    }
}

//beforeGetLoggingAdvice: попытка получить книгу/журнал
//beforeGetSecurityAdvice: проверка прав на получение книги/журнала
//Мы берем книгу из UniLibrary
//beforeGetLoggingAdvice: попытка получить книгу/журнал
//beforeGetSecurityAdvice: проверка прав на получение книги/журнала
//Мы берем журнал из UniLibrary