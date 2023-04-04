package com.edu;
import java.util.*;
public class AcceptData {

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
		for(int i:ar) {
			System.out.println("array: "+i);
			
		}
		System.out.println(ar);
		
		//clone
		int ar2[] = ar.clone();
		for(int i:ar2) {
			System.out.println("clone: "+i);
		}
		System.out.println(ar2);
	}

}
