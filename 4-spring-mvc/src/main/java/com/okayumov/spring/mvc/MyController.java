package com.okayumov.spring.mvc;

//import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

//        Employee employee = new Employee();
//        employee.setName("Name");
//        employee.setSurname("Surname");
//        employee.setSalary(500);
//        model.addAttribute("employee", employee);

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

//        String name = employee.getName();
//        employee.setName(name);
//        String surname = employee.getSurname();
//        employee.setSurname(surname);
//        int salary = employee.getSalary();
//        employee.setSalary(salary*10);

        System.out.printf("surname length is %d\n",
                employee.getSurname().length());

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }

        return "show-emp-details-view";
    }
}
