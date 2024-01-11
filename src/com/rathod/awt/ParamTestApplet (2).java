import java.awt.*;
import java.applet.Applet;
public class ParamTestApplet extends Applet
{
	Font f = new Font("Times New Roman",Font.BOLD,40);
	String name;
	public void init()
	{
		name=getParameter("name");
		if(name==null)
			name="Friend";
		name = "Have a nice day " + name;
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString(name,50,50);
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