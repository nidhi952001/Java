package com.edu;
import java.util.*;
public class AreaOfFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth,area;
		length= 20;
		breadth = 5;
		area= length *breadth;
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+" is=>"+area);
		
		System.out.println("Hello"+2+3);
		System.out.println(2+3+"Hello");
		System.out.println("hello"+(2+3));
		System.out.println((2+3)+"Hello");
		
		int i =10;
		System.out.println("i value"+i++);
		System.out.println(++i);
		
		int k = 10;
		int j;
		j = ++k + k++;
		System.out.println("i val"+j);
		System.out.println("k val"+k);
		
		int n1 = 20 , n2 =25 , n3=30 , n4=78;
		System.out.println((n1>n2 && n1>n3)?n1:(n2>n3 && n2>n1)?n2:n3);
	
		//reverse number
		int num = 432;
		System.out.println(432%10);
		num = num/10;
		System.out.println(num%10);
		num = num/10;
		System.out.println(num%10);
		
		//check number is positive or negative
		
		int num1 = -7;
		if(num1<0) {
			System.out.println("it is negative number");
		}
		else {
			System.out.println("it is positive number");
		}
		
		System.out.println(num1>0?"positive":"neg");
		
		//find largest of 2 number
		
		int nu1,nu2;
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("enter first number"); 
		  nu1= sc.nextInt();
		  System.out.println("enter seccond number"); 
		  nu2 = sc.nextInt(); 
		  if(nu1>nu2) {
		 System.out.println("number"+nu1+"is larger"); 
		 } else {
		 System.out.println("number"+nu2+"is larger"); 
		 }
		
		  //find largest from 3
		  int nu3; 
		  System.out.println("enter third number"); 
		  nu3= sc.nextInt();
		  if(nu1>nu2 && nu1>nu3) {
		  System.out.println("number"+nu1+"is larger"); 
		  } 
		  else if(nu2 > nu3 ) 
		  {
		  System.out.println("number"+nu2+"is larger"); 
		  } 
		  else {
		  System.out.println("numner"+nu3+"is larger"); 
		  }
		 
		
		//input name , age , center , degree , avg marks
		
		String name,center,degree;
		int age,avg_mark;
		System.out.println("enter your name");
		name = sc.next();
		System.out.println("enter your center");
		center = sc.next();
		System.out.println("enter your degree");
		degree = sc.next();
		System.out.println("enter your age");
		age = sc.nextInt();
		System.out.println("enter your avg mark");
		avg_mark = sc.nextInt();
		System.out.println("hello "+ name +" your age is "+age+" your center name is "+center+" you have completed your "+degree+" with marks of "+avg_mark);
	}

}
