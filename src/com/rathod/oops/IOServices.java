package com.rathod.oops;
import java.io.*;

public class IOServices
{

	public static int getInt() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		int temp = Integer.parseInt(buff.readLine());
		return temp;
	}
	public static String getString() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		String temp = buff.readLine();
		return temp;
	}

}