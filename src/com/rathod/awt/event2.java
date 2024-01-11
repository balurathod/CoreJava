package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class event2 extends Applet 
{
String str=" ";
int x,y;
public void init()
{
	addMouseListener(new M());
	addMouseMotionListener(new MM());
}
class M extends MouseAdapter
{
public void mouseClicked(MouseEvent me2)
{
	str = "Mouse Clicked";
	x = me2.getX();
	y = me2.getY();
	repaint();
}
}
class MM extends MouseMotionAdapter
{
public void mouseMoved(MouseEvent me5)
{
	str = "Mouse Moved";
	x = me5.getX();
	y = me5.getY();
	repaint();
}
}
public void paint(Graphics g)
{
	g.drawString(str,x,y);
}
}
/*
<html>
<applet code="event2.class" height=300 width=400>
</applet>
</html>
*/