package practiceproject;
import java.util.*;

class Patient{
	String patientname;
	int age;
	String illness;
	String status;
	Patient(String patientname, int age,String illness , String status){
		this.patientname = patientname;
		this.age = age;
		this.illness= illness;
		this.status = status;
	}
}


class Hospital{
	Patient [] patinetarr = new Patient[100];
	
	public void add(Patient patients) {
		Boolean add = false;
		for(int i = 0 ; i< patinetarr.length ; i++) {
			if(patinetarr[i]==null) {
				patinetarr[i] = patients;
				System.out.println("new patinet added");
				add = true;
				return;
			}
		}
		if(!add) {
			System.out.println("Hospital is full");
		}
	}
	
	public void show() {
		System.out.println("Sr no \t Patinet Name \t age \t illness \t status ");
		Boolean pat = false;
		for(int i =0;i<patinetarr.length;i++) {
			if(patinetarr[i]!=null) {
				pat = true;
				System.out.println((i+1) + "\t" + patinetarr[i].patientname + "\t" + patinetarr[i].age +"\t"+ patinetarr[i].illness + "\t" + patinetarr[i].status);
			}
			if(pat == false) {
				System.out.println("No Patient in hospital at this moment");
				break;
			}
		}
	}
	
	
	public Boolean delete(String name) {
		Boolean isFound = false;
			for(int i = 0; i < patinetarr.length; i++) {
				if(patinetarr[i]!=null) {
				if(patinetarr[i].patientname.equals(name)) {
					isFound = true;
					patinetarr[i]= null;
				}
				else 
					isFound = false;
			}
			}
		return isFound ;
	}
	
	public void search(String name) {
		for(int i = 0; i < patinetarr.length; i++) {
			if(patinetarr[i]!=null) {
			if(patinetarr[i].patientname.equals(name)) 
				System.out.println("Patient is in the hospital");
			else 
				System.out.println("Patient with name"+name+"is not avialvle this time in hospital");
		}
		}
	}
}


public class HospitalManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to My Hospital");
		String process = "";	
		int uservalue;
		Scanner scanner = new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		
		
		do {
			System.out.println("1. Add Patient");
			System.out.println("2. Delete Patient");
			System.out.println("3. Search Patient");
			System.out.println("4. Show all Patient");
			System.out.println("5. Exit");
			System.out.println("please select any number");
			uservalue = scanner.nextInt();
			switch(uservalue) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Patient name");
				String patientname = sc.nextLine();
				System.out.println("Enter patient age");
				int age = sc.nextInt();
				System.out.println("Enter patient illness");
				String illness = sc.next();
				String status = "Admitted";
				
				Patient patinet = new Patient(patientname,age,illness,status);
				hospital.add(patinet);
				break;
			case 2:
				System.out.println("Enter Patient name for delete");
				Scanner del = new Scanner(System.in);
				String pname = del.next();
				boolean pdelete = hospital.delete(pname);
				if(pdelete)
					System.out.println("patient deleted succesfully");
				else
					System.out.println("sorry ,patient not found in the list");
				break;
			case 3:
				System.out.println("Enter Patient name for search");
				Scanner search = new Scanner(System.in);
				String name = search.next();
				hospital.search(name);
				break;
			case 4:
				System.out.println("List of all Patient");
				hospital.show();
				break;
			case 5:
				System.out.println("ok bye. please visit again");
				System.exit(1);
				break;
			default:
				System.out.println("ohho you enter wrong input. please try again");
				break;	
			}
			System.out.println("Do you want to continue? yes or no");
			process = scanner.next().toLowerCase();
		}while(process.equals("yes"));
		System.exit(1);
	}

}
