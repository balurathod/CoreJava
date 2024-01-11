package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class SmileApplet extends Applet
{
	public void paint(Graphics g)
	{
		Font f = new Font("Helvetica",Font.BOLD,20);
		g.setFont(f);
		g.drawString("Always keep smiling !!",50,30);
		g.drawOval(60,60,200,200);
		g.fillOval(90,120,50,20);
		g.fillOval(190,120,50,20);
		g.drawLine(165,125,165,175);
		g.drawArc(110,130,95,95,0,-180);
		g.drawLine(165,175,150,160);
		showStatus("This is Smiley.");
	}
}
/* 
<applet code="SmileApplet.class" height=300 width=300>
</applet>
*/