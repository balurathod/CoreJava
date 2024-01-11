import java.awt.*;
import java.applet.Applet;

public class Layout3 extends Applet
{
	Button btn1,btn2,btn3,btn4;
	TextArea ta;
	BorderLayout b;
	
	public void init()
	{
		b = new BorderLayout(10,20);
		setLayout(b);
		btn1= new Button("Top");
		btn2= new Button("Bottom");
		btn3= new Button("Left");
		btn4= new Button("Right");
		ta = new TextArea();
		add(btn1,"North");
		add(btn2,"South");
		add(btn3,"West");
		add(btn4,"East");
		add(ta,"Center");
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
	
	public Insets getInsets()
	{
		return new Insets(25,25,25,25);
	}
}


/*
<applet code="Layout3.class" height=300 width=400>
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