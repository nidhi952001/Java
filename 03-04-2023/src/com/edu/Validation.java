package com.edu;
import java.util.*;
public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String un = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		if(un.equalsIgnoreCase("admin")&& pass.equals("admin123")) {
			System.out.println("User is valid");
		}
		else {
			System.out.println("User is not valid");
		}
	}

}
