package com.edu;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int digit , arm , ans = 0 , no;
		no = num;
		while(num!=0) {
			digit = num%10;
			//System.out.print(digit);
			arm = digit;
			ans = ans +(arm * arm * arm);
			num = num/10;
			
		}
		System.out.println(ans);
		if(ans == no) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
	}

}
