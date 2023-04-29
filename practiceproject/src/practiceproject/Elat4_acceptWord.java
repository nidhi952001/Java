package practiceproject;
import java.util.*;
class PrintWord{
	public void printing(String patterns) {
		int k , i;
		StringBuffer sb = new StringBuffer();
		sb.append(patterns);
		patterns = sb.reverse().toString();
		//System.out.println(patterns);
		for(i=0;i<patterns.length();i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(patterns.substring(j, j+1));
			}
			System.out.println(" ");
		}
	}
}
public class Elat4_acceptWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String patt = sc.next();
		
		PrintWord pw = new PrintWord();
		pw.printing(patt);
	}

}

