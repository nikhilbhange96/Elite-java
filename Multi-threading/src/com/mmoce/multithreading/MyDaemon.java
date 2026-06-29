package com.mmoce.multithreading;

public class MyDaemon extends Thread {
	private int limit;

	public MyDaemon(int limit, String name) {
		super(name);
		this.limit=limit;
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		String tname=Thread.currentThread().getName();
		for(int i=0; i<limit; i++) {
			System.out.println(tname+":"+i);
		}
	}
	public static void main(String[] args) {
		MyDaemon d1=new MyDaemon(50,"First");
		MyDaemon d2=new MyDaemon(100,"second");
		MyDaemon d3=new MyDaemon(150,"third");
		
		MyDaemon d4=new MyDaemon(10000,"daemon");
		d4.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}

}
