package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXMLConfigTest {
	
	@Autowired
	BinarySearchImpl bse;

	@Test
	public void testBasicScenario() {
		int actualResult = bse.binarySearch(new int[] {}, 5);
		assertEquals(3, actualResult);
	}

}