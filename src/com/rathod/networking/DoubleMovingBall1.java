package com.rathod.networking;
import java.awt.*;
import java.applet.Applet;
public class DoubleMovingBall1 extends Applet implements Runnable
{
	Thread mythread1=null;
	Thread mythread2=null;
	Thread mythread3=null;
	Thread mythread4=null;
	int pos1=0;
	int pos2=getSize().width;
	int pos3=0;
	int pos4=getSize().height;

	public void start()
	{
		mythread1=new Thread(this);
		mythread2=new Thread(this);
		mythread3=new Thread(this);
		mythread4=new Thread(this);
		mythread1.start();
		mythread2.start();
		mythread3.start();
		mythread4.start();
	}

	public void run()
	{
		while(true)
		{
			for(pos1=0;pos1<getSize().width;pos1+=5)
			{
				repaint();
				try
				{
					mythread1.sleep(50);
				}
				catch(InterruptedException e)      
				{              }
			}

			for(pos2=getSize().width;pos2>1;pos2-=5)
			{
				repaint();
				try
				{
					mythread2.sleep(50);
				}
				catch(InterruptedException e)   {       }
                           
			}

			for(pos3=0;pos3<getSize().height;pos3+=5)
			{
				repaint();
				try
				{
					mythread3.sleep(50);
				}
				catch(InterruptedException e)   {       }
			}

			for(pos4=getSize().height;pos4>0;pos4-=5)
			{
				repaint();
				try
				{
					mythread4.sleep(50);
				}
				catch(InterruptedException e)      {              }

			}

		}                  
  
              }

	public void stop()
	{ 
		mythread1.stop();
		mythread2.stop();
		mythread3.stop();
		mythread1=null;
		mythread2=null;
		mythread3=null;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.red) ;
		g.fillOval(pos1,50,30,30);
		g.setColor(Color.black);
		g.fillOval(pos1+6,58,5,5);
		g.fillOval(pos1+20,58,5,5);
		g.drawLine(pos1+15,58,pos1+15,68);
		g.drawLine(pos1+12,68,pos1+15,68);
		g.drawArc(pos1 ,45,30,30,-50,-70) ;
		g.setColor(Color.red) ;
		g.fillOval(pos2-30,getSize().height-50,30,30);
		g.setColor(Color.black);
		g.fillOval(pos2-30+6,getSize().height-42,5,5);
		g.fillOval(pos2-30+20,getSize().height-42,5,5);
		g.drawLine(pos2-30+15,getSize().height-42,pos2-30+15, getSize().height-32);
		g.drawLine(pos2-30+12,getSize().height-32,pos2-30+15,getSize().height-32);
		g.drawArc(pos2-30,getSize().height-55,30,30,-50,-70);
		g.setColor(Color.red) ;
		g.fillOval(getSize().width-30,pos3+50,30,30);
		g.setColor(Color.black);
		g.fillOval(getSize().width-30+6,pos3+58,5,5);
		g.fillOval(getSize().width-30+20,pos3+58,5,5);
		g.drawLine(getSize().width-30+15,pos3+58,getSize().width-30+15,pos3+68);
		g.drawLine(getSize().width-30+12,pos3+68,getSize().width-30+15,pos3+68);
		g.drawArc(getSize().width-30,pos3+45,30,30,-50,-70) ;
		g.setColor(Color.red) ;
		g.fillOval(0,getSize().height-30,30,30);
		g.setColor(Color.black);
		g.fillOval(6,getSize().height-22,5,5);
		g.fillOval(20,getSize().height-22,5,5);
		g.drawLine(15,getSize().height-22,15,getSize().height-12);
		g.drawLine(12,getSize().height-12,15,getSize().height-12);
		g.drawArc(0,getSize().height-35,30,30,-50,-70);
	}
}   
/* <applet code="DoubleMovingBall1.class" height=300 width=400>
</applet> */            

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/
                               
      