package com.rathod.multiThreading;
/* <applet code="MovingText1.class" height=300 width=400>
</applet> */
import java.awt.*;
import java.applet.Applet;

public class MovingText1 extends Applet implements Runnable
{
	Thread mythread=null;
	String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public void start()
	{ 
		mythread =new Thread(this);
		mythread.start();
	}  
 
	public void run()
	{
		while(true)
		{
		String s = str.substring(0,1);
		str = str.substring(1)+s;
                   repaint();
			try
			{
	mythread.sleep(100);
			}
			catch(InterruptedException e){}
		}  
	} 


	public void stop()
	{
		mythread.stop();
		mythread=null;     
	}

	public void paint(Graphics g)
	{
		g.drawString(str,10,10);
	
	}  
}


/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/