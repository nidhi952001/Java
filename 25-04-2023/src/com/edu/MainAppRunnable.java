package com.edu;

class Product implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run method");
		
	}
}
public class MainAppRunnable {

	public static void main(String[] args) {
		Product pob=new Product();
		Thread tob=new Thread(pob);
		tob.start();

	}

}