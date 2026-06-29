package com.mmoce.multithreading;

public  class MyRunnable implements Runnable{
	private int data;
	@Override
	public void run() {
		Thread ct=Thread.currentThread();
		String tname=ct.getName();
		//data=(int) (Math.random()*100);
		for(int c=1; c<=50;c++) {
			System.out.println(tname+":"+ ++data);
			
		}
		
	}
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
		Thread t1=new Thread(mr,"Nikhil");
		Thread t2=new Thread(mr,"Raj");
		Thread t3=new Thread(mr,"Rahul");
		
		t1.start();
		t2.start();
		t3.start();
	}

	
	

}
