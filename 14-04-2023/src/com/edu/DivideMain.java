package com.edu;

public class DivideMain {

	public static void main(String[] args) {
		int a=10,b=2, c=0;
		System.out.println("Before division");
		try {
			System.out.println("Inside try");
		  c=a/b; //monitered statement //
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("After division ");
		
      }

}


//2nd program

/*
 * public class DivideMain {
 * 
 * public static void main(String[] args) { int a=10,b=0, c=0; int ar[]=new
 * int[4]; System.out.println("Before division"); try {
 * System.out.println("Inside try"); c=a/b; //monitered statement // ar[6]=90;
 * //jvm } catch(ArithmeticException e) { e.printStackTrace(); }
 * catch(ArrayIndexOutOfBoundsException e) { e.printStackTrace(); }
 * 
 * finally { System.out.println("Finally Block"); }
 * 
 * System.out.println("After division ");
 * 
 * }
 * 
 * }
 */


//3rd program


/*
 * public class DivideMain {
 * 
 * public static void main(String[] args) { int a=10,b=0, c=0; int ar[]=new
 * int[4]; System.out.println("Before division"); try {
 * System.out.println("Inside try"); c=a/b; //monitered statement //
 * 
 * } catch(ArithmeticException e) { e.printStackTrace(); } try { ar[6]=90; }
 * catch(ArrayIndexOutOfBoundsException e) { e.printStackTrace(); }
 * 
 * finally { System.out.println("Finally Block"); }
 * 
 * System.out.println("After division ");
 * 
 * }
 * 
 * }
 */