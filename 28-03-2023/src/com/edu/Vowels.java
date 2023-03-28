package com.edu;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter charcter");
		ch = sc.next().charAt(0);
		switch(ch) {
		case 'a','A','e','E','i','I','o','O','u','U':
			System.out.println("it is a vowel");
			break;
		default:
			System.out.println("it is not a vowel");
		}
	}

}
