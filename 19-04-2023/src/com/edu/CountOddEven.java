package com.edu;
import java.util.*;
public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd =0;
		int even =0;
		ArrayList<Double> al = new ArrayList<Double>();
		for(int i =0;i<3;i++) {
			System.out.println("Enter number");
			Scanner sc = new Scanner(System.in);
			Double Phonenum = sc.nextDouble();
			al.add(Phonenum);
		}
		
		Iterator<Double> it=al.iterator();
		
		while(it.hasNext()) {
			Double val=it.next();
			if(val%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("odd number"+odd+"even number"+even);
	}

}
