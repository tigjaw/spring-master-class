package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String query;
		Person person;

		// SQL - Queries
		{
			// FIND
			query = "FIND all users -> {}";
			logger.info(query, dao.findAll());

			query = "FIND users where id is 10001 -> {}";
			logger.info(query, dao.findById(10001));

			query = "FIND users where name is Joey -> {}";
			logger.info(query, dao.findByName("Joey"));
		}

		// SQL - Updates
		{
			// DELETE
			query = "DELETE entry where id is 10002 -> {} rows DELETED";
			logger.info(query, dao.delById(10002));

			query = "DELETE entry where name is Ross -> {} rows DELETED";
			logger.info(query, dao.delByName("Ross"));

			query = "DELETE entry where location is Amsterdam -> {} rows DELETED";
			logger.info(query, dao.delByLocation("Amsterdam"));

			query = "DELETE entry where id is 10005 or name is Monica -> {} rows DELETED";
			logger.info(query, dao.delByIdOrName(10005, "Monica"));

			// INSERT
			query = "INSERT entry with id of 10007 -> {} rows INSERTED";
			person = new Person(10007, "Janice", "Berlin", new Date());
			logger.info(query, dao.insert(person));
			
			query = "INSERT entry with id of 10008 -> {} rows INSERTED";
			person = new Person(10008, "David", "New York", new Date());
			logger.info(query, dao.insert(person));

			// UPDATE
			query = "UPDATE entry with id of 10004 -> {} rows UPDATED";
			person = new Person(10004, "Chandler", "Utrecht", new Date());
			logger.info(query, dao.update(person));
			
			query = "UPDATE entry with id of 10008 -> {} rows UPDATED";
			person = dao.findById(10008);
			person.setLocation("Minsk");
			logger.info(query, dao.update(person));
		}

	}

}