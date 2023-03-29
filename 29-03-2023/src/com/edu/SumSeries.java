package com.edu;
import java.util.*;
public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1 , d= 2;
		  float sum=0;
		  
		  while(i<=10) {
		   sum = sum+((float)1/d);
		   i++;
		   d=d+2;
		  }
		  System.out.println(sum);
	}

}


/*
 * float sum=0; int d=2; int i=1; while(i<=10) { if(i%2==0) {
 * sum=sum-((float)1/d); //3 } else { sum=sum+((float)1/d); } i++; d=d+2; }
 * 
 * System.out.println("sum="+sum);
 */