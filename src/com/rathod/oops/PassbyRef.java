package com.rathod.oops;
public class PassbyRef {
	
	public void tricky(int arg1, int arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  PassbyRef temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	}
	public static void main(String [] args)
	{
		PassbyRef pnt1 = new PassbyRef(0,0);
		PassbyRef pnt2 = new PassbyRef(0,0);
	  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
	  System.out.println(" ");
	  tricky(arg1,arg2);
	  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
	}
}
