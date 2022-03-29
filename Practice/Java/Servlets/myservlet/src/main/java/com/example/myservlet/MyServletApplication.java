package com.example.myservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyServletApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean helloServletBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new HelloServlet(), "/hello1/*");
		bean.setLoadOnStartup(1);
		return bean;
	}

	@Bean
	public ServletRegistrationBean addressServletBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new AddressServlet(), "/address1/*");
		bean.setLoadOnStartup(1);
		return bean;
	}

	@Bean
	public ServletRegistrationBean paramServletBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new ParamServlet(), "/param1/*");
		bean.setLoadOnStartup(1);
		return bean;
	}

	@Bean
	public ServletRegistrationBean calcServletBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new CalcServlet(), "/calc1/*");
		bean.setLoadOnStartup(1);
		return bean;
	}
}
