package com.kayumov.spring.hibernate_one_to_many_bi;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee> employees;

    public void addEmpToDep(Employee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }

        employees.add(employee);
        employee.setDepartment(this);       //!
    }
}