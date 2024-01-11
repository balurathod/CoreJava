import java.awt.*;
import java.applet.Applet;
public class MyFirstApplet1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("My First Java Applet",70,30);
	}
}
/*
<applet code="MyFirstApplet1.class" height=300 width=300>
</applet>
*/