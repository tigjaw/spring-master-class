package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	// SQL - UPDATES

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return update(person);
	}

	public Person deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
		return person;
	}
	
	public List<Person> delByName(String name) {
		// TODO
		return null;
	}
	
	public List<Person> delByLocation(String location) {
		// TODO
		return null;
	}
	
	public Object delByIdOrName(int id, String name) {
		// TODO
		return null;
	}

	// SQL - QUERIES

	public List<Person> findAll() {
		TypedQuery<Person> query = entityManager.createNamedQuery("find_all_persons", Person.class);
		return query.getResultList();
	}

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public List<Person> findByName(String name) {
		// TODO - implement this method
		return null;
	}

	public List<Person> findByLocation(String location) {
		// TODO - implement this method
		return null;
	}

}