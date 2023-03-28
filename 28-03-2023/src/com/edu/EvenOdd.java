package com.edu;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, rem;
		System.out.println("Enter number");
		num = sc.nextInt();
		rem = num%2;
		switch(rem) {
		case 0: 
			System.out.println(num+"it is a even number");
			break;
		case 1:
			System.out.println(num+"it is a odd number");
			break;
		default:
			System.out.println("input is wrong");
			break;

		}
		
	}

}
