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
public class MyAWTMenu extends java.awt.Frame implements ActionListener {
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
    
    //zzz Need to add: CheckboxMenuItem
    
    MenuBar objMenuBar = new MenuBar();

    setMenuBar(objMenuBar);
    objMenuBar.add(objMenuFile);
    objMenuBar.add(objMenuEdit);

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

  
//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    MyAWTMenu objAppFrame = new MyAWTMenu();

    objAppFrame.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    objAppFrame.setTitle( "Menu Example");
    objAppFrame.setSize( 760, 378);                    //set Frame: width, height
    objAppFrame.init();
    objAppFrame.setVisible( true );                    //Make frame visible. (replaces JDK 1.1's .show())

  } //main()


} //eoc
//eof




