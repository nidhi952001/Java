package com.edu;

class Parent{
	Parent(){
		
		System.out.println("Parent class constructor");
	}
}
class Child extends Parent{
	Child(){
		
		System.out.println("Child class constructor");
	}
}
class Child1 extends Child{

	public Child1() {
		
		System.out.println("child1 constructor");
	}
	
}

public class MainInheritance {

	public static void main(String[] args) {
		Child1 cobj=new Child1();

	}

}
