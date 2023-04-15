package com.edu;

class CheckBalance extends Exception{
	public CheckBalance(String s) {
		super(s);
	}
}

class Bank{
	private float bal;
	public Bank() {
		bal=10000;
	}
	public void withdrawAmount(float wamount) throws CheckBalance {
		//check if wamount more than balance, then print in exception
		//format insufficient balance
		if(wamount>bal) {
			throw new CheckBalance("Insufficient Balance");
		}
		System.out.println("After withdraw balance="+(bal-wamount));
	}
}

public class BankMain {
	public static void main(String[] args) throws CheckBalance {
		Bank bob=new Bank();
		bob.withdrawAmount(2000);
   }
}
