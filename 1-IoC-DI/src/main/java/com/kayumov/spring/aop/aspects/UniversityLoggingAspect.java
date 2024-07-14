package com.kayumov.spring.aop.aspects;

import com.kayumov.spring.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice(): logging while " +
                "getting students list before getStudents method");
    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning =
//            "students")
//    public void afterReturnStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstSt = students.get(0);
//        String nameSurname = firstSt.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstSt.setNameSurname(nameSurname);
//
//        double avgGrade = firstSt.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstSt.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturnStudentsLoggingAdvice(): " +
//                "logging while getting students list after getStudents method");
//    }

    //*
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing =
//            "exception")
//    public void afterThrowingGetStLogAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStLogAdvice: throwing exception " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStLogAdvice() {
        System.out.println("afterGetStLogAdvice: normal finish of method or " +
                "throw exception");
    }

}
