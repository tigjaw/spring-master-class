package com.in28minutes.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.springaop.aspect.TrackTime;
import com.in28minutes.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;

	@TrackTime
	public String calculateSomething() {
		// business logic
		return dao1.retrieveSomething();
	}
}