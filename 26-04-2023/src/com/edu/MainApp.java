package com.edu;

class Table{
	synchronized void prinTable(int num)
	{
		for(int i=1;i<=10;i++) {
		     System.out.println(num+"x"+i+"="+num*i);
	}
		
	}
}

class Threadclass1 extends Thread{
	Table t1;
	Threadclass1(Table tob){
		this.t1=tob;
	}
	public void run() {
		t1.prinTable(2);
	}
}
class Threadclass2 extends Thread{
	Table t2;
	Threadclass2(Table tob){
		this.t2=tob;
	}
	public void run() {
		t2.prinTable(5);
	}
}
public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		Table tob=new Table();
		
		Threadclass1 t1=new Threadclass1(tob);
            t1.start();
           // t1.join();
            Threadclass2 t2=new Threadclass2(tob);
            t2.start();
	}

}



/*
 * class Table{ synchronized void printTable(int num) // public void
 * printTable(int num) { for (int i=1;i<=10;i++) {
 * System.out.println(num+"x"+i+"="+num*i); } } } class Threadclass1 extends
 * Thread{ Table t1; Threadclass1(Table tob){ this.t1=tob; } public void run() {
 * t1.printTable(2); } }
 * 
 * class Threadclass2 extends Thread{ Table t2; Threadclass2(Table tob){
 * this.t2=tob; } public void run() { t2.printTable(5); } } public class
 * MainApp{ public static void main(String[] args) throws InterruptedException {
 * Table tob = new Table();
 * 
 * Threadclass1 t1 = new Threadclass1(tob);//new t1.start();
 * //Runnable->Running->wait (sleep) ->running->dead //t1.join(); Threadclass2
 * t2 = new Threadclass2(tob); t2.start();
 * 
 * } }
 */