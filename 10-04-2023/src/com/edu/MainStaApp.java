package com.edu;

public class MainStaApp {

	static void display() {
		System.out.println("it is static method");
	}
	void call() {
		System.out.println("it is not static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		MainStaApp.display();
		MainStaApp obj = new MainStaApp();
		// obj.display();   //it only give warning
		obj.call();
	}

}
