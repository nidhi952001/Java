package com.edu;

class MyClass{
	
}

public class MainAppThread {

	public static void main(String[] args) {
//		Thread t=new Thread() {
//			public void run() {
//				System.out.println("Run method is called");
//			}
//		};
//		t.start();
		
		new Thread() {
			public void run() {
				System.out.println("Run method is called");
			}
		}.start();
		
//Runnable Interface
		
		Runnable rob=new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable run method");
				
			}
			
		};
		
		Thread t=new Thread(rob);
		t.start();

	}

}
