package com.rathod.multiThreading;
/* <applet code="MovingText.class" height=300 width=400>
</applet> */
import java.awt.*;
import java.applet.Applet;

public class MovingText extends Applet implements Runnable
{
	Thread mythread=null;
	int x =0,y=0;
	Color c =new Color(0,0,0);
	char a;
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
	x = (int )(Math.random() * getSize().width);
	y = (int )(Math.random() * getSize().height);
	int r = (int)(Math.random() * 255d);	
	int g = (int)(Math.random() * 255d);
	int b = (int)(Math.random() * 255d);	
	c = new Color(r,g,b);
	a=str.charAt((int)(Math.random()*26));		                   repaint();
			try
			{
	mythread.sleep((int)(Math.random()*10));
			}
			catch(InterruptedException e){}
		}  
	} 


	public void stop()
	{
		mythread.stop();
		mythread=null;     
	}

	public void update(Graphics g)
	{
		g.setColor(c) ;
		g.drawString(String.valueOf(a),x,y);
	
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