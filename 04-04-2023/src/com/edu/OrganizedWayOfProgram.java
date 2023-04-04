package com.edu;

import java.util.Scanner;

public class OrganizedWayOfProgram {
	//instance variables , member data
	int ar[];
	int size,sum=0,max, min;
	float avg=0;
	//member methods or member functions
	void input() {  //accept data
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter size of an array");
	size=sc.nextInt();
	ar=new int[size];
	
	System.out.println("Enter array elements");
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	}
	//display
	
	void display() {
	System.out.println("Array elements are");
	for(int i:ar) {
		System.out.println(i);
	}
	}
	//sum
	void sumAverage() {
	for(int i:ar) {
		sum=sum+i;
		//sum+=i;
	}
	
	System.out.println("sum="+sum);
	avg=(float)sum/ar.length;
	
	System.out.println("Average="+avg);
	} //average
	
	void maximum() {
	max=ar[0];  //assume first number is largest
	
	for(int i=1;i<ar.length;i++) {
		if(ar[i]>max) {
			max=ar[i];
		}
	}
	System.out.println("Largest of array element="+max);
	} //maximum
	//minimum
	
	void minimum() {
	min=ar[0];  //assume first number is largest
	
	for(int i=1;i<ar.length;i++) {
		if(ar[i]<min) {
			min=ar[i];
		}
	}
	System.out.println("smallest of array element="+min);
	
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		//Object
		OrganizedWayOfProgram  myobj=new OrganizedWayOfProgram ();
		myobj.input();
		myobj.display();
		myobj.sumAverage();
		myobj.maximum();
		myobj.minimum();
		

	}

}
