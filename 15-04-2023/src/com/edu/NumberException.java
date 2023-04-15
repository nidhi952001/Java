package com.edu;
import java.util.*;
public class NumberException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value:");
		int num;
		if(sc.hasNextInt()) {
			System.out.println("it is a number"+sc.nextInt());
			 System.out.println(100 + 100 +"Simplilearn");   
			 System.out.println("E-Learning Company" + 100 + 100);  
		}
		else {
			System.out.println("it is a string");
		}
		
	}
}
