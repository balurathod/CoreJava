/* File.......: MyExceptions.java
   Author.....: Michael Thomas 03/07/99
                      
   Compile....: javac MyTraining -d bin

   Run Browser: MyExceptions.html
   Run JDK....: appletviewer MyExceptions.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)

//***********************************************************************
public class MyExceptions extends Applet
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
  public void paint(Graphics g)
  { 

    this.myg   = g;
    YPos       = YSKIP;
    intLineNum = 1;  //Must initialize here, because paint() frequently.
    XCol       = XCOL1;

    Show( "Start:  MyExceptions (Being Developed!)",XPOS1);

    YPos       = YSKIP;
    XCol       = XCOL2;

    Show( " ",XPOS1 );

    Show("Finished: Exceptions",XPOS1);

  } //paint()

//-----------------------------------------------------------------------
  void Show( String strMsg, int XPos )
  { myg.drawString( Integer.toString(intLineNum), XCol,         YPos);
    myg.drawString( strMsg,                       XCol+25+XPos, YPos);
    YPos += YSKIP;
    this.intLineNum++;
  }

} //class MyExceptions



