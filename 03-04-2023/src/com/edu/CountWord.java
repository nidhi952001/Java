package com.edu;
import java.util.*;
public class CountWord {
	public static void main(String[] args) {
	//String s = "Nidhi Patel how are you ";
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name");
	String str = s.nextLine();
	int count= 0;
	for(int i = 0;i< str.length();i++) {
	
		char ch = str.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println("no of words"+(count+1));
}
}
