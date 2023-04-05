package com.edu;

public class ConstructorMainApp {
	//super class Object->defined in java.lang
	int i,j;

	ConstructorMainApp(){
		System.out.println("My constr "+i);
	}
		public ConstructorMainApp(int k, int l) {
		  i=k;
		  j=l;
		  System.out.println("My constr with arg i="+i +"j="+j);
	}
		public static void main(String[] args) {
			
			ConstructorMainApp constructorMainApp =new ConstructorMainApp();
			ConstructorMainApp constructorMainApp1 =new ConstructorMainApp(8,9);
			
		}
}


/*
 * public class ConstructorMainApp { //super class Object->defined in java.lang
 * int i,j,s;
 * 
 * ConstructorMainApp(){ System.out.println("My constr "+i); } public
 * ConstructorMainApp(int i, int j) { this(); this.i=i; this.j=j;
 * System.out.println("My constr with arg i="+i +"j="+j);
 * 
 * 
 * } void display() { s=i+j; System.out.println("sum="+s); } public static void
 * main(String[] args) {
 * 
 * 
 * ConstructorMainApp constructorMainApp1 =new ConstructorMainApp(8,9);
 * constructorMainApp1.display();
 * 
 * }
 * 
 * }
 */
