package com.rathod.unsolved;
//java.io.Consle(for physical device vt kb & moni) calss new for JAVA6
import java.io.Console;
public class  Console1
{
	public static void main(String[] args) 
	{
		Console1 c = new System.console1();               //1
		char [] pw;
		
		pw= c.readPassword("%s" , "pw : ");             //2
		
		for (char ch : pw)
		c.format("%c" ,ch );                            //3
		c.format("\n");
		
		MyUtility mu = new MyUtility();
         while (true)
         {
			 name = c.readLine("%s","input?: ");            //4
			 c.format("output: %s  \n " ,mu.doStuff(name));
         }
		
	}
}

class MyUtility                             //5
{
	String doStuff(String arg1)  //meaning ?
	{
		//stub code ...
		return "result is " + arg1;
	}
}