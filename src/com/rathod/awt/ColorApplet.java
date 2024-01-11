package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class ColorApplet extends Applet
{
	public void paint(Graphics g)
	{
	Font f = new Font("Times Roman",Font.BOLD,20);
	Font f1 = new Font("Courier",Font.ITALIC,20);
	Font f2 = new Font("Helvetica",Font.PLAIN,20);
		g.setColor(Color.gray);
		g.setFont(f);
		g.drawString(" Be happy . Be hopeful",30,30);
		g.setColor(Color.blue);
		g.setFont(f1);			
		g.drawString(" Be happy . Be hopeful",30,80);
		g.setColor(Color.pink);
		g.setFont(f2);			
		g.drawString(" Be happy . Be hopeful",30,110);
		setBackground(Color.red);
	}
}
/* 
<applet code="ColorApplet.class" height=300 width=300>
</applet>
*/