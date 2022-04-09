package com.example.my_first_fullstack_project.controller;

import com.example.my_first_fullstack_project.services.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    private Person person;

    @Bean
    public Person person() {
        return new Person("jon",25);
    }
}
