package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
	}

}