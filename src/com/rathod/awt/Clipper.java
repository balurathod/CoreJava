package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class Clipper extends Applet
{
	public void paint(Graphics g)
	{
	//	g.clipRect(10,10,150,100);
		g.setFont(new Font("Times Roman",Font.ITALIC,28));
		g.fillOval(100,60,80,80);
		g.drawString("Happy New Year",50,30);
	}
}
/*
<applet code="Clipper.class" height=300 width=300>
</applet>
*/