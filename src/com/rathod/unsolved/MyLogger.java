package com.rathod.unsolved;
//90
public class MyLogger 
{
	private StringBuilder logger=new StringBuilder();
	public void log(String message,String user)
	{
		logger.append(message);
	    logger.append(user);
	}
/*	public static void main(String ss[])
	{
		MyLogger ml = new MyLogger();
		ml.log("Hi" , "BALU");
	}
*/}
//A-Synchronize d log method.