package com.kayumov.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLogAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        System.out.println("Try to return book");
        Object targetMethodResult = null;

        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            targetMethodResult = "Unknown Book name";  //* прячем проблему

            throw e; //! бросаем исключение дальше, программа останавливается
        }
        System.out.println("Successfully returned book");

        return targetMethodResult;
    }
}
