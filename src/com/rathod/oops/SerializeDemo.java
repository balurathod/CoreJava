package com.rathod.oops;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class SerializeDemo {
public static void main(String[] args) {
	Employee e=new Employee();
	e.SSN=72488;
	e.name="shyama";
	e.number=808039212;
	e.address="pune";
	Employee e2=new Employee();
	e2.SSN=724881;
	e2.name="shyama1";
	e2.number=808039212;
	e2.address="pune1";
	
	try{
		FileOutputStream stream=new FileOutputStream("D:/shyama/CoreExample/Employee.ser");
		ObjectOutputStream stream2=new ObjectOutputStream(stream);
		stream2.writeObject(e);
		stream2.close();
		stream.close();
		System.out.println("Serialized data is saved in Employee.ser");
		
		
		
		
		}
	catch(Exception e1){
		e1.printStackTrace();
	}
	
	
}
}
