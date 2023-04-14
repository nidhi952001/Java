package com.edu;

class Employee{
	private int eid;
	protected String ename;
	Employee(){
	eid=12;
		ename="Kiran";
	}
}
public class MainApp {

	public static void main(String[] args) {
		Employee employee=new Employee();
		//System.out.println("Employee id="+employee.eid);//private
		System.out.println("Name="+employee.ename);

	}

}
