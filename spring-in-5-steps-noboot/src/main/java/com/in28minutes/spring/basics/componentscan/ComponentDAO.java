package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponentDAO {

	@Autowired
	ComponentJDBCConnection componentJDBCConnection;
	
	public ComponentJDBCConnection getComponentJDBCConnection() {
		return componentJDBCConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection jdbcConnection) {
		this.componentJDBCConnection = jdbcConnection;
	}
}