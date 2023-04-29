package com.edu;
class Employee extends Thread{
	public void run() {
		for(int i =0;i<5;i++) {
		System.out.println("Display method "+Thread.currentThread());
		}
	}
}

public class MainThre {
	public static void main(String[] args) {
		System.out.println("CurrentThread="+Thread.currentThread());
		Employee eob=new Employee(); //Thread-0
		Employee eob1=new Employee(); //Thread-1
		//JVM is controlling Program exceution
		eob.setName("first");
		eob.setPriority(10);
		eob1.setName("Second");
		eob.start();
		eob1.start();
	}
}
