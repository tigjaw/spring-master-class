package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIn5StepsPropertiesApplication.class, args);
		
		SomeExternalService service = context.getBean(SomeExternalService.class);
		System.out.println(service.returnServiceURL());
	}

}