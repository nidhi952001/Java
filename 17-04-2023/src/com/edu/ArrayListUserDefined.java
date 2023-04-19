package com.edu;

import java.util.ArrayList;

class Employ{
	private int eid;
	private String ename;
	public Employ(int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
}

public class ArrayListUserDefined {

	public static void main(String[] args) {
		Employ emp1=new Employ(11, "Priya");
		Employ emp2=new Employ(12, "Kiran");
		Employ emp3=new Employ(13, "Sonali");
		
		//addobject to the arraylist
		ArrayList<Employ>emplist=new ArrayList<Employ>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		System.out.println(emplist);

	}

}
