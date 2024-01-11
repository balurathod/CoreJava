package com.rathod.inputOutput;
//The CharArrayWriter class can be used to write data to multiple files. 
//This class implements the Appendable interface. Its buffer automatically grows when data is 
//written in this stream. Calling the close() method on this object has no effect.
import java.io.*;  
public class CharArrayWriterEx {
	 public static void main(String args[])throws Exception{  
	  
	  CharArrayWriter out=new CharArrayWriter();  
	  out.write("my name is");  
	  
	  FileWriter f1=new FileWriter("a.txt");  
	  FileWriter f2=new FileWriter("b.txt");  
	  FileWriter f3=new FileWriter("c.txt");  
	  FileWriter f4=new FileWriter("d.txt");  
	  
	  out.writeTo(f1);  
	  out.writeTo(f2);  
	  out.writeTo(f3);  
	  out.writeTo(f4);  
	  
	  
	  f1.close();  
	  f2.close();  
	  f3.close();  
	  f4.close();  
	 }  
	}  