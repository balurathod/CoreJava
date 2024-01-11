package com.rathod.assignments.faq;

public class ReverseNumber {
	public static void main(String[] args) {
		 		
		int i=0; 
		System.out.print(" ");
		for(i=0;i<=20;++i){
			System.out.print(i+" ");							
		}
		System.out.println("");
		System.out.println(" ===Now Reverse is=== ");
		for(i=20;i>=0;--i){
			System.out.print(i+" ");				
		}
		
		//Way 2
		int rev=0;
		int num=123456789;
		System.out.println("Second Method");
		System.out.println("Forward num "+num);
		while(num>0){
		  int rem = num%10;
		  //System.out.println("Rem  "+rem);
		  rev = rem+(rev*10);	
		  //System.out.println("Rev  "+rev);
		  num = num/10;
		  //System.out.println("Num  "+num);
		  
		}
		System.out.println("Reverse num "+rev);
	}
}
