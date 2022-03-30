package com.example.spring_form_handling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this is how you search for controllers in other packages
@SpringBootApplication(scanBasePackages = {"com.example.controller"})
public class SpringFormHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFormHandlingApplication.class, args);
	}

}
