package com.rathod.oops;
/*
  File.......: MyHello_AppletObjectTag.java
  Description: Basic Applet example.  (Run by a browser.)
  Programmer.: Michael Thomas
  Date.......: Updated 12/12/01, Orig 12/12/01

*/
import java.applet.Applet;
import java.awt.Graphics;

public class MyHello_AppletObjectTag extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello World from an Applet.",25,25);
  }
}
