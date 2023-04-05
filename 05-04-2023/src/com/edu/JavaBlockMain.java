package com.edu;

public class JavaBlockMain {
	static{
		System.out.println("static block executes before main");
	}
	{
		System.out.println("annonymous block, this will exceutes before constructor");
	}
	JavaBlockMain(){
		System.out.println("Executes after creation of an object");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		JavaBlockMain ob=new JavaBlockMain();

	}
}
