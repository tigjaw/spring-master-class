package com.in28minutes.mockito.mockitodemo;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dsMock = mock(DataService.class);
		when(dsMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
	
	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		DataService dsMock = mock(DataService.class);
		when(dsMock.retrieveAllData()).thenReturn(new int[] {15});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
	}

}