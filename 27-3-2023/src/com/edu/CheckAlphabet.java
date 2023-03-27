package com.edu;

import java.util.Scanner;

public class CheckAlphabet {
	public static void main(String[] args) {
		System.out.println("Enter the Alphabet: ");
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		
		if(s == 'A' || s=='E' || s=='I' || s=='O' || s=='U' || s == 'a' || s=='e' || s=='i' || s=='o' || s=='u' ) {
			System.out.println("it is vowels");
		}else {
			System.out.println("it is not vowels");
		}
	}
}
