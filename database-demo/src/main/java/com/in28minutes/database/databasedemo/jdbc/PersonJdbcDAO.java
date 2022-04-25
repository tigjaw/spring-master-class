package com.in28minutes.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person> {

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			return person;
		}
		
	}

	// SQL - UPDATES

	public int insert(Person person) {
		String query = "INSERT INTO person ";
		query += "(id, name, location, birth_date )";
		query += "VALUES(?, ?, ?, ?)";

		return jdbcTemplate.update(query, person.asObjectArray(false));
	}
	
	public int update(Person person) {
		String query = "UPDATE person ";
		query += "SET name = ?, location = ?, birth_date = ? ";
		query += "WHERE id = ?";

		return jdbcTemplate.update(query, person.asObjectArray(true));
	}

	public int delById(int id) {
		String query = "DELETE FROM person WHERE id=?";

		return jdbcTemplate.update(query, new Object[] { id });
	}

	public int delByName(String name) {
		String query = "DELETE FROM person WHERE name=?";

		return jdbcTemplate.update(query, new Object[] { name });
	}

	public int delByIdOrName(int id, String name) {
		String query = "DELETE FROM person where ID=? or name=?";

		return jdbcTemplate.update(query, new Object[] { id, name });
	}

	public int delByLocation(String location) {
		String query = "DELETE FROM person WHERE location=?";

		return jdbcTemplate.update(query, new Object[] { location });
	}

	// SQL - QUERIES

	public List<Person> findAll() {
		String query = "SELECT * FROM person";

		return jdbcTemplate.query(query, new PersonRowMapper());
	}

	public Person findById(int id) {
		String query = "SELECT * FROM person WHERE id=?";

		return jdbcTemplate.queryForObject(query, new PersonRowMapper(), id);
	}

	public Person findByName(String name) {
		String query = "SELECT * FROM person WHERE name=?";

		return jdbcTemplate.queryForObject(query, new PersonRowMapper(), name);
	}

	public Person findByLocation(String location) {
		String query = "SELECT * FROM person WHERE location=?";

		return jdbcTemplate.queryForObject(query, new PersonRowMapper(), location);
	}

	// GETTERS & SETTERS

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

}