package com.rathod.inputOutput;
import java.io.*;  
class TestFile{  
  public static void main(String args[]){  
   /*try{  
		 FileOutputStream fout=new FileOutputStream("abc.txt"); //write content on file 
	     String s="Sachin Tendulkar is my favourite player";  
	     byte b[]=s.getBytes();//converting string into byte array  
	     fout.write(b);  
	     fout.close();  
	     System.out.println("success...");  
    }catch(Exception e){System.out.println(e);} 
    */try{  
        FileInputStream fin=new FileInputStream("abc.txt");  //read file content
        int i=0;  
        while((i=fin.read())!=-1){  
         System.out.println((char)i);  
        }  
        fin.close();  
      }catch(Exception e){System.out.println(e);} 
   }  
}  