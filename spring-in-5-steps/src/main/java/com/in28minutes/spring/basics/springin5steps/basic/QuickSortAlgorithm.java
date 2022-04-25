package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Service;

@Service("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	@Override
	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
}