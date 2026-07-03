package com.mmcoe.pojo;

import java.util.List;


public class Book {
	private int isbn;
	private String title, author;
	private double price;
	
	// Constructors
	public Book() {
	}
	public Book(int isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + isbn + ", Title=" + title + ", Author=" + author + ", Price=" + price + "]";
	}
	
	// Getters and Setters
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean save(Book b) {
		// TODO Auto-generated method stub
		return false;
	}
	public Object find(int isbn2) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Book> list() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean delete(int isbn2) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<Book> findByPrice(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
