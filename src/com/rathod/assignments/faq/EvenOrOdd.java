package com.rathod.assignments.faq;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String []args )    {
		 
	    int number;
	    Scanner in= new Scanner(System.in);
	 
	    System.out.println("Enter a number to check even or odd");
	    number=in.nextInt();
	    //using Modular (%)
	    if((number % 2)==0){
	        System.out.println(+number+" is Even number");
	    }else{
	        System.out.println(+number+" is Odd Number");
	    }
	    
	    //using division (/)
	    if((number / 2)*2==number){
	        System.out.println(+number+" is Even number");
	    }else{
	        System.out.println(+number+" is Odd Number");
	    }
	 
	}
}
