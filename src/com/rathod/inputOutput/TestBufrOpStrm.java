package com.rathod.inputOutput;
import java.io.*;  
public class TestBufrOpStrm {
	 public static void main(String args[])throws Exception{  
	   FileOutputStream fout=new FileOutputStream("f1.txt");  
	   BufferedOutputStream bout=new BufferedOutputStream(fout);  
	   String s="Sachin is my favourite player";  
	   byte b[]=s.getBytes();  
	   bout.write(b);  
	  
	   FileInputStream fin=new FileInputStream("f1.txt");  
	   BufferedInputStream bin=new BufferedInputStream(fin);  
	    int i;  
	    while((i=bin.read())!=-1){  
	     System.out.println((char)i);  //chk y o/p is not printing
	    }  
	    bin.close();  
	    fin.close(); 
	   bout.flush();  
	   bout.close();  
	   fout.close();  
	   System.out.println("success");  
	 }  
	}   