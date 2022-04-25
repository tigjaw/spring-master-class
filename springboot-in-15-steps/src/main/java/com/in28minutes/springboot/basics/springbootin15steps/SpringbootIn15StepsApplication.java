package com.in28minutes.springboot.basics.springbootin15steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringbootIn15StepsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootIn15StepsApplication.class, args);

		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}