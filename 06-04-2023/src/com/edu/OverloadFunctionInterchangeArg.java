package com.edu;

class Overload{
	void message(int age) {
		System.out.println("age="+age);
	}
	void message(int age, String name) {
		System.out.println("age="+age);
		System.out.println("Name="+name);
	}
	void message(String name, int age) {
		System.out.println("age="+age);
		System.out.println("Name="+name);
	}
}

public class OverloadFunctionInterchangeArg {

	public static void main(String[] args) {
		Overload ob=new Overload();
		ob.message(23);
		ob.message(23,"Ramesh");
		ob.message("Ramesh",23);

	}
}
