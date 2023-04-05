package com.edu;

public class ConstructorMain {
	int i;
	float j;
	String s;
	double d;
	
	ConstructorMain(){
		System.out.println("call on creation of object");
		 System.out.println("used to initialze member data of the class");
	}
	
	public static void main(String[] args) {
		int k;
		ConstructorMain constructormain= new ConstructorMain();
        System.out.println(constructormain.i);
        System.out.println(constructormain.j);
        System.out.println(constructormain.s);
        System.out.println(constructormain.d);
        //System.out.println(k);  local variables are not initialized error
        
	}
}
