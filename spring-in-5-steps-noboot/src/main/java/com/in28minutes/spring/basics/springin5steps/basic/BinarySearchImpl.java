package com.in28minutes.spring.basics.springin5steps.basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	// binary search expects a sorted array
	
	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//int[] sortedNumbers = sortAlgorithm.sort(numbers);
		//System.out.println(sortedNumbers);
		// Search the Array
		return 3;
	}

	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}
}