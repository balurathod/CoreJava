package com.rathod.oops;
/* File.......: MyTraining.java
   Author.....: Michael Thomas 02/10/99, ver 1.0 - 02/10/99
                      
   Compile....: javac MyTraining.java -d bin

   Run Browser: MyTraining.html
   Run JDK....: appletviewer MyTraining.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)
import java.awt.Color;      //needed for: Color

//***********************************************************************
public class MyTraining extends Applet
//***********************************************************************
{ final  int YSKIP        = 15;               //Y pixel skip increment. (Row Width)
  final  int XCOL1        = 25;               //Column 1, Screen positioning
  final  int XCOL2        = 400;              //Column 2, Screen positioning
  public final  int XPOS1 = 0;                //X Axis - position 1
  public final  int XPOS2 = XPOS1+YSKIP;      //X Axis - position 2
  public final  int XPOS3 = XPOS2+YSKIP;      //X Axis - position 3

         int intLineNum   = 0;   //Line # to display on screen.
         int XCol         = 0;
         int YPos         = 0;   //Row pointer (Y axis)

         Graphics myg;

//-----------------------------------------------------------------------
  public void init()
  { setBackground( Color.white );
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  { 
    this.myg   = g;
    YPos       = YSKIP;
    intLineNum = 1;  //Must initialize here, because paint() frequently.
    XCol       = XCOL1;

    Show( "Here we are.  Find me in the source code!",XPOS1);
    Show( "How did this line get indented?",XPOS2);
    Show( "Find out why is line #3.",XPOS3);
    Show( "Java primative data types can be displayed. ex: "+10,XPOS1);
    Show( "Column pixel's for Column #1: XCOL1 = "+XCOL1,XPOS2);
    Show( "Row pixel skip value: YSKIP = "+YSKIP,XPOS2);
    Show( "Indent values: XPOS1 = "+XPOS1+", XPOS2 = "+XPOS2+
                        ", XPOS3 = "+XPOS3,XPOS2);

    YPos       = YSKIP;
    XCol       = XCOL2;

    Show( "How did this line get to column #2 ?",XPOS1 );
    Show( "Column pixel's for Column #2: XCOL2 = "+XCOL2,XPOS2);

    Show("Finished: Training",XPOS1);

  } //paint()

//-----------------------------------------------------------------------
  void Show( String strMsg, int XPos )
  { myg.drawString( Integer.toString(intLineNum), XCol,         YPos);
    myg.drawString( strMsg,                       XCol+25+XPos, YPos);
    YPos += YSKIP;
    this.intLineNum++;
  }

} //class MyTraining



