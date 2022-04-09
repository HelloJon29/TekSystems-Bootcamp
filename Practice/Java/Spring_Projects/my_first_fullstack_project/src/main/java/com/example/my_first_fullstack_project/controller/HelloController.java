package com.example.my_first_fullstack_project.controller;

import com.example.my_first_fullstack_project.services.EmployeeService;
import com.example.my_first_fullstack_project.services.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@org.springframework.web.bind.annotation.RestController
//@ResponseBody At class level that makes all of these methods REST Endpoints, Not useful for RestController, but useful for Controller
public class HelloController {
    // Example of using a rest controller, instead of returning a html it returns data

    @Value("${message}") // this will be specified in application.properties
    private String message;

    @GetMapping("/greeting")
        public String hello() {
            return message;
    }

    // Example of Dependency injection
    private EmployeeService employeeService;
    private Person person;

    @Autowired
    public HelloController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public HelloController(Person person) {
        this.person = person;
    }

    // Returned as JSON automatically by REST controller
    @GetMapping("/getPerson")
    public Person getPerson() {
        return new Person("sang", 20);
    }

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {
        person.setName(person.getName().toUpperCase());
        return person;
    }
}
