package com.edu;

import java.util.Scanner;

public class SecondLarger {

	int ar[], size;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		size=sc.nextInt();
		ar=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	}
	
	//Sorting data
	void findSecondLargest() {
		int t=0;
		for(int i=0;i<ar.length;i++) { //passes
			for(int j=0;j<ar.length-1-i;j++) { //comparision
				if(ar[j]<ar[j+1]) {
					t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
			}
			
		}
		System.out.println("Second Largest element is="+ar[1]);
	}
	
	
	public static void main(String[] args) {
		SecondLarger ob=new SecondLarger();
		ob.inputData();
		ob.findSecondLargest();

	}

}
