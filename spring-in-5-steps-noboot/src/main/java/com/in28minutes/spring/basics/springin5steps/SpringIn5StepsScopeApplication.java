package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO2 = context.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
		
		context.close();
	}

}