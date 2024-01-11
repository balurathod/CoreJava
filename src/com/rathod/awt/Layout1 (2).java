import java.awt.*;
import java.applet.Applet;

public class Layout1 extends Applet
{
	Button btn[];
	FlowLayout f;
	public void init()
	{
		btn =  new Button[5];
		f = new FlowLayout();
		f.setAlignment(FlowLayout.RIGHT);
		f.setHgap(60);
		f.setVgap(60);
		setLayout(f);
	
		for(int i=0;i<btn.length;i++)
		{
		btn[i]=new Button("Button : " + (i + 1));
		add(btn[i]);
		}
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="Layout1.class" height=300 width=400>
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