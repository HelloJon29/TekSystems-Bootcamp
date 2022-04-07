package com.example.my_first_fullstack_project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class HelloController {
    // Example of using a rest controller, instead of returning a html it returns data

    @Value("${message}") // this will be specified in application.properties
    private String message;

    @GetMapping("/greeting")
        public String hello() {
            return message;
    }
}
