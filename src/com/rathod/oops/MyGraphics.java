package com.rathod.oops;
/* File.......: MyGraphics.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
   Compile....: javac MyGraphics.java -d bin

   Run Browser: MyGraphics.html
   Run JDK....: appletviewer MyGraphics.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.*;

//***********************************************************************
public class MyGraphics extends Applet
//***********************************************************************
{

//-----------------------------------------------------------------------
  public void init()
  { 
    setBackground( Color.white );

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  { setBackground( Color.white );


  } //paint()

} //class MyGraphics





