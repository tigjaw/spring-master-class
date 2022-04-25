package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("bubble")
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	@Override
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}