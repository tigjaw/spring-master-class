package com.in28minutes.springboot.basics.springbootin15steps;

public class Book {
	
	private long id;
	private String name;
	private String author;
	
	public Book(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
}