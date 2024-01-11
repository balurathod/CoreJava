package com.rathod.oops;
/*
  File.......: MyHello_Applet.java
  Description: Basic Applet example.  (Run by a browser.)
  Programmer.: Michael Thomas
  Date.......: Updated 03/03/06, Orig 03/03/06
  Compile....: Myjavac MyHello_AppletCompileJDK12.java -d bin  (dir .\classes)
  Run........: Internet Browser (MS JVM or Sun JVM) or appletviewer Hello_Applet.html

*/
import java.applet.Applet;
import java.awt.Graphics;

public class MyHello_AppletCompileJDK12 extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello World from an Applet.",25,25);
  }
}
