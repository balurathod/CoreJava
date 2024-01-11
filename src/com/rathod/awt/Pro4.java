package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class Pro4 extends Applet
{
    Image img=null; 
  
    public void init()
		{
		 img=getImage(getCodeBase(),"myImage.gif");		
		} 

    public void paint(Graphics g)
       {


		g.drawImage(img,100,100,this);


	


}
}
/*
<html>
<applet code="Pro4.class" width=550 height=400>
</applet>
</html>
*/