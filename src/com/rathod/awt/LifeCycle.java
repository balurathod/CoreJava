package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class LifeCycle extends Applet
{
	public void init()
	{
	showStatus("This is Init");
	for(int i=0;i<100000000;i++);
	}
	public void start()
	{
	showStatus("This is Start");
	for(int i=0;i<100000000;i++);
	}
	public void paint(Graphics g)
	{
	showStatus("This is Paint");
	for(int i=0;i<1000000;i++);
	}
	public void stop()
	{
	showStatus("This is Stop");
	for(int i=0;i<1000000;i++);
	}
	public void destroy()
	{
	showStatus("This is Destroy");
	for(int i=0;i<1000000;i++);
	}
}

/* 
<applet code="LifeCycle.class" width=300 height=300> </applet> 
*/