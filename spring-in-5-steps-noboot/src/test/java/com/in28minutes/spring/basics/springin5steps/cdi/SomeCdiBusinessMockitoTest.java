package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessMockitoTest {

	@InjectMocks
	SomeCdiBusiness business;

	@Mock
	SomeCdiDAO daoMock;

	@Test
	public void test_NonEqualScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
		assertEquals(4, business.findGreatest());
	}

	@Test
	public void test_EmptyScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}
	
	@Test
	public void test_EqualScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 2 });
		assertEquals(2, business.findGreatest());
	}

}