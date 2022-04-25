package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
	}

}