package com.edu;

import java.util.Scanner;

public class ArrayPerfectSquare {
int ar[], size;
boolean b; //b=false
void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	size=sc.nextInt();
	ar=new int[size];
	System.out.println("Enter array elements");
	for(int i=0;i<ar.length;i++) { //25 36 49 64 81
		ar[i]=sc.nextInt();
	}
}

boolean checkPerfect() {
	int sq,square;
	for(int i=0;i<ar.length;i++) {
		sq=(int)Math.sqrt(ar[i]); //5
		square=sq*sq;
		b=true;
		if(square!=ar[i]) {
			b=false;
			break;
		}
		
	}
	
	return b;
	
}
	public static void main(String[] args) {
		ArrayPerfectSquare arrayobj=new ArrayPerfectSquare();
		arrayobj.input();
		System.out.println(arrayobj.checkPerfect());

	}

}
