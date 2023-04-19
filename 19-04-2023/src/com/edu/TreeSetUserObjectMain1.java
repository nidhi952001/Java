package com.edu;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Product1{
	int pid;
	String pname;
	float pprice;
	public Product1(int pid, String pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
}

class ProductSort1 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.pid>p2.pid)
		return 1;
		else if(p1.pid<p2.pid)
			return -1;
		else 
			return 0;
	}
	
}

public class TreeSetUserObjectMain1 {

	public static void main(String[] args) {
		Product1 p1=new Product1(10, "TV", 87651);
		Product1 p2=new Product1(9, "mouse", 561);
		Product1 p3=new Product1(2, "Laptop", 7651);
		ProductSort1 pob=new ProductSort1();
		Set<Product1> pset=new TreeSet<Product1>(pob);
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		
		System.out.println(pset);
		}

}