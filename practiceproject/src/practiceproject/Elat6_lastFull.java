package practiceproject;

import java.util.Scanner;
class InitalLastFull{
	public void print(String name) {
		String ar[] = new String[50];
		ar  = name.split(" ");
		String val="";
		for(String ele :ar) {
			val += ele.charAt(0)+".";	
		}	
		//System.out.println(val.length());
		System.out.print(val.substring(0, val.length()-2));
			//val.strip();
			/*
			 * String newStr = val.substring(0, val.lastIndexOf('.')+1);
			 * System.out.println(newStr);
			 */
		System.out.println(ar[ar.length-1].substring(0));
	}
}
public class Elat6_lastFull {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		InitalLastFull iname = new InitalLastFull();
		iname.print(name);		
	}
}
