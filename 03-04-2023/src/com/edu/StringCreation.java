package com.edu;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Nidhi";
		String s1 = "Nidhi";
		
		String s2 = new String("hi");
		
		String s3 = new String("hi");
		String s4 = new String("Nidhi");

		System.out.println(s+" : "+s1+" : "+s2+" : "+s3);
		
		if(s==s1) {
			System.out.println("it is equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
		if(s2==s3) {
			System.out.println("it is equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
		if(s.equals(s4)) {
			System.out.println("it is equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
