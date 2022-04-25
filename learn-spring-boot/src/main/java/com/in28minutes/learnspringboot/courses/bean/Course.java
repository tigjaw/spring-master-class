package com.in28minutes.learnspringboot.courses.bean;

public class Course {
	private long id;
	private String name;
	private String author;

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String text = "Course [";
		text += "id=" + id + ", ";
		text += "name=" + name + ", ";
		text += "author=" + author + "]";
		return text;
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