package com.rathod.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserializedemo {
public static void main(String[] args) {
	try{
		FileInputStream stream=new FileInputStream("D:/shyama/CoreExample/Employee.ser");
		ObjectInputStream inputStream=new ObjectInputStream(stream);
		Employee e=(Employee) inputStream.readObject();
		System.out.println(e.SSN);
		System.out.println(e.name);
		System.out.println(e.number);
		System.out.println(e.address);
		Employee e1= new Employee();
		e1.setAddress("bangalore");
		e1.setName("ngadndra");
		e1.setNumber(121341233);
		e1.setSSN(72655);
		FileOutputStream stream2=new FileOutputStream("D:/shyama/CoreExample/Employee.ser");
		ObjectOutputStream stream3=new ObjectOutputStream(stream2);
		stream3.writeObject(stream2);
		System.out.println("the file is appended to end");
		stream2.close();
		stream3.close();
		inputStream.close();
		stream.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
