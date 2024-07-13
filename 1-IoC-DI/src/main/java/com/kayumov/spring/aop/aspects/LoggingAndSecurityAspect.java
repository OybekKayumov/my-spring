package com.kayumov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Before("execution(public void get*())")  //! wildcard
    public void beforeGetLoggingAdvice() {

        System.out.println("beforeGetLoggingAdvice: попытка получить " +
                "книгу/журнал");
    }

    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на " +
                "получение книги/журнала");
    }
}
