package com.rathod.oops;
/* File.......: MyBorderFlow.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      

*/

import java.applet.Applet;  //needed for: extends Applet
//import java.awt.*;
//import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//#######################################################################
public class MyAWTMenuApplet extends Applet implements ActionListener {
//#######################################################################

  Menu objMenuFile;
  Menu objMenuEdit;
  Label lblMsg;
  
//-----------------------------------------------------------------------
  public void init() { 
//-----------------------------------------------------------------------
    setBackground( Color.white );

    buildMenuFile();
    buildMenuEdit();

    MenuBar objMenuBar = new MenuBar(); //Create a menu bar.

    objMenuBar.add(objMenuFile);
    objMenuBar.add(objMenuEdit);
    
    //Here is the problem with Menu's and Applets.
    // 1.  setMenuBar() is not implemented in java.applet.Applet or it's super classes.
    // 2.  setMenuBar() exists in java.awt.Frame, however you cannot add a java.awt.Frame 
    //     to an Applet container.  Compiler says: Cannot add a window to a container.
    
    //Compile error: Straight Applet approach.
    //setMenuBar(objMenuBar); //Error: No method found matching setMenuBar(MenuBar);
    
    //java.awt.Frame approach.
    Frame objFrame = new Frame();
    objFrame.setMenuBar(objMenuBar);
    add( objFrame ); //Runtime error: IllegalArgumentException - adding a window to a container.

    //java.awt.Panel approach to hold the java.awt.Frame
    Panel objPanel = new Panel();
    objPanel.add( objFrame );  //Runtime error: IllegalArgumentException - adding a window to a container.
    
    lblMsg = new Label("Messages displayed here." );
    add(lblMsg);

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    
  } //paint()

//-----------------------------------------------------------------------
  private void buildMenuFile( ) {
//-----------------------------------------------------------------------

    MenuItem objMenuItem;
          
    objMenuFile = new Menu("File");
  
    objMenuItem = new MenuItem("New");        //New
    objMenuItem.addActionListener( this );
    objMenuFile.add( objMenuItem );
  
    objMenuItem = new MenuItem("Open");    //Open...
    objMenuItem.addActionListener( this );
    objMenuFile.add( objMenuItem );
  
    objMenuItem = new MenuItem("Save");       //Save
    objMenuItem.addActionListener( this );
    objMenuFile.add( objMenuItem );
  
    objMenuItem = new MenuItem("Save As"); //Save As...
    objMenuItem.addActionListener( this );
    objMenuFile.add( objMenuItem );
  
    objMenuFile.addSeparator();           //add a horizontal separator line
  
    objMenuItem = new MenuItem("Quit");       //Quit
    objMenuItem.addActionListener( this );
    objMenuFile.add( objMenuItem );
  }

//-----------------------------------------------------------------------
  private void buildMenuEdit( ) {
//-----------------------------------------------------------------------

    MenuItem objMenuItem;
          
    objMenuEdit = new Menu("Edit");
  
    objMenuItem = new MenuItem("Undo");        
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );
    
    objMenuItem = new MenuItem("Redo");        
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );
    
    objMenuEdit.addSeparator();

    objMenuItem = new MenuItem("Cut");
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );

    objMenuItem = new MenuItem("Copy");
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );

    objMenuItem = new MenuItem("Paste");
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );

    objMenuItem = new MenuItem("Delete");
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );

    objMenuEdit.addSeparator();
    
    objMenuItem = new MenuItem("Find");
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );

    objMenuItem = new MenuItem("Replace");
    objMenuItem.addActionListener( this );
    objMenuEdit.add( objMenuItem );


  }
//-----------------------------------------------------------------------
  public void actionPerformed(ActionEvent event) {
//-----------------------------------------------------------------------
      
        String  strMenuName;
  
        strMenuName = event.getActionCommand();
  
        if (strMenuName.equals("Quit")) {
           System.exit(0);
        }
        else {
           lblMsg.setText(strMenuName + " choosen.");
        }
  }

  
  //--------------------------------------------------------------------------
  public static void main( String args [] )  { 
  //--------------------------------------------------------------------------
    
    Frame app = new Frame( "AWT Menu's" );  
    app.setSize( 400, 200);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyAWTMenuApplet applet = new MyAWTMenuApplet();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

} //eoc
//eof




