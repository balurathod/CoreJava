package com.rathod.awt;
import java.applet.Applet;
import java.awt.*;

public class drawCBS extends Applet
{
	byte b[] = {100,114,97,119,66,121,116,101,115};
	char c[] = {'d','r','a','w','c','h','a','r','s'};
	String str="drawString example";
	
	public void paint(Graphics g)
	{
		g.drawBytes(b,0,9,100,30);
		g.drawChars(c,2,3,100,60);
		g.drawString(str,100,90);
		g.drawLine(0,100,100,100);
		g.drawRect(50,50,200,200);
		g.fillRect(90,90,150,50);
		g.drawRoundRect(200,200,100,100,10,20);

	}
}

/* 
<applet code="drawCBS.class" height=300 width=300>
</applet>
*/