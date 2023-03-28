package com.edu;
import java.util.*;
public class CaseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter day");
		day = sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("it is sunday");
			break;
		case 2:
			System.out.println("it is Monday");
			break;
		case 3:
			System.out.println("it is Tuesday");
			break;
		case 4:
			System.out.println("it is Wednesday");
			break;
		case 5:
			System.out.println("it is Thursday");
			break;
		case 6:
			System.out.println("it is Friday");
			break;
		case 7:
			System.out.println("it is saturday");
			break;
		default:
			System.out.println("input is wrong");
			break;

		}
	}
}
