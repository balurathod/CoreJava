package com.rathod.inputOutput;
// FW & FR class write and read data from text files. These are character-oriented classes.
import java.io.*;  
public class FileWriterEx {
	 public static void main(String args[]){  
	  try{  
	   FileWriter fw=new FileWriter("abc.txt");  
	   fw.write("my name is sachin");  
	   fw.close();  
	   
	   FileReader fr=new FileReader("abc.txt");  
	   int i;  
	   while((i=fr.read())!=-1)  
	   System.out.println((char)i);  
	   
	   fr.close(); 
	  }catch(Exception e){System.out.println(e);}  
	  System.out.println("success");  
	 }  
	}  