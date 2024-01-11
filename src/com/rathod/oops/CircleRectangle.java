package com.rathod.oops;
/*
<applet code="CircleRectangle.class" height=600 width=600>
</applet>

*/
import java.applet.*;
import java.awt.*;

public class CircleRectangle extends Applet implements Runnable
{
	boolean flag;
	int x1=100,y1=100,x2=200,y2=200;
	

	public void init()
	{
		flag=true;
		Thread t = new Thread(this);
		t.start();
		System.out.println("init is called");
		
	}
	
	public void start() {
		System.out.println("start : applet maximized");
		flag=true;
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(x1,y1,x2,y2);
		g.drawOval(x1,y1,x2,y2);
		System.out.println("\t\tpaint is called");
	}

	public void stop()
	{
		System.out.println("stop : applet minimized");
		flag=false;
	}
	

	public void run()
	{
		while(flag)
		{
			x1++;
			y1++;
			x2--;
			y2--;
			//int x1=100,y1=100,x2=200,y2=200;
			
			if(x1>200 || y1>200) {
				x1=100;
				y1=100;
			}
			if(x2<10 || y2<10) {
				x2=200;
				y2=200;
			}
			repaint();
			System.out.println("run is called");
		}
	}
}

