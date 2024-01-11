import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyCheckApplet extends JApplet 
{


	public void init()
	{
	     setContentPane(new MyCheck()); 
	}

}
/* 
<applet code="MyCheckApplet.class" width=500 height=500></applet>
*/