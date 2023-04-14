package com.edu;

public class DivideMain {

	public static void main(String[] args) {
		int a=10,b=0, c=0;
		System.out.println("Before division");
		try {
		  c=a/b; //monitered statement
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("After division ");
		
      }

}
