package com.edu;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i=1;
		while(i<=10) {
			System.out.println(i);
			i = i+1; // if remove this then it goes inside infinite loop
		}
		
		int j;
		j = 10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
	}

}
