package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String query;
		Person person;

		// SQL - Queries
		{
			// FIND
			query = "FIND all users -> {}";
			logger.info(query, repo.findAll());

			query = "FIND users where id is 10001 -> {}";
			logger.info(query, repo.findById(10001));
		}

		
		// SQL - Updates
		{
			// DELETE
			query = "DELETE entry where id is 10002 -> {}";
			logger.info(query);
			repo.deleteById(10002);
			
			// INSERT
			query = "INSERT entry with name of Janice -> {}";
			person = new Person("Janice", "Berlin", new Date());
			logger.info(query, repo.save(person));
			
			query = "INSERT entry with name of David -> {}";
			person = new Person("David", "New York", new Date());
			logger.info(query, repo.save(person));
			
			// UPDATE
			query = "UPDATE entry with id of 10004 -> {}";
			person = new Person(10004, "Chandler", "Tulsa", new Date());
			logger.info(query, repo.save(person));
			
		}
		
	}

}