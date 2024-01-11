package com.rathod.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaCodeRead {
	public static void main(String args[])throws Exception{  
		FileInputStream fin=new FileInputStream("D:/FCL/castfeed/src/com/rathod/io/JavaCodeRead.java");  
		FileOutputStream fout=new FileOutputStream("com.rathod.io.JavaCodeWrite.java");  
		int i=0;  
		while((i=fin.read())!=-1){  
		fout.write((byte)i);  
		}  
		fin.close();  
		}  
}
