package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    LaptopRepository laptopRepository;

    @RequestMapping("/")
    public String index(Model model){
        Employee employee = new Employee();
        employee.setName("Kevin");
        employee.setSsn("00652910");

        Laptop laptop = new Laptop();
        laptop.setModel("K55A");
        laptop.setBrand("Asus");

        employee.setLaptop(laptop);
        laptop.setEmployee(employee);

        employeeRepository.save(employee);
        laptopRepository.save(laptop);
        System.out.println("\nIt's saved\n");
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("laptops", laptopRepository.findAll());

        return "index";


    }


}
