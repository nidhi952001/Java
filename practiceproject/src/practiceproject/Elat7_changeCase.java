package practiceproject;

import java.util.Scanner;
class ChangeCases{
	public void change(String name) {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < name.length(); i++) {
		    char c = name.charAt(i);
		    if (Character.isUpperCase(c)) {
		        output.append(Character.toLowerCase(c));
		    } else {
		        output.append(Character.toUpperCase(c));
		    }
		}

		System.out.println(output.toString());
	}
	
}
public class Elat7_changeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		ChangeCases cc = new ChangeCases();
		cc.change(name);
	}

}
