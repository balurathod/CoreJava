package com.rathod.oops;
//Not handling the exception...
import java.io.*;
class Sample
{
	//instance variable
	private String name;

	//method to accept name....
	void accept()
	{
		//to acept data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Name: ");
		name=br.readLine();

	}

	//method to display name...
	void display()
	{
        System.out.println("Name="+name);
	}
}
class Ex1
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.accept();
		s.display();
		
	}
}
/*

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac Ex1.java
Ex1.java:15: unreported exception java.io.IOException; must be caught or declare
d to be thrown
                name=br.readLine();
                                ^
1 error




Explianation......



In above prog checked exception is arise...at line 15 in readLine()method.

CHECKED EXCEPTION-the excpcn  objs  for which compiler compells to handle them
                  are k/as CHECKED EXCEPTION.


UNCHECKED EXCEPTION-the excpcn  objs  for which compiler does not compells to
                    handle them are k/as UNCHECKED EXCEPTION.
					OR
					the excpcn  objs  for which JVM compells to handle them
                    are k/as UNCHECKED EXCEPTION.



THROWS- Progmr dont want to handle it.then compiler throw ....Exception 
        out of fum/method. 


THROW- Progmr want to throw an exception explictly wants to  handle it, using
       CATCH block in  fum/method. 


Hence--Throws & throw r contradictory.
*/