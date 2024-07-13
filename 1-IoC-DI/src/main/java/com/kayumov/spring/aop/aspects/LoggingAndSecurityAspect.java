package com.kayumov.spring.aop.aspects;

import com.kayumov.spring.aop.UniLibrary;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.kayumov.spring.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {}

    @Pointcut("execution(* com.kayumov.spring.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {}

    //* advise
    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }
}
