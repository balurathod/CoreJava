package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class Pc extends Applet
{
Color keycolor= new Color(0,0,0);
Color keybgcolor= new Color(0,0,0);
Color mfrcolor= new Color(0,0,0);
Color mbgcolor= new Color(0,0,0);
Color cpucolor= new Color(0,0,0);

public static int resultR(String str)
{/*String str1=getParameter(str);*/
int x=str.indexOf(",");
String temp=new String(str.substring(0,x));
int r=Integer.parseInt(temp);
return r;
}
public static int resultG(String str)
{/*String str1=getparameter(str);*/
int x=str.indexOf(",");
int y=str.lastIndexOf(",");
String temp=new String(str.substring(x+1,y));
int g=Integer.parseInt(temp);
return g;
}
public static int resultB(String str)
{/*String str1=getparameter(str);*/
int y=str.lastIndexOf(",");
String temp=new String(str.substring(y+1));
int b=Integer.parseInt(temp);
return b;
}
public void init()
{
keycolor=new Color(Pc.resultR(getParameter("keycolor")),Pc.resultG(getParameter("keycolor")),Pc.resultB(getParameter("keycolor")));
keybgcolor=new Color(Pc.resultR(getParameter("keybgcolor")),Pc.resultG(getParameter("keybgcolor")),Pc.resultB(getParameter("keybgcolor")));
mfrcolor=new Color(Pc.resultR(getParameter("mfrcolor")),Pc.resultG(getParameter("mfrcolor")),Pc.resultB(getParameter("mfrcolor")));
mbgcolor=new Color(Pc.resultR(getParameter("mbgcolor")),Pc.resultG(getParameter("mbgcolor")),Pc.resultB(getParameter("mbgcolor")));
cpucolor=new Color(Pc.resultR(getParameter("cpucolor")),Pc.resultG(getParameter("cpucolor")),Pc.resultB(getParameter("cpucolor")));
}
public void paint(Graphics g)
{
g.setColor(mfrcolor);
g.drawRect(300,300,250,250);
setBackGround(mbgcolor);
g.drawRect(270,310,280,260);
g.setColor(keycolor);
g.drawRect(200,200,400,150);
setBackGround(keybgcolor);
g.drawRect(210,195,390,155);
g.setColor(cpucolor);
g.drawRect(200,200,150,300);
}}

