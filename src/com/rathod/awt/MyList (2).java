import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class MyList extends Applet 
implements ActionListener
{
	List ls;
	TextField tf;
	Button btn1,btn2;
	Label lbl;

	public void init()
	{
		ls = new List();
		tf = new TextField(25);
		btn1 = new Button("Add");
		btn2 = new Button("Remove");
		lbl = new Label("Count is : 0");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		add(ls);
		add(tf);
		add(btn1);
		add(btn2);
		add(lbl);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
	String str = ae.getActionCommand();
	
	if(str.equals("Add"))
	{
		if(tf.getText().trim().length()>0)
		{
			ls.add(tf.getText());
			tf.setText("");
			lbl.setText("Count is :" + ls.getItemCount());
		}
	}
	else
	{
		int x = ls.getSelectedIndex();
	
		if(x!=-1)
		{
			ls.remove(x);
			lbl.setText("Count is :" + ls.getItemCount());
		}	
	}
	
		showStatus("Vedisoft : Java - Module 1 Desktop Technologies");
	}
}
/*
<applet code="MyList.class" height=300 width=400>
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