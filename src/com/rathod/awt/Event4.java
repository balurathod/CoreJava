package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.Rectangle;

public class Event4 extends Applet
{
	String str=" ";
	Rectangle c, r;
	Polygon p;
	int x,y;
	int xs[] = {50,90,100,50};
	int ys[]={150,150,200,200};

	public void init()
	{   
		c=new Rectangle(10,30,50,50);
		r=new Rectangle(100,30,50,50);
		p=new Polygon(xs,ys,4);
		addMouseListener(new A());
	}  
	

	class A extends MouseAdapter
	{
		public void mouseClicked(MouseEvent m)
		{
			x=m.getX();
			y=m.getY();
			int p=getShape(x,y);
			System.out.println(" "+ x+ " "+y+" "+p);
			if(p==1)
				str="Circle";
			else if(p==2)
				str="Rectangle";
			else if(p==3)
				str="Polygon";
			else
				str="Blank Area";
			repaint();
		}
	}
	
	public int getShape(int x,int y)
	{
		if(c.contains(x,y))
			return 1;
		else if(r.contains(x,y))
			return 2;
		else if(p.contains(x,y))
			return 3;
		return (-1);   
	}
 
	public void paint(Graphics g)
	{
		g.drawOval(10,30,50,50);
		g.drawRect(100,30,50,50);
		g.drawPolygon(xs,ys,4);
		Font f1=new Font("MS Serif",Font.BOLD,10);
		g.setFont(f1);
		g.setColor(Color.red);
		g.drawString(str,x,y);
	}    
 
}

/*
<html>
<applet code="Event4.class" width=500 height=450>
</applet>
</html>
*/