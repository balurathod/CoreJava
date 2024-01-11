import java.applet.Applet;
import java.awt.*;
public class DrawCBS extends Applet
{
	byte b[] = {100,114,97,119,66,121,116,101,115};
	char c[] = {'d','r','a','w','c','h','a','r','s'};
	String str="drawString example";
	public void paint(Graphics g)
	{
	g.drawBytes(b,0,9,100,30);
	g.drawChars(c,2,3,100,60);
	g.drawString(str,100,90);
	showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}

/* 
<applet code="DrawCBS.class" height=300 width=300>
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