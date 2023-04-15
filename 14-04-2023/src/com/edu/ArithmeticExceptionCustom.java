package com.edu;

import java.util.Scanner;

public class ArithmeticExceptionCustom {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		
		try {
			if(age<18) {
				System.exit(0);
				throw new ArithmeticException("Not eligible for voting");
				
			}else {
				System.exit(0);
				System.out.println("You can vote");
			}
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
		

	}

}
