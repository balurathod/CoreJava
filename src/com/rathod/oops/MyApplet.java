package com.rathod.oops;
/* File.......: MyApplet.java
   Author.....: Michael Thomas 03/24/99, ver 1.0 - 03/24/99
                      
   Compile....: javac MyApplet.java -d bin

   Run Browser: MyApplet.html
   Run JDK....: appletviewer MyApplet.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import java.awt.Button;
import java.awt.Frame;
import java.awt.BorderLayout;

//***********************************************************************
public class MyApplet extends Applet implements MouseListener,
                                                MouseMotionListener,
                                                ActionListener
//***********************************************************************
{
  static private int intClassMain    = 0;
  static private int intClassInit    = 0;
  static private int intClassDestroy = 0;
  static private int intClassStart   = 0;
  static private int intClassStop    = 0;

  private boolean blnLoadHtmlParms = true;
  
  private int intInit     = 0;
  private int intStart    = 0;
  private int intStop     = 0;
  private int intRepaint  = 0;
  private int intUpdate   = 0;
  private int intPaint    = 0;

  private String strFirst;
  private String strMiddle;
  private String strLast;
  
  private final int RADIUS = 7;
  private int intPosX = 0;
  private int intPosY = 0;

  private Point clickPoint = null;
  private MouseEvent mouseEvent = null;
  private Button butClear;

  private boolean bClearScreen = false;

//-----------------------------------------------------------------------
  public void init() {
//-----------------------------------------------------------------------  
  
    setBackground( Color.white );

    intInit++;
    intClassInit++;
    
    if ( this.blnLoadHtmlParms ) {
      this.strFirst  = this.getParameter( "First" );  
      this.strMiddle = this.getParameter( "Middle" );  
      this.strLast   = this.getParameter( "Last" );
    } else {
      this.strFirst  = "n/a";  
      this.strMiddle = "n/a"; 
      this.strLast   = "n/a";
    }
    
    this.addMouseListener(this);        //Activates MouseListener
    this.addMouseMotionListener(this);  //Activates MouseMotionListener

    butClear = new Button("Clear Screen");
      butClear.addActionListener( this );
      add( butClear );
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------  

    setBackground( Color.white );

    intPaint++;

    if (clickPoint != null)
    {
      g.fillOval(clickPoint.x - RADIUS,   //Draws a circle on the screen!
                 clickPoint.y - RADIUS,
                 RADIUS * 2, RADIUS * 2);
      clickPoint = null;
    }

    intPosX = 15; intPosY = 0;

    g.drawString("Class's main() called:  " +
                 intClassMain, intPosX, intPosY += 15 );
    g.drawString("Class's init() called:  " +
                 intClassInit, intPosX, intPosY += 15 );
    g.drawString("Class's start() called:  " +
                 intClassStart, intPosX, intPosY += 15 );
    g.drawString("Class's stop() called:  " +
                 intClassStop, intPosX, intPosY += 15 );
    g.drawString("Class's destroy() called:  " +
                 intClassDestroy, intPosX, intPosY += 15 );

    intPosY += 15;

    g.drawString("Applet's init() called:  " +
                 intInit, intPosX, intPosY += 15 );
    g.drawString("Applet's start() called:  " +
                 intStart, intPosX, intPosY += 15 );
    g.drawString("Applet's stop() called:  " +
                 intStop, intPosX, intPosY += 15 );
    g.drawString("Applet's repaint() called:  " +
                 intRepaint, intPosX, intPosY += 15 );
    g.drawString("Applet's update() called:  " +
                 intUpdate, intPosX, intPosY += 15 );
    g.drawString("Applet's paint() called:  " +
                 intPaint, intPosX, intPosY += 15 );
    
    intPosY += 15;
    
    g.drawString("HTML Parm First:  " +
                 strFirst, intPosX, intPosY += 15 );
    g.drawString("HTML Parm Middle:  " +
                 strMiddle, intPosX, intPosY += 15 );
    g.drawString("HTML Parm Last:  " +
                 strLast, intPosX, intPosY += 15 );    

  } //paint()

//-----------------------------------------------------------------------
  public void update(Graphics g)  {
//-----------------------------------------------------------------------
    
    intUpdate++;
    g.clearRect(0, 0, 200, this.getSize().height );  //Clear word area.

    if ( bClearScreen )
    { g.clearRect(0, 0, this.getSize().width, this.getSize().height );
      bClearScreen = false;
    }

    paint( g );

  } //update()

//-----------------------------------------------------------------------
  public void repaint()  {
//-----------------------------------------------------------------------
    
    //Normally this method is not overridden.  I overrode this method
    //  to show the difference in the calls to repaint() and the calls
    //  to update.  The super.repaint() is an asynchronous operation that
    //  is queued to be run.
    //Note:  The repaint() method has 4 overloaded methods.  You can repaint
    //  part of a screen.  You can also specify that the call to update()
    //  must occur in so many milliseconds.

    intRepaint++;
    super.repaint();
  }

//-----------------------------------------------------------------------
  public void start()  {
//-----------------------------------------------------------------------
    
    intStart++;
    intClassStart++;
    super.start();
  }
  
//-----------------------------------------------------------------------
  public void stop()  {
//-----------------------------------------------------------------------
    
    intStop++;
    intClassStop++;
    super.stop();
  }

//-----------------------------------------------------------------------
  public void destroy()  {
//-----------------------------------------------------------------------
    intClassDestroy++;
    super.destroy();
  }

//-----------------------------------------------------------------------
  public void actionPerformed(ActionEvent e)  { //MouseListener
//-----------------------------------------------------------------------
    
    bClearScreen = true;  //Used in update() to clear the screen.
    repaint();
  }
//-----------------------------------------------------------------------
  public void mousePressed(MouseEvent event) { //MouseListener
//-----------------------------------------------------------------------
    //This method is called the mouse button has been pressed.

    mouseEvent = event;
    clickPoint = event.getPoint();   //Store for the Circle!
    repaint();
  }

//-----------------------------------------------------------------------
  public void mouseClicked(MouseEvent event) {} //MouseListener
//-----------------------------------------------------------------------
  
//-----------------------------------------------------------------------
  public void mouseReleased(MouseEvent event) {} //MouseListener
//-----------------------------------------------------------------------

//-----------------------------------------------------------------------
  public void mouseEntered(MouseEvent event) {} //MouseListener
//-----------------------------------------------------------------------
  
//-----------------------------------------------------------------------
  public void mouseExited(MouseEvent event) {} //MouseListener
//-----------------------------------------------------------------------

//-----------------------------------------------------------------------
  public void mouseDragged(MouseEvent event)  { //MouseMotionListener
//-----------------------------------------------------------------------
    
    mouseEvent = event;
    clickPoint = event.getPoint();       //Store for the Circle!
    repaint();
  }

//-----------------------------------------------------------------------
  public void mouseMoved(MouseEvent event)  {} //MouseMotionListener
//-----------------------------------------------------------------------

//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
    
    //1. This applet can be run as an application!!!
    //2. main() is not run if the Browser is running this Applet.

    intClassMain++;

    Frame app = new Frame( "Application - MyApplet" );  
    app.setSize( 760, 300);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );
    
    MyApplet applet = new MyApplet();         //create the applet.
    applet.blnLoadHtmlParms = false;          //Don't get HTML parms because run as an Application.
    applet.init();                            //initialize applet.
    applet.start();                           //start applet.

    app.add( applet, BorderLayout.CENTER );   //add applet to center of frame.
    app.setVisible( true );                   //Make frame visible.

  } //main()

} //class MyApplet