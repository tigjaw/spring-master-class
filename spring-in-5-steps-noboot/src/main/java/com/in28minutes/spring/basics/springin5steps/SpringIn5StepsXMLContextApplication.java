package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			
			LOGGER.info("Beans Loader -> {}", (Object) context.getBeanDefinitionNames());
			
			XmlPersonDAO personDAO = context.getBean(XmlPersonDAO.class);
			LOGGER.info("{} {} ", personDAO, personDAO.getXmlJdbcConnection());
		}
	}

}