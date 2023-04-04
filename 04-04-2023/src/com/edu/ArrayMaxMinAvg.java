package com.edu;

import java.util.Scanner;

public class ArrayMaxMinAvg {

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
		
		//for sum
		int sum =0;
		for(int i:ar) {
			sum = sum+i;
		}
		System.out.println("sum= "+sum);
		
		//for avg
		
		float avg=(float)sum/ar.length;
		System.out.println("Average= "+avg);
		
		
		//for max
		int max=ar[0];
		for(int i:ar) {
			int j=i;
			if(j>max) {
				max = j;
			}
		}
		System.out.println("Maximum elements= "+max);
		
		//for min
		int min = ar[0];
		for(int i:ar) {
			int j=i;
			if(j<min) {
				min = j;
			}
		}
		System.out.println("minimum elements= "+min);
		
	}

}
