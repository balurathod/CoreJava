import java.awt.*;
import java.applet.Applet;

public class ColorApplet extends Applet
{
	Font f;
	Font f1;
	Font f2;

	public void init()
	{
		f = new Font("Times Roman",Font.BOLD,20);
		f1 = new Font("Courier",Font.ITALIC,20);
		f2 = new Font("Helvetica",Font.PLAIN,20);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.setFont(f);
		g.drawString(" Be happy . Be hopeful",30,30);
		g.setColor(Color.blue);
		g.setFont(f1);			
		g.drawString(" Be happy . Be hopeful",30,80);
		g.setColor(Color.pink);
		g.setFont(f2);			
		g.drawString(" Be happy . Be hopeful",30,110);
		setBackground(Color.cyan);
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="ColorApplet.class" height=300 width=400>
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