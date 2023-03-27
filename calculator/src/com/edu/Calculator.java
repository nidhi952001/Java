package com.edu;

public class Calculator {
	public static void main(String[] args) {
		float fno,sno,ans;
		fno= 45.87f;
		sno = 12.89f;
		//addition
		ans = fno+sno;
		System.out.println("the sum of"+fno+"and"+sno+"is"+ans);
		
		//subtraction
		ans = fno-sno;
		System.out.println("the subtraction of"+fno+"and"+sno+"is"+ans);
		
		//multiplication
		ans = fno*sno;
		System.out.println("the multiplication of"+fno+"and"+sno+"is"+ans);
		
		//division
		ans = fno%sno;
		System.out.println("the division of"+fno+"and"+sno+"is"+ans);
		
	}

}
