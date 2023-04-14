package com.edu;

class Addition1{
	 void add(int i, int j){
	     int s;
	        s=i+j;
	        System.out.println("2 integer sum="+s);
	   }
	 void add(int i, int j, int k){
	     int s;
	        s=i+j+k;
	        System.out.println("3 integer sum="+s);
	   }
 

}
public class OverloadBasecOnArguments {

	public static void main(String[] args) {
		Addition1 aob1=new Addition1();
		 aob1.add(3, 9);
		 aob1.add(8, 9, 1);

	}

}
