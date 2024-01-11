package com.rathod.oops;
/* File.......: MyGarbage.java
   Author.....: Michael Thomas 03/07/99
                      
   Compile....: javac MyGarbage.java -d bin

   Run Browser: MyGarbage.html
   Run JDK....: appletviewer MyGarbage.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)

//***********************************************************************
public class MyGarbage extends Applet
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

  Runtime rt;

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  {
    String strMyString1, strMyString2, strMyString3;
    long   lngMemWas, lngMemIs;

    rt = Runtime.getRuntime();  //Get a Runtime Object associated 
                                        //with this application.
    this.myg   = g;
    YPos       = YSKIP;
    intLineNum = 1;  //Must initialize here, because paint() frequently.
    XCol       = XCOL1;

    Show( "Start: Garbage Collection (gc).",XPOS1);
    Show( "Each browser may function differently.",XPOS1);
    Show( " ",XPOS1);
    Show( "Which labels are candidates for gc (garbage collection).",XPOS1);

    Show( "Free Memory (before rt.gc()):" + rt.freeMemory() ,XPOS2);
    rt.gc();  //force garbage collection.
    Show( "Free Memory (after rt.gc()):" + rt.freeMemory() ,XPOS2);

    int [] intMyArray;
    
    a: strMyString1 = "String #1";
    b: strMyString2 = "String #2";
    c: strMyString3 = strMyString1 + strMyString2;
    d: intMyArray = new int [3];

    Show( "Free Memory: (after a - d)" + rt.freeMemory() ,XPOS2);

    e: strMyString1 = null;      //Candidate
    f: strMyString2 = "Hello";   //Candidate: New object is loaded into strMyString2
    g: intMyArray = new int [3]; //Candidate

    Show( "Free Memory: (after e - g)" + rt.freeMemory() ,XPOS2);

    Show( "Answer: e,f,g",XPOS2);

    Show( "Free Memory (before rt.gc()):" + rt.freeMemory() ,XPOS2);
    rt.gc();
    Show( "Free Memory (after rt.gc()):" + rt.freeMemory() ,XPOS2);

    YPos       = YSKIP;
    XCol       = XCOL2;

    Show("Example of finalize()",XPOS1);

    MyGarbageTest mgt = new MyGarbageTest( this );
    lngMemIs = rt.freeMemory();
    mgt = null;
    do {                                    //Loop until gc is done!
      lngMemWas = lngMemIs;
      rt.gc();  //force garbage collection.
      lngMemIs = rt.freeMemory();
    } while ( lngMemIs > lngMemWas );
    rt.runFinalization();  //If object is pending garbage collection then
                           //run finalize.

    Show("Finished: Garbage Collection Examples",XPOS1);


  } //paint()

//-----------------------------------------------------------------------
  protected void finalize() throws Throwable
  {  super.finalize();
     Show("Finished: Garbage Collection Examples",XPOS1);
  }

//-----------------------------------------------------------------------
  void Show( String strMsg, int XPos )
  { myg.drawString( Integer.toString(intLineNum), XCol,         YPos);
    myg.drawString( strMsg,                       XCol+25+XPos, YPos);
    YPos += YSKIP;
    this.intLineNum++;
  }

} //class MyGarbage

//***********************************************************************
class MyGarbageTest
//***********************************************************************
{ MyGarbage mg;

  MyGarbageTest(MyGarbage mg)
  {this.mg = mg;
   mg.Show("In MyGarbageTest's constructor.", mg.XPOS2);

  }

//-----------------------------------------------------------------------
  protected void finalize() throws Throwable
  {  super.finalize();
     mg.Show("In MyGarbageTest's finalize() method.", mg.XPOS2);
  }

}
