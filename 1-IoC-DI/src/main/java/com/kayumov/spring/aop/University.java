package com.kayumov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Student 1", 4, 7.5);
        Student student2 = new Student("Student 2", 2, 8.3);
        Student student3 = new Student("Student 3", 1, 9.1);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("From getStudents: ");
        System.out.println(students);
        return students;
    }

}
