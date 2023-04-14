package com.edu;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Department{
	private String dname;
	String dlocation; //default access specifier, within package it behaves like public
	                    //outside package it will be private
	public Department(String dname, String dlocation) {
		super();
		this.dname = dname;
		this.dlocation = dlocation;
	}
	
 void display() {
		System.out.println("Department name= "+dname);
	}
	
}

class Employee extends Department{
	String empname;
	int eage;
	public Employee(String empname, int eage, String dname, String dloaction) {
		super(dname,dloaction);
		this.empname = empname;
		this.eage = eage;
	}
    void display() {  //public->protected->default->private
		
		System.out.println("Name="+empname);
		System.out.println("Age="+eage);
		System.out.println("Location ="+dlocation);
		super.display();
		//System.out.println("Department name="+d);
	}
	
}


public class MainAppInhe {

	public static void main(String[] args) {
		Employee emp=new Employee("Ramesh", 67,"CSE","Bangalore");
		emp.display();

	}

}
