package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCdiDAO;
	
	public int findGreatest() {
		int[] data = someCdiDAO.getData();
		int greatest = Integer.MIN_VALUE;
		for (int value: data) {
			if(value>greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

	public SomeCdiDAO getSomeCdiDAO() {
		return someCdiDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}
}