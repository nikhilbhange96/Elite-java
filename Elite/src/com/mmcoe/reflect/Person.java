package com.mmcoe.reflect;

import java.security.BasicPermission;

public class Person {

	private String name;
	private int age;
	
	static {
		System.out.println("Person class Loaded");
	}
	
	{
		System.out.println("Instantiated Person");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	 void print() {
		SecurityManager mgr=new SecurityManager();
		mgr.checkPermission(new BasicPermission("Private Method") {
		});
		System.out.println("Name: "+name+", Age:"+age);
		
	}

}
