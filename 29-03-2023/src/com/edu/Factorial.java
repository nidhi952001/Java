package com.edu;
public class Factorial {
//1/1! +2/2!.....+10/10!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int i = 1;
		int fact = 1;
		int j =1;
		float sum = 0;
		 while(i<=num) {
			 j=1;
			 while(j<=i) {
					fact = fact*j;
					j++;
				}
			 sum = sum+((float)i/fact);
			   i++;
		 }
		 
		 System.out.println(sum);
			/*
			 * while(i<=num) { fact = fact*i; i = i+1; } System.out.println(fact);
			 */
	}

}
