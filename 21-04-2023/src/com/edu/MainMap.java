package com.edu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainMap {

	public static void main(String[] args) {
//		Map<Integer,String> hob=new HashMap<Integer, String>();
//
//		   hob.put(100,"Komal");
//		   hob.put(111,"Kikhat");
//		   hob.put(112,"Kavya");
//
//		 System.out.println(hob);
		 
//		 Map<Integer,String> hob=new LinkedHashMap<Integer, String>();
//
//		   hob.put(100,"Komal");
//		   hob.put(111,"Kikhat");
//		   hob.put(112,"Kavya");
//
//		 System.out.println(hob);

		 
		Map<Integer,String> hob=new TreeMap<Integer, String>();

		 hob.put(111,"Kikhat");
		 hob.put(100,"Komal");
		   
		 hob.put(112,"Kavya");
//         System.out.println(hob);
		 
		 //using for loop
		 
		 for(Entry<Integer,String> ent:hob.entrySet()) {
			 System.out.println("Key="+ent.getKey()+" ,Value="+ent.getValue());
		 }
		 
       }
}






/*
 * public class MainMap {
 * 
 * public static void main(String[] args) { // Map<Integer,String> hob=new
 * HashMap<Integer, String>(); // // hob.put(100,"Komal"); //
 * hob.put(111,"Kikhat"); // hob.put(112,"Kavya"); // //
 * System.out.println(hob);
 * 
 * // Map<Integer,String> hob=new LinkedHashMap<Integer, String>(); // //
 * hob.put(100,"Komal"); // hob.put(111,"Kikhat"); // hob.put(112,"Kavya"); //
 * // System.out.println(hob);
 * 
 * 
 * Map<Integer,String> hob=new TreeMap<Integer, String>();
 * 
 * hob.put(111,"Kikhat"); hob.put(100,"Komal");
 * 
 * hob.put(112,"Kavya"); // System.out.println(hob);
 * 
 * //using for loop
 * 
 * // for(Entry<Integer,String> ent:hob.entrySet()) { //
 * System.out.println("Key="+ent.getKey()+" ,Value="+ent.getValue()); // }
 * 
 * //Using KeySet and Value
 * 
 * for(Integer k:hob.keySet()) { System.out.println(k); } //only values
 * 
 * for(String n:hob.values()) { System.out.println(n); }
 * 
 * } }
 */








/*public class MainMap {

	public static void main(String[] args) {
//		Map<Integer,String> hob=new HashMap<Integer, String>();
//
//		   hob.put(100,"Komal");
//		   hob.put(111,"Kikhat");
//		   hob.put(112,"Kavya");
//
//		 System.out.println(hob);
		 
//		 Map<Integer,String> hob=new LinkedHashMap<Integer, String>();
//
//		   hob.put(100,"Komal");
//		   hob.put(111,"Kikhat");
//		   hob.put(112,"Kavya");
//
//		 System.out.println(hob);

		 
		Map<Integer,String> hob=new TreeMap<Integer, String>();

		 hob.put(111,"Kikhat");
		 hob.put(100,"Komal");
		   
		 hob.put(112,"Kavya");
//         System.out.println(hob);
		 
		 //using for loop
		 
//		 for(Entry<Integer,String> ent:hob.entrySet()) {
//			 System.out.println("Key="+ent.getKey()+" ,Value="+ent.getValue());
//		 }
		 
		 //Using KeySet and Value
		 
//		 for(Integer k:hob.keySet()) {
//			 System.out.println(k);
//		 }
//		 //only values
//		 
//		 for(String n:hob.values()) {
//			 System.out.println(n);
//		 }
//       }
		 
		 //Using Iterator
		 
		 Iterator<Entry<Integer,String>> itr=hob.entrySet().iterator();
		 
		 while(itr.hasNext()) {
			  Entry<Integer,String> ent=itr.next();
			  System.out.println(ent.getKey()+"  "+ent.getValue());
		 }
	
	
	}
	
	}
	*/
