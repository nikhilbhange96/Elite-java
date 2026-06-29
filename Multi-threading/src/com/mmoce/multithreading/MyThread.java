package com.mmoce.multithreading;



public class MyThread extends Thread {
	
	private int data;
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		
		Thread ct=Thread.currentThread();
		String tname=ct.getName();
		//data=(Math.random()*100);
		for(int c=1; c<=50;c++) {
			System.out.println(tname+":"+ ++data);
			
		}
	
	}
	public static void main(String[] args) {
		
		MyThread t1=new MyThread("Nikhil");
		MyThread t2=new MyThread("Raj");
		MyThread t3=new MyThread("Rahul");
		t2.setPriority(MAX_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
