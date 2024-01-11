package com.rathod.oops;
/*
  File.......: MyHello_AppletParms.java
  Description: Basic Applet example.  (Run by a browser.)
  Programmer.: Michael Thomas
  Date.......: Updated 09/27/01, Orig 1/17/99

*/
import java.applet.Applet;
import java.awt.Graphics;

public class MyHello_AppletParms extends Applet {

  private String strFirst, strMiddle, strLast;

  public void init() {
    
    System.out.println("In init() method.");

    this.strFirst  = this.getParameter( "First" );  
    this.strMiddle = this.getParameter( "Middle" );  
    this.strLast   = this.getParameter( "Last" );   
   
  }

  public void paint(Graphics g) {

    System.out.println("In paint() method.");
    
    g.drawString("Example of passing parameters via HTML.",25,25);
    g.drawString("Parm named First = " + this.strFirst, 25, 55 );
    g.drawString("Parm named Middle = " + this.strMiddle, 25, 70 );
    g.drawString("Parm named Last = " + this.strLast, 25, 85 );
  }
}
