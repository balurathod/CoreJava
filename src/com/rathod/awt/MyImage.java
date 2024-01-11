package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;

public class MyImage extends Applet
{
	Image img=null; 
	
	public void init()
	{
		 img=getImage(getCodeBase(),"images.jpg");		} 

	public void paint(Graphics g)
	{
		g.drawImage(img,100,100,this);
	}
}
/*
<html>
<applet code="MyImage.class" width=550 height=400>
</applet>
</html>
*/