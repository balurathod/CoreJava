package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class event1 extends Applet implements MouseListener,MouseMotionListener
{
String str=new String();
int x=0,y=0;
public void init()
{
	addMouseListener(this);
	addMouseMotionListener(this);

}
public void mousePressed(MouseEvent me)
{
	str = "Mouse Pressed";
	x = me.getX();
	y = me.getY();
	repaint();
}
public void mouseReleased(MouseEvent me1)
{
	str = "Mouse Released";
	x = me1.getX();
	y = me1.getY();
	repaint();
}
public void mouseClicked(MouseEvent me2)
{
	str = "Mouse Clicked";
	x = me2.getX();
	y = me2.getY();
	repaint();
}
public void mouseEntered(MouseEvent me3)
{
	str = "Mouse Entered";
	x = me3.getX();
	y = me3.getY();
	repaint();
}
public void mouseExited(MouseEvent me4)
{
	str = "Mouse Exited";
	x = 100;
	y = 200;
	repaint();
}
public void mouseMoved(MouseEvent me5)
{
	str = "Mouse Moved";
	x = me5.getX();
	y = me5.getY();
	repaint();

}

public void mouseDragged(MouseEvent me6)
{
	str = "Mouse Dragged";
	x = me6.getX();
	y = me6.getY();
	repaint();
}
public void paint(Graphics g)
{
	g.drawString(str,x,y);
}
}
/*
<html>
<applet code="event1.class" height=300 width=400>
</applet>
</html>
*/