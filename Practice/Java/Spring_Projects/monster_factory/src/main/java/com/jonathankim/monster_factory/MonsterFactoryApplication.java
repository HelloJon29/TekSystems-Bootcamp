package com.jonathankim.monster_factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class MonsterFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonsterFactoryApplication.class, args);
	}

}
