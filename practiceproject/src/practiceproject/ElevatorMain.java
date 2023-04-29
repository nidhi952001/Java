package practiceproject;
import java.util.*;
class Elevator{
	int current;
	public void selectFloor(int floorNumber) {
		if(floorNumber >= 1 && floorNumber <= 10) {
			if(current==0) {
				current=1;
			}
			if(current>floorNumber) {
				System.out.print("Going down..");
				for(int i = current; i > floorNumber; i-- ) {
					System.out.print(i +"..");
				}
				System.out.println(floorNumber+"..Ding!");
				current = floorNumber;
			}
			else {
				System.out.print("Going Up..");
				for(int i=current;i<floorNumber;i++) {
					System.out.print(i +"..");
				}
				System.out.println(floorNumber+"..Ding!");
				current = floorNumber;
			}
		}
		else {
			System.out.println("Invalid number");
		}	
	}
	public boolean fireAlarm() {
		System.out.print("Going down..");
		for(int i = current; i > 1; i-- ) {
			System.out.print(i +"..");
		}
		System.out.println(1+"..Ding!");
		current = 1;
		return false;
	}
}
public class ElevatorMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator elevator = new Elevator();
		Scanner scanner = new Scanner(System.in);
		String selection;
		boolean contquit = true;
		do {
			System.out.println("(s)elect  a floor , (f)ire alarm , (q)uit");
			System.out.print("Enter s, f or q ==>");
			selection = scanner.next().toLowerCase();
			switch(selection) {
			case "s":
				System.out.print("Enter the Floor that you'd like to go to==>");
				int floorNumber = scanner.nextInt();
				elevator.selectFloor(floorNumber);
				break;
			case "f":
				System.out.println("Danger ! you must exit he building Now!");
				boolean val = elevator.fireAlarm();
				contquit = val;
				break;
			case "q":
				contquit = false;
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}
		}while(contquit);
	}
}
