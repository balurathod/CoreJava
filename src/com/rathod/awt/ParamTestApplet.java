package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class ParamTestApplet extends Applet
{
	Font f = new Font("Times New Roman",Font.BOLD,40);
	String name;
	public void init()
	{
		name=getParameter("name");
		if(name==null)
			name="Friend";
		name = "Have a nice day " + name;
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString(name,50,50);
	}
}