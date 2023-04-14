package com.edu;
import java.util.*;
public class ShowRoom {
	String name;
	long mobno;
	double cost,dis,amount;
	
	ShowRoom(){
		name = "";
		mobno= 0;
		cost = 0.0;
		dis=0.0;
		amount = 0.0;
	}
	
	public void input() {
		System.out.println("Enter Customer Name");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("Enter mobile number");
		mobno = sc.nextLong();
		System.out.println("enter Cost");
		cost = sc.nextDouble();
	}
	
	public void calculate() {
		if(cost<=10000) {
			amount = cost * 0.5;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom sr = new ShowRoom(); 
		sr.input();
		sr.calculate();
		 
	}

}
