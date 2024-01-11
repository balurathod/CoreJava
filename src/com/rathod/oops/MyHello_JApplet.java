package com.rathod.oops;
/*
  File.......: MyHello_JApplet.java
  Description: Basic JApplet example.  (Run by a browser.)
  Programmer.: Michael Thomas
  Date.......: Updated 09/09/01, Orig 09/09/01

*/
import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;

public class MyHello_JApplet extends JApplet {
  
  public void init() {
    Container objContainer = super.getContentPane();
    objContainer.setBackground( Color.white );
  }
  public void paint(Graphics g) {
    g.drawString("Hello World from JApplet (Swing - JApplet).",10,25);
  }
}