package com.edu;


import java.util.ArrayList;
import java.util.Iterator;

public class IterateList {

	public static void main(String[] args) {
ArrayList<Float> obf=new ArrayList<Float>();
		
		obf.add(45.5f);
		obf.add(56.7f);
		obf.add(90.4f);
		obf.add(76.3f);
		obf.add(56.2f);
		
		System.out.println(obf);
		
		Iterator<Float> it=obf.iterator();
		
		while(it.hasNext()) {
			Float val=it.next();
			System.out.println(val);
		}

	}

}


/*
 * public class IterateList {
 * 
 * public static void main(String[] args) { ArrayList<Float> obf=new
 * ArrayList<Float>();
 * 
 * obf.add(45.5f); obf.add(56.7f); obf.add(90.4f); obf.add(76.3f);
 * obf.add(56.2f);
 * 
 * System.out.println(obf);
 * 
 * Iterator<Float> it=obf.iterator();
 * 
 * while(it.hasNext()) { Float val=it.next(); System.out.println(val); }
 * 
 * }
 * 
 * }
 */
