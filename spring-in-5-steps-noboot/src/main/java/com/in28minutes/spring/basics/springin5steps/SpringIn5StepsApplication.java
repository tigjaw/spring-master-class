package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsApplication.class)) {

			BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch2 = context.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch1);
			System.out.println(binarySearch2);

			int result = binarySearch1.binarySearch(new int[] { 12, 4, 6 }, 3);
			System.out.println(result);
		}
	}

}