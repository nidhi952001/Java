package practiceproject;
import java.util.*;
class Inital{
	public void print(String name) {
		String ar[] = new String[50];
		ar  = name.split(" ");
		for(String ele :ar) {
			System.out.print(ele.charAt(0)+".");
		}
	}
}
public class Elat5_inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		Inital iname = new Inital();
		iname.print(name);
		
	}

}
