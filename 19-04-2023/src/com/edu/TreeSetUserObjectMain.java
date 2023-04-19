package com.edu;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Product{
	int pid;
	String pname;
	float pprice;
	public Product(int pid, String pname, float pprice) {
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

class ProductSort implements Comparator<Product>{

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

public class TreeSetUserObjectMain {

	public static void main(String[] args) {
		Product p1=new Product(10, "TV", 87651);
		Product p2=new Product(9, "mouse", 561);
		Product p3=new Product(2, "Laptop", 7651);
		ProductSort pob=new ProductSort();
		Set<Product> pset=new TreeSet<Product>(pob);
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		
		System.out.println(pset);
		}

}
