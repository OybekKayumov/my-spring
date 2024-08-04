package com.kayumov.spring.hibernate_one_to_many_bi;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@ToString
@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department_Eager {

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

    @Getter
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "department",
            fetch = FetchType.EAGER)
    private List<Employee> employees;

    public Department_Eager(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmpToDep(Employee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }

        employees.add(employee);
       // employee.setDepartment(this);       //!
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                //", employees=" + employees +
                '}';
    }
}
