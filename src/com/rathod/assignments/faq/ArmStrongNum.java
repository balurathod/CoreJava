package com.rathod.assignments.faq;

	import java.util.Scanner;

	public class ArmStrongNum {
		public static void main(String args[])
		{	 
	          int n, sum = 0, temp, r;	 
	          Scanner in = new Scanner(System.in);	 
	          System.out.println("Enter a number to check if it is an Armstrong number or not");     
	          n = in.nextInt();	 
	          temp = n;
	          for(temp = 1; temp<1000; temp++){
		          if( temp != 0 )
		          {	 
		             r = temp%10;
		             sum = sum + r*r*r;
		             temp = temp/10; 	 
		          }			            
	          }
	          if ( temp == sum )
	             System.out.println(temp+" is an Armstrong number.");
	          if ( temp != sum )
	             System.out.println(temp+"  is not an Armstrong number.");
		}
	}