package com.model;
public class Employee {
	private int code;
	private String name;
	private String author;
	private String date ;
	
	@Override
	public String toString() {
		return "Employee [ code=" + code + ", name=" + name + ", author=" + author + ", date=" + date
				+ "]";
	}
	
	
	public Employee() {
		super();

	}
	public Employee(int code, String name, String author, String date) {
		super();
		this.code = code;
		this.name = name;
		this.author = author;
		this.date = date;

	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
