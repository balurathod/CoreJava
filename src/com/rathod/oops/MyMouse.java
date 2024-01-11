package com.rathod.oops;
/* File.......: MyMouse.java
   Author.....: Michael Thomas 03/10/99, ver 1.0 - 03/12/99
                      
   Compile....: javac MyMouse.java -d bin

   Run Browser: MyMouse.html
   Run JDK....: appletviewer MyMouse.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)
import java.awt.Color;      //needed for: Color
import java.awt.*;
import java.awt.event.*;

//***********************************************************************
public class MyMouse extends Applet implements MouseListener,
                                               MouseMotionListener
//***********************************************************************
{ //Note:  The adapter for MouseListener is MouseAdapter.
  //       The adapter for MouseMotionListener is MouseMotionAdapter.

  private static final int RADIUS = 7;
  private String [] strMessage;
  private int intIndex;
  private int intPosX = 0;
  private int intPosY = 0;

  private Point clickPoint = null;
  private MouseEvent mouseEvent = null;

  private boolean bMoved = false;
  private int intMoved = 0;

  private boolean bDragged = false;
  private int intDragged = 0;

  private String strWhichButton;

  public void init()
  {  addMouseListener(this);        //Activates MouseListener
     addMouseMotionListener(this);  //Activates MouseMotionListener

     InitButtonTrail();
     showStatus("Started MyMouse");
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  { setBackground( Color.white );
    //Note: Component.getSize()

    if (clickPoint != null)
      g.fillOval(clickPoint.x - RADIUS,   //Draws a circle on the screen!
                 clickPoint.y - RADIUS,
                 RADIUS * 2, RADIUS * 2);

    intPosX = 150; // getSize().width - 275; 
    intPosY = 0;

    if ( mouseEvent != null ) {

      g.drawString( "Mouse Position: "+ mouseEvent.getPoint(), //Point.toString() called!
                     intPosX, intPosY += 15 );
      g.drawString( "Mouse Clicks: "+ mouseEvent.getClickCount(), 
                     intPosX, intPosY += 15 );

      //Mouse Buttons: Center Button - Alt Key & left button
      //               Right  Button - Ctrl (Meta) key & left button.
      g.drawString( "Mouse Button: "+ strWhichButton, 
                     intPosX, intPosY += 15 );

    }

    if ( bMoved ) {
      g.drawString( "mouseMoved(): " + Twirl("mouseMoved"),
                    intPosX, intPosY += 15 );
      bMoved = false;
    }

    if ( bDragged ) {
      g.drawString( "mouseDragged(): " + Twirl("mouseDragged"),
                    intPosX, intPosY += 15 );
      bDragged = false;
    }

    intPosX = 5; 
    intPosY = 0;
    for (int intX = 0; intX < strMessage.length; intX++ )
      if ( strMessage[intX] == null )
        break;
      else
       g.drawString( strMessage[intX],  intPosX, intPosY += 15);

  } //paint()
//-----------------------------------------------------------------------
  private char Twirl( String strMode )
  { int intPos = 0;
    char cReturn = ' ';

    intPos = ( strMode == "mouseMoved" ? intMoved : intDragged );
    intPos++;

    switch(intPos) {
    case 1:
      cReturn = '|'; break;
    case 2:
      cReturn = '/'; break;
    case 3:
      cReturn = '-'; break;
    case 4:
      cReturn = '\\'; break;
    default:
      cReturn = '|';
      intPos = 1; break;
    }

    if ( strMode == "mouseMoved" )
      intMoved = intPos;  //Keep track of position.
    else
      intDragged = intPos;  //Keep track of position.
     
  return cReturn;
}
//-----------------------------------------------------------------------
  public void mousePressed(MouseEvent event)  //MouseListener
  { //This method is called the mouse button has been pressed.

    mouseEvent = event;
    strWhichButton = WhichButton();  

    InitButtonTrail();
    ButtonTrail("mousePressed");

    clickPoint = event.getPoint();       //Store for the Circle!
    repaint();
  }

//-----------------------------------------------------------------------
  public void mouseClicked(MouseEvent event)  //MouseListener
  { //This method is called whenever a mouse button is clicked.
    //(click = follows a press & release, if the mouse is not moved!)

    mouseEvent = event;
    strWhichButton = WhichButton();

    ButtonTrail("mouseClicked");

    repaint();
  }
//-----------------------------------------------------------------------
  public void mouseReleased(MouseEvent event)  //MouseListener
  { //This method is called whenever a mouse button has been released.

    mouseEvent = event;
    strWhichButton = WhichButton();  

    ButtonTrail("mouseReleased");

    repaint();
  }
//-----------------------------------------------------------------------
  public void mouseEntered(MouseEvent event)  //MouseListener
  { //This method is called whenever the mouse enters the component.

    mouseEvent = event;
    strWhichButton = "";  

    ButtonTrail("mouseEntered");

    repaint();
  }
//-----------------------------------------------------------------------
  public void mouseExited(MouseEvent event)  //MouseListener
  { //This method is called whenever the mouse pointer leaves the component.

    mouseEvent = event;
    strWhichButton = "";  

    ButtonTrail("mouseExited");

    repaint();
  }

//-----------------------------------------------------------------------
  public void mouseDragged(MouseEvent event)  //MouseMotionListener
  { //This method is constantly called whenever the mouse is pressed
    //inside the component implementing the MouseMotionListener and then
    //is dragged.  While dragging, the mouse may exit the component and
    //this method is still called!

    mouseEvent = event;
    strWhichButton = WhichButton();

    clickPoint = event.getPoint();       //Store for the Circle!
    bDragged = true;
    repaint();
  }

//-----------------------------------------------------------------------
  public void mouseMoved(MouseEvent event)  //MouseMotionListener
  { //This method is constantly called whenever the mouse is moved
    //while the mouse is on the component implementing MouseMotionListener.

    mouseEvent = event;
    strWhichButton = "";

    bMoved = true;
    repaint();
  }

//-----------------------------------------------------------------------
  private String WhichButton()
  {
    String strReturn = "";

    //MouseEvent extends InputEvent which has these methods.
    if ( mouseEvent.isShiftDown() )
      strReturn = ( mouseEvent.isMetaDown() ? "Shift + (Right)" :
                                              "Shift + (Left)");
    else if ( mouseEvent.isControlDown() )
      strReturn = ( mouseEvent.isMetaDown() ? "Ctrl + (Right)" :
                                              "Ctrl + (Left)");
    else if ( mouseEvent.isAltDown() )
      strReturn = ( mouseEvent.isMetaDown() ? "Alt + (Right)" :
                                              "Alt + (Left) also (center)");
    else if ( mouseEvent.isMetaDown() )
      strReturn = "(right) also Meta + (Left) ";  //I don't know what a Meta key is.
    else
      strReturn = "(left)";

    return strReturn;
  }

//-----------------------------------------------------------------------
  void ButtonTrail(String strMsg)
  {
    if ( intIndex < strMessage.length - 1 )
      strMessage[intIndex] = strMsg;
    else
      {InitButtonTrail();
       strMessage[intIndex] = strMsg;
      }
    intIndex++;

  }

//-----------------------------------------------------------------------
  void InitButtonTrail()
  { intIndex = 0; strMessage = new String[10];}

} //class MyMouse




