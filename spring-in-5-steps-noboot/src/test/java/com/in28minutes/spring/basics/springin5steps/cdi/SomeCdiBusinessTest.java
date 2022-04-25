package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsCdiApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsCdiApplication.class)
public class SomeCdiBusinessTest {
	
	@Autowired
	SomeCdiBusiness business;

	@Test
	public void testBasicScenario() {
		int actualResult = business.findGreatest();
		assertEquals(100, actualResult);
	}

}