package com.edu;

public class MaiStatApp {

	 int accno;
	   static String bankname;
	   static {
		   bankname="HDFC"; 
	   }
	   MaiStatApp(){
		accno=8765;
	   }
		void nonStaticMethod() {
			System.out.println("Non static method");
			System.out.println("Bank name="+bankname);
			System.out.println("Accno="+accno);
		}
		static void display() {
			System.out.println("static display method");
			System.out.println("Bank name="+bankname);
			//System.out.println("Accno="+accno);
		}
		public static void main(String[] args) {
			MaiStatApp mainstaticapp=new MaiStatApp();
			 display();
			 MaiStatApp.display();
			 MaiStatApp.display();
			 mainstaticapp.nonStaticMethod();
	         
		}
}
