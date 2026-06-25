package com.mmcoe.cart;

public class Product {
	private String name;
	private double price;
	
	public Product() {
		
	}
	
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return "Product [name:"+name+" Price:"+price+"]";
	}
	
	public double getPrice() {
		return price;
	}

}
