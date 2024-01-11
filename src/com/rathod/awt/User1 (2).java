import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class User1 extends Applet implements ActionListener
{
	Button btn1,btn2;
	Label lb1;
	public void init()
	{
		btn1 = new Button("One");
		btn2 = new Button("Two");
		lb1 = new Label("Click On:");

		btn1.setFont(new Font("Arial",Font.BOLD,20));
		btn1.setBackground(Color.red);
		btn1.setForeground(Color.yellow);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		add(btn1);
		add(btn2);
		add(lb1);
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("One"))
			lb1.setText(" One"  );
		else				
			lb1.setText(" Two");
	}
}
/*
<applet code="User1.class" height=300 width=400>
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