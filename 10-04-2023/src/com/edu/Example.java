package com.edu;

class First{
	   First(){
	     System.out.println("Parent class constructor");
	}
}
	class Second extends First{
	       Second(){
	    	  System.out.println("it is second constructor");
	     }
	    Second(String s){
	             this();  //Constructor call must be the first statement in a constructor
	           System.out.println(s);
	   }
	}
	public class Example{
	      public static void main(String args[]){
	           Second  second =new Second("Manula");
	     }
	}
