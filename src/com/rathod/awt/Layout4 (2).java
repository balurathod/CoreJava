import java.awt.*;
import java.applet.Applet;

public class Layout4 extends Applet
{
	Panel p1,p2,p3;
	public void init()
	{
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.setLayout(new BorderLayout(10,10));
		p3.setLayout(new GridLayout(3,3));
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.blue);
		setBackground(Color.yellow);
		setLayout(new GridLayout(3,1,20,20));

		for(int i=0;i<10;i++)
			p1.add(new Button("Button :" + (i + 1)));

		p2.add(new Button("Top"),"North");	
		p2.add(new Button("Bottom"),"South");	
		p2.add(new Button("Left"),"West");	
		p2.add(new Button("Right"),"East");	
		p2.add(new TextArea(),"Center");	

		for(int i=0;i<10;i++)
			p3.add(new Button("Button :" + (i + 1)));

		add(p1);
		add(p2);
		add(p3);
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}

		public Insets getInsets()
	{
		return new Insets(10,30,60,90);

	}
}
/*
<applet code="Layout4.class" height=300 width=400>
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