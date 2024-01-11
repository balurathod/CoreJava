package com.rathod.inputOutput;
import java.io.*;  
public class InputStrmReader {
	public static void main(String args[])throws Exception{  
	  
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  
	  
	System.out.println("Enter your name");  
	String name=br.readLine();  
	System.out.println("Welcome "+name);  
	
	 String data=""; 	  
	  while(!data.equals("stop")){  //enter data until stop
	   System.out.println("Enter data: ");  
	   data=br.readLine();  
	   System.out.println("data is: "+data);  
	  }  
	  
	 br.close();  
	 r.close();  
	 }  
	}  
