package com.rathod.inputOutput;
import java.util.Scanner;  
public class ScannerTest{  
	 public static void main(String args[]){  
	   Scanner sc=new Scanner(System.in);  
	     
	   System.out.println("Enter your rollno");  
	   int rollno=sc.nextInt();  
	   System.out.println("Enter your name");  
	   String name=sc.next();  
	   System.out.println("Enter your fee");  
	   double fee=sc.nextDouble();  
	   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
	   
	   String input = "10 tea 20 coffee 30 tea buiscuits";  
	   Scanner s = new Scanner(input).useDelimiter("\\s");  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	     System.out.println(s.nextInt());  
	     System.out.println(s.next());  
	   sc.close();  
	 }  
}   