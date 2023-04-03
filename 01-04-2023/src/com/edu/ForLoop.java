package com.edu;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for(int r=1;r<=4;r++) { for(int c = 1;c<=4;c++) { System.out.print(c); }
		 * System.out.println(r); }
		 */
		
		for(int i =1 ; i<=2;i++) {
			for (int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(i);
		}
	}

}
