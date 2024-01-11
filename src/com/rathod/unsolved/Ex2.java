package com.rathod.unsolved;
//Handling the exception...
import java.io.*;
class Sample
{
	//instance variable
	private String name;
	private String Mobile_No;   //how to enter this using int.

	//method to accept name....
	void accept() throws IOException
	{
		//to acept data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Name: ");
		name=br.readLine();     //Factory metd(read a line of text) of class BufferedReader.
		System.out.print("Enter Mobile_No: ");
		Mobile_No=br.readLine();
	}

	//method to display name...
	void display()
	{
        System.out.println("Name=" + name);
		System.out.println("Mobile_No=" + Mobile_No);
		//System.out.println("Name=" + toUpperCase(name)); //why error?
	}
}
class Ex2
{
	public static void main(String[] args) throws IOException 
	{
		Sample s=new Sample();
		s.accept();
		s.display();
		
	}
}
/*

G:\SCJP\Query>javac Ex2.java

G:\SCJP\Query>java Ex2
Enter Name: DOLLY RATHOD
Name=DOLLY RATHOD

G:\SCJP\Query>java Ex2
Enter Name:
Name=


G:\SCJP\Query>javac Ex2.java

G:\SCJP\Query>java Ex2
Enter Name: ARUN
Enter Mobile_No: 9922170237     (in string format not int)
Name=ARUN
Mobile_No=9922170237 -->this pocble due to RULE-Finally everthing in JAVA is STRING.

G:\SCJP\Query>
*/