package com.example.my_first_fullstack_project;

import com.example.my_first_fullstack_project.controller.EmployeeController;
import com.example.my_first_fullstack_project.services.DummyService;
import com.example.my_first_fullstack_project.services.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class MyFirstFullstackProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(MyFirstFullstackProjectApplication.class, args);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		if(employeeService != null) {
			System.out.println("employeeService = " + employeeService);
		}
		EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
		if(employeeController != null) {
			System.out.println("employeeController = " + employeeController);
		}

		DummyService du = applicationContext.getBean(DummyService.class);
		if(du != null) {
			System.out.println("dummyService = " + du);
		}
	}

}
