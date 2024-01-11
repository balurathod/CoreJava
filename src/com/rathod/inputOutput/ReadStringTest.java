package com.rathod.inputOutput;
import java.io.*;  
public class ReadStringTest {					//chk how to pass user n pass
	public static void main(String args[]){  
	Console c=System.console();
	System.out.println("Enter your name: ");  
	String n=c.readLine();  
	System.out.println("Welcome "+n);
	
	System.out.println("Enter password: ");  
	char[] ch=c.readPassword();  
	String pass=String.valueOf(ch);//converting char array into string  
	System.out.println("Password is: "+pass);  
	}  
	} 