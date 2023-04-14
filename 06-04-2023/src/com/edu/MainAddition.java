package com.edu;

class Addition{
	 void add(int i, int j){
	     int s;
	        s=i+j;
	        System.out.println("2 integer sum="+s);
	   }
  void add(short k, short l){
      short s;
       s=(short)(k+l);
       System.out.println("2 short sum="+s);
  }
  void add(byte i, byte j){
      int s;
       s=i+j;
       System.out.println("2 byte sum="+s);
  }
void add(long i, long j){
      long s;
       s=i+j;
       System.out.println("2 long sum="+s);
  }
 void add(float i,float j){
      float s;
       s=i+j;
       System.out.println("2 float sum="+s);
  }
 void add(double i, double j){
      double s;
       s=i+j;
       System.out.println("2 double sum="+s);
  }
}

public class MainAddition{
   public static void main(String args[]){
	   Addition aob=new Addition();
          aob.add(56,98);   //int
          aob.add((short)9,(short)6);    //short
           aob.add((byte)1,(byte)2);   //byte
           aob.add(981l,56l);    //long
           aob.add(89.3f, 76.2f);   //float
            aob.add(123.5,87.3);  //double
          
  }
}
