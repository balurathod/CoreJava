package com.rathod.oops;
public class SynchronizedMessage
{
	public static void main(String args[])
	{
	  FormatMessage formatter = new FormatMessage();
	  MessageThread t1 = new MessageThread(formatter,"Ken Arnold");
	  MessageThread t2 = new MessageThread(formatter,"James Gosling - Creator of Java");
	  MessageThread t3 = new MessageThread(formatter,"David Holmes");
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e)
		{
			
		}
	} 
}

class FormatMessage
{
	public void show(String msg)
	{
		synchronized (this)
		{
			System.out.print((char)201);

			for(int i=0;i<msg.length()+2;i++)
				System.out.print((char)205);

			System.out.print((char)187); 
			System.out.println(); 

			try
			{
				Thread.sleep(1000);
				System.out.println( ((char)186) + " "+ msg + " "+((char)186));
			}
			catch (InterruptedException e)
			{
				return;			
			}

			System.out.print((char)200);

			for(int i=0;i<msg.length()+2;i++)
				System.out.print((char)205);

			System.out.print((char)188); 
			System.out.println(); 
		}
	}
}

class MessageThread extends Thread
{
	FormatMessage formatter;
	String text;
	
	public MessageThread(FormatMessage formatter, String text)
	{
		this.formatter = formatter;
		this.text = text;
	}

	public void run()
	{
		formatter.show(text);
	}
}

