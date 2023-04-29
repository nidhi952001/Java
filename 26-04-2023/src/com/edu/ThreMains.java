package com.edu;

class HR{
	
}
class Employee extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Inside run method "+Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class ThreMains {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("CurrentThread="+Thread.currentThread());
		Employee eob=new Employee(); //Thread-0
		Employee eob1=new Employee(); //Thread-1
		//JVM is controlling Program exceution
		eob.setName("firstThread");
		eob1.setName("secondThread");
		System.out.println("Thread state  First"+eob.isAlive());
		eob.start();// Runnable, run state
		System.out.println("Thread state First "+eob.isAlive());
		eob.join();
		System.out.println("Thread state First "+eob.isAlive());
		System.out.println("Thread state Second"+eob.isAlive());
		eob1.start();
		System.out.println("Thread state Second"+eob.isAlive());
	}
}
