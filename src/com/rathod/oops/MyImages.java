package com.rathod.oops;
/* File.......: MyImages.java
   Author.....: Michael Thomas 05/08/99, ver 1.0 - 05/08/99
                      
   Compile....: javac MyImages.java -d bin

   Run Browser: MyImages.html
   Run JDK....: appletviewer MyImages.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.*;
import java.awt.image.*;

//Run as an application.
import java.awt.Graphics;       //need for paint()
import java.awt.event.*;        //need to handle window events.
import java.awt.Frame;       
import java.awt.BorderLayout; 


//***********************************************************************
public class MyImages extends Applet
//***********************************************************************
{ 
  Image imgMy1;

  ImageTwirling1 imgtwr1;
  ImageTwirling2 imgtwr2;

//-----------------------------------------------------------------------
  public void init()
  { setBackground( Color.white );

    imgMy1 = getImage( getCodeBase(), "myImages_javacup.gif" );

    imgtwr1 = new ImageTwirling1(this.getGraphics(), this); //inner Class 
    imgtwr2 = new ImageTwirling2(this.getGraphics(), this); //another Class

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  {

    g.drawImage( imgMy1, 5, 5, this );  

    //Resizes the graphic to 1/2 the size
    g.drawImage( imgMy1, 400, 5,
                 (int) (imgMy1.getWidth(this) * .5 ), 
                 (int) (imgMy1.getHeight(this) * .5 ),
                 this );  

    imgtwr1.Rotate_Start();
    imgtwr2.Rotate_Start();

    repaint();

  } //paint()

  //***********************************************************************
  class ImageTwirling1 //Example of inner class
  //***********************************************************************
  {
   final  int intNUMIMAGES = 8;  
   final  int intSLEEP     = 60;

   Graphics g;
   Applet   appMy;
   Image aimgMy []; 

   ImageTwirling1( Graphics g, Applet appMy )
   {
     this.g     = g;      //Graphic to paint to!
     this.appMy = appMy;  //Applet with ImageObserver.

     aimgMy    = new Image [intNUMIMAGES];  //Array of Images
     //Load an array of 8 images.  Use to rotate graphic.
     for ( int i = 0; i < aimgMy.length; i++ )
       aimgMy[i] = appMy.getImage( appMy.getDocumentBase(),
                                   "images/MyImage"+i+".jpg" );
   } //constructor

   void Rotate_Start()
   {
     for ( int i = 0; i < aimgMy.length; i++ )
     { g.drawImage( aimgMy[i], 5, 45, appMy );

       try
       { Thread.sleep( intSLEEP ); }
       catch ( InterruptedException e )
       { }

     }
   }

  } //inner class: TwirlingImage

  //--------------------------------------------------------------------------
  public static void main( String args [] )  { 
  //--------------------------------------------------------------------------
    
    Frame app = new Frame( "myImages" );  
    app.setSize( 300, 100);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyImages applet = new MyImages();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

} //class MyImages

//***********************************************************************
  class ImageTwirling2 //Example of outer class
//***********************************************************************
  {
   final  int intNUMIMAGES = 8;  
   final  int intSLEEP     = 60;

   Graphics g;
   Applet   appMy;
   Image aimgMy []; 

   ImageTwirling2( Graphics g, Applet appMy )
   {
     this.g     = g;
     this.appMy = appMy;

     aimgMy    = new Image [intNUMIMAGES];  //Array of Images
     //Load an array of 8 images.  Use to rotate graphic.
     for ( int i = 0; i < aimgMy.length; i++ )
       aimgMy[i] = appMy.getImage( appMy.getDocumentBase(),
                                   "images/MyImage"+i+".jpg" );
   } //constructor

   void Rotate_Start()
   {
     for ( int i = 0; i < aimgMy.length; i++ )
     { g.drawImage( aimgMy[i], 400, 45, appMy );

       try
       { Thread.sleep( intSLEEP ); }
       catch ( InterruptedException e )
       { }

     }
   }

  } //inner class: TwirlingImage


