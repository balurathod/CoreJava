import java.awt.*;
import java.applet.Applet;

public class Param1 extends Applet
{
	String name=new String();
	String fname=new String();
	int style=0,size=0;
	public void init()
	{
		name = getParameter("Name");
		fname = getParameter("FName");
		size = Integer.parseInt(getParameter("Size"));
		String tp = getParameter("Style");
		if (tp.equals("Bold"))
		style=Font.BOLD;
		else if (tp.equals("Italic"))
		style=Font.ITALIC;
		else 
		style=Font.PLAIN;
	}
	
	public void paint(Graphics g)
	{
		g.setFont(new Font(fname,style,size));
		g.drawString(name,100,100);
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/