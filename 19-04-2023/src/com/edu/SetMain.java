package com.edu;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<Integer> hob=new LinkedHashSet<Integer>(); //HashSet not maintains the order
		                                         //only one null value is allowed
		                                         //no duplicates
//		hob.add(76);
//		hob.add(65);
//		hob.add(23);
//		hob.add(65);
//		hob.add(56);

		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the elements");
			int n=sc.nextInt();
			hob.add(n);
			System.out.println("do you want to continue  n to stop any char to continue");
			char ch=sc.next().charAt(0);
			if(ch=='n') {
				break;
			}
		}
		System.out.println(hob);

	}

}



/*
 * public static void main(String[] args) { Set<Integer> hob=new
 * TreeSet<Integer>(); //HashSet not maintains the order //only one null value
 * is allowed //no duplicates hob.add(76); hob.add(65); hob.add(23);
 * hob.add(65); hob.add(56); //hob.add(null);
 * 
 * 
 * List<Integer> lst=new ArrayList<Integer>();
 * 
 * for(int i=10;i>=1;i--) { lst.add(i); }
 * System.out.println("List elements ="+lst);
 * 
 * TreeSet<Integer> tob=new TreeSet<Integer>(lst);
 * 
 * System.out.println(tob); //System.out.println(hob); // Scanner sc=new
 * Scanner(System.in); // // while(true) { //
 * System.out.println("Enter the elements"); // int n=sc.nextInt(); //
 * hob.add(n); //
 * System.out.println("do you want to continue  n to stop any char to continue"
 * ); // char ch=sc.next().charAt(0); // if(ch=='n') { // break; // } // } //
 * System.out.println(hob);
 * 
 * }
 */
