package com.rathod.inputOutput;
import java.io.*;  
public class PrintStreamEx {
	 public static void main(String args[])throws Exception{  
	   char []c = {'1','2','3','4'};
	   FileOutputStream fout=new FileOutputStream("mfile.txt");  
	   PrintStream pout=new PrintStream(fout);  
	   pout.println(1900);  
	   pout.println(true);  
	   pout.println("Welcome to Java"); 
	   pout.println(1900);  
	   pout.println('G');  
	   pout.println(c); 
	   pout.println(1900000);  
	   pout.println(123.89);  
	   pout.println(123456475.67667); 
	   pout.println(fout.toString());  
	   pout.println();  //it terminates the line only.
	   pout.println(); 
	   int a=10;  
	   pout.printf("%d",a);//Note, out is the object of PrintStream class  
	   
	   pout.close();  
	   fout.close();  
	      
	 }  
	}   