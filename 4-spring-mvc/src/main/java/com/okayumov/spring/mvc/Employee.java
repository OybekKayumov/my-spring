package com.okayumov.spring.mvc;

//import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Size(min = 2, max = 50, message = "name must be at least 2 symbols")
    private String name;

    //@NotNull(message = "surname is required field")
    //@NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;

    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;
    private String department;

    private Map<String, String> departments;

    private String carBrand;

    private Map<String, String> carBrands;

//    private String[] languages;

//    private Map<String, String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please, use pattern " +
            "XXX-XX-XX")
    private String phoneNumber;

    //@CheckEmail(value = "abc.com", message = "must ends abc.com")
    @CheckEmail
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
        departments.put("Cards", "Cards");

        carBrands = new HashMap<>();
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Audi", "Audi");
        carBrands.put("BMW", "BMW");

//        languageList = new HashMap<>();
//        languageList.put("English", "EN");
//        languageList.put("Spanish", "ES");
//        languageList.put("French", "FR");
    }

//    public Map<String, String> getLanguageList() {
//        return languageList;
//    }
//
//    public void setLanguageList(Map<String, String> languageList) {
//        this.languageList = languageList;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
