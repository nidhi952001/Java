package com.edu;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Float num1, num2;
		int choice;
		System.out.println("Calculator");
		System.out.println("Enter First number");
		num1 = sc.nextFloat();
		System.out.println("Ente Second number");
		num2 = sc.nextFloat();
		System.out.println("1 . Addition");
		System.out.println("2 . Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("addition of "+num1+" and "+num2+" is "+(num1+num2));
			break;
		case 2:
			System.out.println("subtraction of "+num1+" and "+num2+" is "+(num1-num2));
			break;	
		case 3:
			System.out.println("multiplication of "+num1+" and "+num2+" is "+(num1*num2));
			break;
		case 4:
			System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
			break;
		case 5:
			System.out.println("Exit");
			System.exit(0);
			break;
		default:
			System.out.println("your choice is invalid");
			break;
		}
		
	}

}
