import java.awt.*;
import java.applet.Applet;

public class Clipper extends Applet
{
	public void paint(Graphics g)
	{
		g.clipRect(10,10,150,100);
		g.setFont(new Font("Times Roman",Font.ITALIC,28));
		g.fillOval(100,60,80,80);
		g.drawString("Happy New Year",50,30);
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="Clipper.class" height=300 width=300>
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