package com.kayumov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspectOld1 {

    @Pointcut("execution(* com.kayumov.spring.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {}

    @Pointcut("execution(* com.kayumov.spring.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {}

    //* Комбинирование Pointcut
    @Pointcut("allGetMethodsFromUniLibrary() || " +
            "allReturnMethodsFromUniLibrary()")
    private void allGetsAndReturnMethodsFromUniLibrary() {}

    //* advise
    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetsAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }
}
