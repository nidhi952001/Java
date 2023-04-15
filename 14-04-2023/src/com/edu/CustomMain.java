package com.edu;

import java.util.Scanner;

class CheckAge extends Exception{
	
	public CheckAge(String s) {
		super(s);
	}
}

class UserVote{
	
	public void vote(int age) {
		try {
			if(age<18) {
				throw new CheckAge("Not eligible for voting");
			}
			else {
				System.out.println("You can vote");
			}
		}
		catch(CheckAge e) {
			e.printStackTrace();
		}
	}
}

public class CustomMain {

	public static void main(String[] args) {
		int age;
		UserVote uservote=new UserVote();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		uservote.vote(age);
		

	}

}
