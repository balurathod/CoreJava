package com.rathod.oops;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;  
class Persist implements Serializable{  
	 int id;  
	 String name;
	 transient int age;//Now it will not be serialized  
	 public Persist(int id, String name, int age) {  
	  this.id = id;  
	  this.name = name;
	  this.age = age;
	 }  
	}

public class Serialzcn{  
	 public static void main(String args[])throws Exception{  
	  Persist s1 =new Persist(211,"ravi",22);  	 					//obj creation 
	  FileOutputStream fout=new FileOutputStream("serlzObj.txt");   //writing object into file  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  	  
	  out.writeObject(s1);  
	  out.flush();  
	  //Desrlzcn
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/FCL/castfeed/serlzObj.txt"));  
	  Persist s=(Persist)in.readObject();  
	  System.out.println(s.id+" "+s.name+" "+s.age);  
	  in.close();  
	  System.out.println("success");  
	 }  
	}  