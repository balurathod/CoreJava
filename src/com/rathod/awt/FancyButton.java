package com.rathod.awt;
import java.awt.*;
import javax.swing.*;
public class FancyButton extends JButton
{
public FancyButton(Icon icon,Icon pressed,Icon rollover)
	{
		super(icon);
		setFocusPainted(false);
		setRolloverEnabled(true);
		setPressedIcon(pressed);
		setRolloverIcon(rollover);
		setBorderPainted(false);
		setContentAreaFilled(false);
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