package com.in28minutes.database.databasedemo.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "birth_date")
	private Date birthDate;

	// CONSTRUCTORS

	public Person() {}

	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	/** Constructor used by Hibernate. Generates an auto value for id.
	 * @param name (String) - name of Person
	 * @param location (String) - location of Person
	 * @param birthDate (Date) - birth date of Person */
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	// FUNCTIONALS

	@Override
	public String toString() {
		return String.format("\nPerson [id=%s, name=%s, location=%s, birthDate=%s]", id, name,
				location, birthDate);
	}

	/** returns Person as object[]
	 * @param idAsParam (boolean) - if true, use id as param and create new
	 *        object[] with id as last arg
	 * @return (Object[]) - { name, location, birthDate, id } or { id, name,
	 *         location, birthDate } */
	public Object[] asObjectArray(boolean idAsParam) {
		if (idAsParam) {
			return new Object[] { name, location, birthDate, id };
		} else {
			return new Object[] { id, name, location, birthDate };
		}
	}

	// GETTERS & SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public Timestamp getBirthDateAsTimestamp() {
		return new Timestamp(getBirthDate().getTime());
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}