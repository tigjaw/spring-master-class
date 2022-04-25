package com.in28minutes.springboot.basics.springbootin15steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1L, "Mastering String 5.0", "Bob Bobinson"));
	}
}