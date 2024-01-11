package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class AppletFun extends Applet
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paint(Graphics g)
 {
   g.drawLine(30,40,100,80);
 }
}
/*<Applet code="AppletFun.class" width=500 height=500> </applet>*/