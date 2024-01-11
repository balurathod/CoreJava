import java.awt.*;
import javax.swing.*;
public class MyTab extends JPanel
{
	JTabbedPane jtb;
	public MyTab(String title)
	{
		jtb = new JTabbedPane();
		jtb.addTab("Colors",new MyColors());
		jtb.addTab("Cities",new MyCities());
		jtb.addTab("Flavors",new MyFlavors());
		jtb.setTabPlacement(SwingConstants.BOTTOM);
		add(jtb);
	}
class MyColors extends JPanel
	{
		public MyColors()
		{
			add(new JButton("Red"));
			add(new JButton("Green"));
			add(new JButton("Blue"));
		}
	}
class MyFlavors extends JPanel
	{
		public MyFlavors()
		{
			add(new JButton("Vanilla"));
			add(new JButton("StrawBerry"));
			add(new JButton("PineApple"));
		}
	}
class MyCities extends JPanel
	{
		public MyCities()
		{
		add(new JButton("Delhi"));
		add(new JButton("Chandigarh"));
		add(new JButton("Bhopal"));
		}
	}
	public static void main(String args[])
	{
		JFrame f=new JFrame("MyTab:");
		f.setContentPane(new MyTab("MyTab"));
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