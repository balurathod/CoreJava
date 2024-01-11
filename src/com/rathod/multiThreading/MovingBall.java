package com.rathod.multiThreading;
/* <applet code="MovingBall.class" height=300 width=400>
</applet> */

import java.awt.*;
import java.applet.Applet;
public class MovingBall extends Applet implements Runnable
{
	Thread mythread=null;
	int position =0;

	public void start()
	{ 
		mythread =new Thread(this);
		mythread.start();
	}  
 
	public void run()
	{
		while(true)
		{
			for(position=0;position<getSize().width;position+=5)
			{
				repaint();
				try
				{
					mythread.sleep(50)  ;
				}
				catch(InterruptedException e)
				{                  }
			}
		}  
	} 

	public void stop()
	{
		mythread.stop();
		mythread=null;     
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.red) ;
		g.fillOval(position,50,30,30);
		g.setColor(Color.black);
		g.fillOval(position+6,58,5,5);
		g.fillOval(position+20,58,5,5);
		g.drawLine(position+15,58,position+15,68);
		g.drawLine(position+12,68,position+15,68);
		g.drawArc(position ,45,30,30,270,-310) ;
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