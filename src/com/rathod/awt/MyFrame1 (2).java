import java.awt.*;
import java.awt.event.*;

class MyFrame1
{
	public MyFrame1(String str)
	{
	Frame f=new Frame(str);
		f.setVisible(true);
		f.setSize(300,300);
		f.addWindowListener(new W());
	}
	
class W extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);
		}
	}

public static void main(String args[])
	{
		MyFrame1 m = new MyFrame1("Vedisoft : My Frame");
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