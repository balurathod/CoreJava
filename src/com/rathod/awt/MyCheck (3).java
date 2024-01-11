import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;

public class MyCheck extends JPanel implements ActionListener
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	Label lbl1,lbl2;
	CheckboxGroup fr;
	TextArea ta;
	Button btn;

	public  MyCheck()
	{
		setLayout(null);
		lbl1 = new Label("Vegetables");
		c1 = new Checkbox("Lady Finger",true);
		c2 = new Checkbox("Potato");
		c3 = new Checkbox("Green Chilly");
		c4 = new Checkbox("Ginger");
		lbl2 = new Label("Fruits");
		fr = new CheckboxGroup();
		c5 = new Checkbox("Mango",true,fr);
		c6 = new Checkbox("Apple",false,fr);
		c7 = new Checkbox("Banana",false,fr);
		c8 = new Checkbox("Grapes",false,fr);
		ta = new TextArea(5,30);
		btn= new Button("Result");

		btn.addActionListener(this);

		lbl1.setBounds(20,10,100,30);
		c1.setBounds(30,40,100,30);
		c2.setBounds(140,40,100,30);
		c3.setBounds(30,100,100,30);
		c4.setBounds(140,100,100,30);

		lbl2.setBounds(20,150,100,30);
		c5.setBounds(30,200,100,30);
		c6.setBounds(140,200,100,30);
		c7.setBounds(30,220,100,30);
		c8.setBounds(140,220,100,30);

		btn.setBounds(100,300,100,30);
		ta.setBounds(20,350,400,400);

		add(lbl1);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(lbl2);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(btn);
		add(ta);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str=new String();
		str = "Vegetables are :";
		if(c1.getState())
			str+="Lady Finger,";
		if(c2.getState())
			str+="Potato";
		if(c3.getState())
			str+="Green Chilly";
		if(c4.getState())
			str+="Ginger";
		str+="\n";
		str+="Fruit is :";

		if(c5.getState())
			str+="Mango";
		else if(c6.getState())
			str+="Apple";
		else if(c7.getState())
			str+="Banana";
		else 
			str+="Grapes";
		ta.setText(str);
	}
	public static void main(String args[])
	{
		JFrame f=new JFrame("MyCheckFrame:");
		f.setContentPane(new MyCheck());
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/
