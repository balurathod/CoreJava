package com.rathod.oops;
/*
  File.......: MyHello_Applet.java
  Description: Basic Applet example.  (Run by a browser.)
  Programmer.: Michael Thomas
  Date.......: Updated 1/22/99, Orig 1/17/99
  Compile....: Myjavac Hello_Applet.java -d bin  (dir .\bin)
  Run........: Internet Browser or appletviewer Hello_Applet.html

*/
import java.applet.Applet;
import java.awt.Graphics;

public class MyHello_Applet extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello World from an Applet.",25,25);
  }
}
