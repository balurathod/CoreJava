import java.awt.*;
import  java.applet.Applet;
public class MyApplet extends Applet
{
	Label lbl;
	public void init()
	{
		lbl = new Label("My Label");
	Font f = new Font("Arial",Font.BOLD,20);
	lbl.setBackground(Color.red);
	lbl.setForeground(Color.green);
	lbl.setFont(f);
	add(lbl);
	}
	public void paint(Graphics g)
	{
	lbl.setBounds(50,50,100,50);
	}
}

/*  <applet code="MyApplet.class" width=300 height=300></applet>
*/
