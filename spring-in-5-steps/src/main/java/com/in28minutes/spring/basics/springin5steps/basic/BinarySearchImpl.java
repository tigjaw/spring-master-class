package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	// binary search expects a sorted array
	
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
	
	@PostConstruct
	public void postConstruct() {
		// as soon as the bean is created, this method is called
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		// before the bean is destroyed, this method is called
		logger.info("preDestroy");
	}

	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}
}