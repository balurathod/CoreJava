import java.awt.*;
import java.applet.Applet;
public class fontMetrics extends Applet
{
	Font f1;
	int ascent, descent,height,leading;
	String one,two,three,four;
	public void init()
	{
		f1 = new Font("Helvetica",Font.BOLD,14);
	}
	public void paint(Graphics g)
	{
		g.setFont(f1);
		ascent = g.getFontMetrics().getAscent();
		descent = g.getFontMetrics().getDescent();
		height = g.getFontMetrics().getHeight();
		leading  = g.getFontMetrics().getLeading();

		one = " Ascent of font f1 is : " + ascent;
		two = " Descent of font f1 is : " + descent;
		three = " Height of font f1 is : " + height;
		four = " Leading of font f1 is : " + leading;

		g.drawString(one,20,20);				g.drawString(two,20,50);		
		g.drawString(three,20,80);				g.drawString(four,20,110);
	}
}
/* 
<applet code="fontMetrics.class" height=300 width=300>
</applet>
*/