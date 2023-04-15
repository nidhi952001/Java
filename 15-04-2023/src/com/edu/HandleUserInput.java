package com.edu;
import java.util.*;
public class HandleUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		String name;
		String pass;
		try {
			name = sc.next();
			pass = sc.next();
			
			if(name.equals("Admin") && pass.equals("Admin123")){
				System.out.println("user is validate");
			}
			else {
				System.out.println("something is wrong");
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
