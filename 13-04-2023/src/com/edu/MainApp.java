package com.edu;

interface Calculator{
    int val=10;
    void add(); 
    
   
}

//class classname implements inf1,inf2,inf3.....
class MyClass implements Calculator{   
 public void add(){
	
        System.out.println("add method ");
 }
}

public class MainApp{
           public static void main(String args[]){
                   MyClass  ob=new MyClass ();
                   ob.add();
          }
   
}


/*
 * interface Calculator{ int val=10; void add(); }
 * 
 * //class classname implements inf1,inf2,inf3..... class MyClass implements
 * Calculator{ public void add(){ System.out.println("add method "); } }
 * 
 * public class MainApp{ public static void main(String args[]){ MyClass ob=new
 * MyClass (); ob.add(); }
 * 
 * }
 */
