package com.example.beandemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(BeanDemoApplication.class, args);

		MyBean myBean = applicationContext.getBean(MyBean.class);
		String s1 = myBean.printBean();

		YourBean yourBean = applicationContext.getBean(YourBean.class);
		String s2 = yourBean.printBean();

		System.out.println(s1);
		System.out.println(s2);
	}

}
