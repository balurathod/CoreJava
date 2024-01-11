package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class ImageDemo extends Applet
{
	Image img;
	public void init()
	{
	img = getImage(getCodeBase(),"abc.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,30,30,this);
		setBackground(Color.yellow);	
}
}

/*
<applet code="ImageDemo.class" height=300 width=300>
</applet>
*/