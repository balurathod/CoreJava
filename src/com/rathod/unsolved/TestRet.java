package com.rathod.unsolved;
import java.io.*;
class  TestRet
{
	public int myMethod1() throws EOFException
	{
        return myMethod2();
	}
	public int myMethod2()
	{
       //code dat actualy could throw d excp goes here.
	   return 0;     //return is must bcz this method is declare in anther metd. 
	}
	public void myMethod3()
	{
		//code dat could throw a NullPtrExcption goes here
	}
	public static void main(String[] args) 
	{
	}
}

//what is role of RETURN here?