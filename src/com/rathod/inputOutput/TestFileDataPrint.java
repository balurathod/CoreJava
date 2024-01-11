package com.rathod.inputOutput;
import java.io.*;  
public class TestFileDataPrint {
	  public static void main(String args[])throws Exception{  
	   FileInputStream fin1=new FileInputStream("f1.txt");  
	   FileInputStream fin2=new FileInputStream("f2.txt");  
	  
	   FileOutputStream fout=new FileOutputStream("D:/FCL/castfeed/f3.txt");	   
	   
	   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
	   int i;  
	   while((i=sis.read())!=-1){  
	    System.out.println((char)i);  
	   } 
	   int j;  
	   while((j = sis.read())!=-1)  
	   {  
	     fout.write(j);      
	   }  
	   fout.close();    
	   sis.close();  
	   fin1.close();  
	   fin2.close();  
	  }  
	}  