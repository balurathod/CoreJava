package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Event3 extends Applet 
{
	String str=new String();
	int x=0,y=0;
	
	public void init()
	{
		addMouseListener(new A());
		addMouseMotionListener(new B());
	}
	
	class A extends MouseAdapter
	{
		public void mousePressed(MouseEvent m1)
		{
			str = "Mouse Pressed";
			x = m1.getX();
			y = m1.getY();
			repaint();
		}

		public void mouseExited(MouseEvent m2)
		{
			str = "Mouse Exited";
			x = 100;
			y = 200;
			repaint();
		}
	}

	class B extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent m3)
		{
			str = "Mouse Moved";
			x = m3.getX();
			y = m3.getY();
			repaint();
		}
	}

	public void paint(Graphics g)
	{
		g.drawString(str,x,y);
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="Event3.class" height=300 width=400>
</applet>
*/

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/