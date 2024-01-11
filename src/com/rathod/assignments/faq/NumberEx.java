package com.rathod.assignments.faq;
//print 1 to 10 without loop
public class NumberEx {
	public static void main(String[] args) {
	   System.out.println(1);
	   System.out.println(2);
	   System.out.println(3);
	   System.out.println(4);
	   System.out.println(5);
	   System.out.println(6);
	   System.out.println(7);
	   System.out.println(8);
	   System.out.println(9);
	   System.out.println(10);
	   
	   //Way 2
	   recursivefun(1);		 
	}
	public static void recursivefun(int n) 
	{ 	 
	  if(n <= 10) {	 
	       System.out.println(n); 
	       recursivefun(n+1);
	  }
	}
}
