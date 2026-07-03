package com.mmcoe.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {
	
	public static void main(String[] args) {
		
		Person p1=new Person("Polo",21);
		System.out.println(p1);
		p1.print();
		
		
		Class pc=p1.getClass();
		System.out.println(pc.getName());
		System.out.println(pc.getSuperclass());
		
		Constructor[] constructors=pc.getConstructors();
		System.out.println("----List of constructors...");
		for(Constructor c:constructors) {
			System.out.println(c);
		}
		
		Method[]methods=pc.getMethods();
		System.out.println("---List of Methods...");
		for(Method m: methods) {
			System.out.println(m);
		}
		Method[]decmethods=pc.getDeclaredMethods();
		System.out.println("---List of  declared Methods...");
		for(Method m: decmethods) {
			System.out.println(m);
		}
		
		Field[] fields=pc.getDeclaredFields();
		System.out.println("---List of Fields");
		for(Field f:fields) {
			System.out.println(f);
		}
		
	}

}
