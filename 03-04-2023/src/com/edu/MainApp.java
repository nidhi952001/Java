package com.edu;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		s = "Nidhi";
		System.out.println("length of string "+s.length());
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch =='i'|| ch=='o'||ch=='u') {
			System.out.println(s.charAt(i));
			}
		}
		
		///rev the string
		/*for(int i =s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}*/
		
		//n
		//ni
		//nid
		for(int i =0;i<s.length();i++) {
				System.out.println(s.substring(0,i+1));
			}
	
	}

}
