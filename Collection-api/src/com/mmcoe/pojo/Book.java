package com.mmcoe.pojo;

public class Book {
	private int isbn;
	private String title;
	private String author;
	private double price;
	

	public Book() {
		
	}
	public Book(int isbn, String title,String author ,double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author=author;
		this.price = price;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	

}
