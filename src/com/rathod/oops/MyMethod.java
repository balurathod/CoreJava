package com.rathod.oops;
/* File.......: MyMethod.java
   Author.....: Michael Thomas 05/09/99, ver 1.0 - 05/09/99
                      
   Compile....: javac MyMethod.java -d bin

   Run Browser: MyMethod.html
   Run JDK....: appletviewer MyMethod.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)
import java.awt.Color;      //needed for: Color

//***********************************************************************
public class MyMethod extends Applet
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

    Show( "Methods: Overriding, Overloading, etc...",XPOS1);

    Show( "MyOverriding()",XPOS1);
    MyOverriding();

    //MyConstructorThis();  //Finish later
    //MyConstructorSuper(); //Finish later

    YPos       = YSKIP;
    XCol       = XCOL2;

    Show("Finished: Training",XPOS1);

  } //paint()

//-----------------------------------------------------------------------
  void MyOverriding()
  {
    MyMethodSub  s1 = new MyMethodSub( this );
    MyMethodBase b1 = new MyMethodBase( this );

    Show("Expected, see code.",XPOS2);  
    s1.amethod();  //calls MyMethodSub's
    b1.amethod();  //calls MyMethodBase's

    //Next is the tricky one !!!
    Show("Tricky, see code. b2.amethod()",XPOS2);
    MyMethodBase b2 = (MyMethodBase) s1;
    b2.amethod();  //calls MyMethodSub's amethod, not MyMethodBase !!!!

  }
//-----------------------------------------------------------------------
  void Show( String strMsg, int XPos )
  { myg.drawString( Integer.toString(intLineNum), XCol,         YPos);
    myg.drawString( strMsg,                       XCol+25+XPos, YPos);
    YPos += YSKIP;
    this.intLineNum++;
  }

} //class MyMethod

//#######################################################################
class MyMethodBase
//#######################################################################
{ MyMethod mym;

//**********************************************************************
   MyMethodBase( MyMethod mym )
   { this.mym = mym; }

//**********************************************************************
  void amethod()
  { mym.Show("Base: in MyMethodBase's amethod()",mym.XPOS3); }

} //class MyMethodSub

//#######################################################################
class MyMethodSub extends MyMethodBase
//#######################################################################
{  MyMethod mym;

//**********************************************************************
   MyMethodSub( MyMethod mym )
   { super( mym );
     this.mym =mym; }

//**********************************************************************
  void amethod()
  { mym.Show("Sub: in MyMethodSub's amethod()",mym.XPOS3); }

} //class MyMethodSub


