package com.edu;

import java.util.Scanner;
import java.math.*;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		ar = new int[size];
		
		System.out.println("Enter elments");
		for(int i =0;i<size;i++) {
			ar[i]= sc.nextInt();
		}
		

		//display
		for(int i =0;i<ar.length;i++) {
			int num = (int) Math.sqrt(ar[i]);
			int sqr = num *num;
			if(sqr==ar[i]) {
				System.out.println(ar[i] + "is a perfect squre");
			}
			else {
				System.out.println(ar[i] + "is not a perfect squre");
			}
		}
		
	}

}
