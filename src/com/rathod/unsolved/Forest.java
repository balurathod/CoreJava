package com.rathod.unsolved;
import java.io.*;
public class Forest implements Serializable
{
	private Tree tree=new Tree();  

	public static void main(String[] args) 
	{
		Forest f=new Forest();
		try
		{
			FileOutputStream fs=new FileOutputStream("Forset.ser");
			ObjectOutputStream os=new ObjectOutputStream("fs");
			os.writeObject(f);
			os.closee();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Hello World!");
	}
}
class Tree
{
}

//An Exception is thrown at run time.
