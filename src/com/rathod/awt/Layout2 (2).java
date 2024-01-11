import java.awt.*;
import java.applet.Applet;

public class Layout2 extends Applet
{
	Button btn[];
	GridLayout g;
	
	public void init()
	{
		g = new GridLayout();
		g.setRows(5);
		g.setColumns(6);
		g.setHgap(10);
		g.setVgap(15);
		setLayout(g);
		btn= new Button[30];
	
		for(int i = 0 ; i < btn.length;i++)
		{
		btn[i] = new Button("Button : " + (i+1));
		add(btn[i]);
		}
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
	
	public Insets getInsets()
	{
	return new Insets(25,50,75,100);
	}
}

/*
<applet code="Layout2.class" height=300 width=400>
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