package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsApplication.class)
public class BinarySearchTest {
	
	@Autowired
	BinarySearchImpl bse;

	@Test
	public void testBasicScenario() {
		int actualResult = bse.binarySearch(new int[] {}, 5);
		assertEquals(3, actualResult);
	}

}