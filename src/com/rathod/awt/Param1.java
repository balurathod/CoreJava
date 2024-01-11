package com.rathod.awt;
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
}


}





