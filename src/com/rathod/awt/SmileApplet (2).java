import java.awt.*;
public class SmileApplet extends java.applet.Applet
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
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="SmileApplet.class" height=300 width=400>
</applet>
*/

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/