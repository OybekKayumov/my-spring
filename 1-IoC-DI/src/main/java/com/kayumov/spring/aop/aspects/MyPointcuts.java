package com.kayumov.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    //@Pointcut("execution(* add*(..))")
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}
}
