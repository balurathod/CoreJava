package com.rathod.awt;

import java.awt.*;
import javax.swing.border.*;

public class CurvedBorder extends AbstractBorder
{
	private Color wallColor = Color.gray;
	private int sinkLevel = 10;

	public CurvedBorder() 
	{ }
		
	public CurvedBorder(int sinkLevel) 
	{
		 this.sinkLevel = sinkLevel; 
	}

	public CurvedBorder(Color wall) 
	{
		this.wallColor = wall; 
	}

	public CurvedBorder(int sinkLevel, Color wall)    
	{
		this.sinkLevel = sinkLevel;
		this.wallColor = wall;
	}

	public void paintBorder(Component c, Graphics g, int x, int y,
                            int w, int h)
	{
		g.setColor(getWallColor());

		for (int i = 0; i < sinkLevel; i++) 
		{
			g.drawRoundRect(x+i, y+i, w-i-1, h-i-1, sinkLevel-i, sinkLevel);
			g.drawRoundRect(x+i, y+i, w-i-1, h-i-1, sinkLevel, sinkLevel-i);
			g.drawRoundRect(x+i, y, w-i-1, h-1, sinkLevel-i, sinkLevel);
			g.drawRoundRect(x, y+i, w-1, h-i-1, sinkLevel, sinkLevel-i);
		}
	}

	public Insets getBorderInsets(Component c) 
	{
		return new Insets(sinkLevel, sinkLevel, sinkLevel, sinkLevel);
	}

	public Insets getBorderInsets(Component c, Insets i) 
	{
		i.left = i.right = i.bottom = i.top = sinkLevel;
		return i;
	}

	public boolean isBorderOpaque()
	 { 
		return true; 
	}
	
	public int getSinkLevel() 
	{
		return sinkLevel; 
	}

	public Color getWallColor() 
	{
		return wallColor; 
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