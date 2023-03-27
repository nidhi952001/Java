package com.edu;

import java.util.Scanner;

public class ElectBill {
	public static void main(String[] args) {
		double amt ;
		int unit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		unit=sc.nextInt();
		if(unit>0 && unit<=100){ //till 100
			   amt=unit*2.00;
			}
			else if(unit>100 && unit<=400){  //250*3
			      amt=100*2.00+(unit-100)*3;
			}else{
			           amt=100*2+300*3+(unit-400)*3.50;
			}
		System.out.println("Amount="+amt);
	}
}
