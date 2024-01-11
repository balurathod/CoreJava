package com.rathod.oops;
/* File.......: MyPackage.java
   Author.....: Michael Thomas 02/03/99, ver 1.0 - 02/03/99

   Compile....: MyPackage.bat

   Run Browser: MyPackage.html
   Run JDK....: appletviewer MyPackage.html

Contents of MyPackage.bat:  (Compile)

javac MyPackNone.java    -d .
javac myPack/MyPackClassA.java  -sourcepath myPack -d . 
javac myPack/MyPackClassB.java  -sourcepath myPack -d .
javac myPack/myPacktest/MyPackTestA.java   -sourcepath myPack/myPackTest -d .
javac MyPackage.java     -d .

*/


import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)
import java.awt.Color;

import myPack.MyPackClassA;
import myPack.MyPackClassB;
import myPack.myPackTest.MyPackTestA;

//***********************************************************************
public class MyPackage extends Applet
//***********************************************************************
{ final  int YSKIP        = 15;               //Y pixel skip increment. (Row Width)
  final  int XCOL1        = 25;               //Column 1, Screen positioning
  final  int XCOL2        = 400;              //Column 2, Screen positioning
  public final  int XPOS1 = 0;                //X Axis - position 1
  public final  int XPOS2 = XPOS1+YSKIP;      //X Axis - position 2

         int intLineNum   = 0;   //Line # to display on screen.
         int XCol         = 0;
         int YPos         = 0;   //Row pointer (Y axis)

  public Graphics mpg;

//-----------------------------------------------------------------------
  public void init()
  { setBackground( Color.white );
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  { this.mpg   = g;
    YPos       = YSKIP;
    intLineNum = 1;  //Must initialize here, because paint() frequently.
    XCol       = XCOL1;

    Show("Start: MyPackages",XPOS1);

    MyPackClassA mpa = new MyPackClassA();
    Show( "Imported package: import bin.MyPackClassA;", XPOS2 );

    myPack.MyPackClassB mpb = new myPack.MyPackClassB();
    Show( "Specified package directly:  bin.MyPackClassB(); "+
          " - did not import!", XPOS2 );

    //MyPackClassA1 mpia1 = new MyPackClassA1();
    Show( "Compile error:  Class MyPackClassA1 not found in type declaration.  "+
          "Package imported, but class is not public", XPOS2 );

    MyPackNone mpn = new MyPackNone(); //noname package, same directory.
    Show( "Instantiate MyPackNone().  A no name package in same directory!", XPOS2 );  

    MyPackTestA mpta = new MyPackTestA();
    Show( "Used: import bin.MyPackTest.MyPackTestA;"+
          " - notice the path (subdirectories).", XPOS2 );

    Show( "Instantiate: MyPackA() extends MyPackTestA as mpA.", XPOS1 );
    MyPackA mpA = new MyPackA( this );
    Show( "Finished MyPackA()", XPOS2 );

    Show( "mpA.strPublic: "   +mpA.strPublic,    XPOS2 );
    Show( "Variables: Look at code for Compile errors!", XPOS2 );
//  Show( "mpA.strProtected: "+mpA.strProtected, XPOS2 ); //Compile errors!
//  Show( "mpA.strPackage: "  +mpA.strPackage,   XPOS2 ); //Compile errors!
//  Show( "mpA.strPrivate: "  +mpA.strPrivate,   XPOS2 ); //Compile errors!

    Show( "Methods: Look at code for Compile errors!", XPOS2 );
    mpA.MyPackTestAPublic();
//  mpA.MyPackTestAProtected();  //Compile errors!
//  mpA.MyPackTestAPackage();    //Compile errors!
//  mpA.MyPackTestAPrivate();    //Compile errors!

    Show("Finished: MyPackages",XPOS1);

  } //paint()

//-----------------------------------------------------------------------
  void Show( String strMsg, int XPos )
  { mpg.drawString( Integer.toString(intLineNum), XCol,         YPos);
    mpg.drawString( strMsg,                       XCol+25+XPos, YPos);
    YPos += YSKIP;
    this.intLineNum++;
  }

} //class Packages

//***********************************************************************
class MyPackA extends MyPackTestA
//***********************************************************************
{ MyPackA( MyPackage mp )
  { 
   mp.Show( "MyPackA - strPublic: "   +strPublic,    mp.XPOS2 );
   mp.Show( "MyPackA - strProtected: "+strProtected, mp.XPOS2 );
   mp.Show( "MyPackA - Variables: Look at code for Compile errors!", mp.XPOS2 );
   //2 Compile error!
   //mp.Show( "MyPackA - strPackage: "  +strPackage,   mp.XPOS2 );  
   //mp.Show( "MyPackA - strPrivate: "  +strPrivate,   mp.XPOS2 );  

   mp.Show( "MyPackA - Methods: Look at code for Compile errors!", mp.XPOS2 );
   MyPackTestAPublic();
   MyPackTestAProtected();
   //MyPackTestAPackage();   //Compile error!
   //MyPackTestAPrivate();   //Compile error!

  }
}


