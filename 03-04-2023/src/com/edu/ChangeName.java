package com.edu;
import java.util.*;
public class ChangeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		
		  StringBuffer sb = new StringBuffer(s);
		  String rev = sb.reverse().toString();
		  System.out.println(rev);
		 
		
		
		StringBuilder bf= new StringBuilder(s);
		
		String str= bf.reverse().toString();
		System.out.println(str);
		bf.append("hi");
		System.out.println(bf);
		

	}

}
