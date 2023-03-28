package com.edu;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Area");
		System.out.println("1 . Rectangle");
		System.out.println("2 . Circle");
		System.out.println("3. Triangle");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the value for length");
			Float len = sc.nextFloat();
			System.out.println("enter the value for breadth");
			Float br = sc.nextFloat();
			System.out.println("area of recatngle with breadth"+br+" and length"+len+"is"+len*br);
			break;
		case 2:
			System.out.println("enter the valur for radius");
			Float radius = sc.nextFloat();
			System.out.println("Area of circle with radius"+radius+"is"+3.14*radius*radius);
			break;
		case 3:
			System.out.println("enter the value for height");
			Float height = sc.nextFloat();
			System.out.println("enter the value for base");
			Float base = sc.nextFloat();
			System.out.println("area of Triangle with height"+height+" and base"+base+"is"+(height*base)/2);
			break;
		default:
			System.out.println("make coorect choice");
			break;
		}
	}

}
