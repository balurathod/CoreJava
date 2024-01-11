import java.awt.*;
import java.applet.Applet;
public class MemoryImage extends Applet
{
	Image img;
	public void init()
	{
		Font f = new Font("Times Roman",Font.ITALIC,28);
		img = createImage(300,75);
		Graphics gimg = img.getGraphics();
		gimg.setColor(getBackground());
		gimg.fillRect(0,0,300,75);
		gimg.setColor(Color.pink);
		gimg.setFont(f);
		gimg.drawString("Hello World",20,20);
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,50,30,this);
	}
}
/*
<applet code="MemoryImage.class" height=300 width=300>
</applet>
*/