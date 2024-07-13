package com.kayumov.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspectOld2 {

    @Pointcut("execution(* com.kayumov.spring.aop.UniLibrary.*(..))")
    private void allMethodsFromUnionLibrary() {}

    @Pointcut("execution(public void com.kayumov.spring.aop" +
            ".UniLibrary.returnMagazine())")
    private void returnMagazineFromUnionLibrary() {}

    //* Комбинирование Pointcut
    @Pointcut("allMethodsFromUnionLibrary() && " +
            "!returnMagazineFromUnionLibrary()")
    private void allMethodsExceptReturnMagazineFromUnionLibrary() {}

    //* advise
    @Before("allMethodsExceptReturnMagazineFromUnionLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("allMethodsExceptReturnMagazineFromUnionLibrary: " +
                "writing Log #10");
    }
}
