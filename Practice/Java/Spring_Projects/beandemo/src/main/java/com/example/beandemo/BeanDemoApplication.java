package com.example.beandemo;

import com.example.beans.BeanInterface;
import com.example.beans.MyBean;
import com.example.beans.YourBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class BeanDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(BeanDemoApplication.class, args);

//		BeanInterface myBean = applicationContext.getBean(BeanInterface.class);
//		String s1 = myBean.printBean();
//
//		YourBean yourBean = applicationContext.getBean(YourBean.class);
//		String s2 = yourBean.printBean();
//
//		System.out.println(s1);
//		System.out.println(s2);
	}

	@Bean
	public CommandLineRunner commandLineRunner(@Qualifier("yourBean") BeanInterface beanInterface) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println(beanInterface.printBean());
			}
		};
	}

}
