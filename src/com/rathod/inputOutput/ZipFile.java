package com.rathod.inputOutput;
import java.io.*;  
import java.util.zip.*;  
public class ZipFile {
	public static void main(String args[]){  
	  
	try{  
	FileInputStream fin=new FileInputStream("JavaCodeWrite.java");  	  
	FileOutputStream fout=new FileOutputStream("JavaCodeWrite.txt");  
	DeflaterOutputStream out=new DeflaterOutputStream(fout);  
	  
	int i;  
	while((i=fin.read())!=-1){  
	out.write((byte)i);  
	out.flush();  
	} 
	
	FileInputStream fin1=new FileInputStream("JavaCodeWrite.txt");  
	InflaterInputStream in=new InflaterInputStream(fin1); 	  
	FileOutputStream fout1=new FileOutputStream("Unzip.java");  
	  
	int j;  
	while((j=in.read())!=-1){  
	fout1.write((byte)j);  
	fout1.flush();  
	}  
	  
	fin.close(); 
	fin1.close(); 
	fout.close();
	out.close();
	fout1.close();
	in.close();
	  
	}catch(Exception e){System.out.println(e);}  
	System.out.println("rest of the code");  
	}  
	}  