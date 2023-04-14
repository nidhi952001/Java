package com.edu;
class Bank{
	int accno;
	   static String bankname;
	   static {
		   bankname="HDFC"; 
	   }
	   Bank(){
		accno=8765;
	   }
		void nonStaticMethod() {
			System.out.println("Non static method");
			System.out.println("Bank name="+bankname);
			System.out.println("Accno="+accno);
		}
		static void display() {
			System.out.println("static display method Bank Class");
			System.out.println("Bank name="+bankname);
			//System.out.println("Accno="+accno);
		}
}

class SbiBank extends Bank{
    static void display() {
		//super.display();
		System.out.println("static display method SbiBank Class");
	}
}
public class MainStaticApp {
   
	public static void main(String[] args) {
		Bank mainstaticapp=new Bank();
		// display(); 
		 Bank.display();
		 SbiBank.display();
		
		 mainstaticapp.nonStaticMethod();
         
	}
}
