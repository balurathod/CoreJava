package com.rathod.inputOutput;
import java.io.*;  
import java.util.*;  
public class TestSeqInputStrm {
	public static void main(String args[])throws IOException{  
	  
	//creating the FileInputStream objects for all the files  
	FileInputStream fin=new FileInputStream("D:/FCL/castfeed/src/com/rathod/io/JavaCodeRead.java");  
	FileInputStream fin2=new FileInputStream("f2.txt");  
	FileInputStream fin3=new FileInputStream("f1.txt");  
	FileInputStream fin4=new FileInputStream("JavaCodeWrite.java");  
	  
	//creating Vector object to all the stream  
	Vector v=new Vector();  
	v.add(fin);  
	v.add(fin2);  
	v.add(fin3);  
	v.add(fin4);  
	  
	//creating enumeration object by calling the elements method  
	Enumeration e=v.elements();  
	  
	//passing the enumeration object in the constructor  
	SequenceInputStream bin=new SequenceInputStream(e);  
	int i=0;  
	  
	while((i=bin.read())!=-1){  
	System.out.print((char)i);  
	}  
	  
	bin.close();  
	fin.close();  
	fin2.close();  
	}  
	}  