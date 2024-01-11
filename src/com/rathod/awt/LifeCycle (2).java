import java.awt.*;
import java.applet.Applet;
public class LifeCycle extends Applet
{
	public void init()
	{
	showStatus("This is Init");
	for(int i=0;i<100000000;i++);
	}
	public void start()
	{
	showStatus("This is Start");
	for(int i=0;i<100000000;i++);
	}
	public void paint(Graphics g)
	{
	showStatus("This is Paint");
	for(int i=0;i<1000000;i++);
	}
	public void stop()
	{
	showStatus("This is Stop");
	for(int i=0;i<1000000;i++);
	}
	public void destroy()
	{
	showStatus("This is Destroy");
	for(int i=0;i<1000000;i++);
	showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="LifeCycle.class" height=300 width=400>
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