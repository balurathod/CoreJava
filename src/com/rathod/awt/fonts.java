package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class fonts extends Applet 
{
	Font f,f1,f2;
	int style,size;
	String s,s1;
	public void init()
	{
		f = new Font("Helvetica",Font.BOLD,20);
		f1 = new Font("Times Roman",Font.BOLD + Font.ITALIC,10);
		f2 = new Font("Courier",Font.ITALIC,20);
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString("Font name is : Helvetica",30,30);
		g.setFont(f1);
	g.drawString("Font name is :Times Roman",30,80);
		g.setFont(f2);
	g.drawString("Font name is : Courier",30,130);
		
		style = f.getStyle();
		if(style==Font.PLAIN)
			s = "Plain";
		else if(style == Font.BOLD)
			s = "Bold";
		else if(style==Font.ITALIC)
			s = "Italic";
		else
			s="Bold and Italic";
		
		size = f2.getSize();
		s1 = f2.getName();
		s1 += " size is " + size + " style is " + s;
		g.drawString(s1,30,180);
	g.drawString("Font Family is : " + f2.getFamily(),30,250);
	}
}
/* 
<applet code="fonts.class" height=300 width=300>
</applet>
*/