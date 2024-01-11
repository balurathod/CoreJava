package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Event  extends Applet  implements MouseListener 
{
	  public void init()
	{
		addMouseListener(this);
	}
		
		 public void mouseEntered(MouseEvent me)
			{
 				showStatus("this is mouse enter");
			}
		 public void mouseExited(MouseEvent me1)
			{
 				showStatus("this is mouse Exit");
			}
		public void mousePressed(MouseEvent me2)
			{
 				showStatus("this is mouse press");
			}
		public void mouseClicked(MouseEvent me3)
			{
 				showStatus("this is mouse click");
			}
		public void mouseReleased(MouseEvent me4)
			{
 				showStatus("this is mouse relesed");
			}
}



/*
	<applet code="Event.class" width=300 height=300>
	</APPLET>
*/

		

