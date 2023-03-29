package com.edu;
import java.util.*;
public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit,no;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numer");
		num = sc.nextInt();
		no = num;
		while(num!=0) {
			digit = num%10;
			//System.out.print(digit);
			rev = rev*10+digit;
			num = num/10;
		}
		System.out.println("rev num"+rev);
		
		//check pallandrome number
		if(no==rev) {
			System.out.println("this number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
