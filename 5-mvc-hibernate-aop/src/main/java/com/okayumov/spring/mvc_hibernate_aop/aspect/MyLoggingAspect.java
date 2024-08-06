package com.okayumov.spring.mvc_hibernate_aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Controller;

@Controller
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.okayumov.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint pjp) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        String methodName = methodSignature.getName();

        System.out.printf("Begin of " + methodName);
        Object targetMethodResult = pjp.proceed();

        System.out.println("End of " + methodName);

        return targetMethodResult;
    }
}
