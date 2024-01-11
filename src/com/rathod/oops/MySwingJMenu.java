package com.rathod.oops;
/*
  File.......: MyHello_JAppletOrApp.java
  Description: Example of Swing Components (App or Applet)
  Programmer.: Michael Thomas
  Date.......: Updated 12/22/01, Orig 12/22/01

*/
import javax.swing.JApplet;      //need for extends Applet.
import javax.swing.JFrame;       
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
    

import java.awt.Container;
import java.awt.Graphics;       //need for paint()
import java.awt.Color;
import java.awt.Frame;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MySwingJMenu extends JApplet implements ActionListener {

  JMenu objJMenuFile;
  JMenu objJMenuEdit;
  JMenu objJMenuAction;
  
  JLabel lblMsg;
  
//-----------------------------------------------------------------------
  public void init() { 
//-----------------------------------------------------------------------
    
    Container objContainer = super.getContentPane();
    objContainer.setBackground( Color.white );

    buildJMenuFile();
    buildJMenuEdit();
    buildJMenuAction();
    
    //zzz Need to add: CheckboxMenuItem
    
    JMenuBar objJMenuBar = new JMenuBar();

    super.setJMenuBar(objJMenuBar);
    objJMenuBar.add(objJMenuFile);
    objJMenuBar.add(objJMenuEdit);
    objJMenuBar.add(objJMenuAction);

    lblMsg = new JLabel("Messages displayed here." );

    objContainer.add(lblMsg);

  }

//-----------------------------------------------------------------------
  private void buildJMenuFile( )  {
//-----------------------------------------------------------------------

    JMenuItem objJMenuItem;
          
    objJMenuFile = new JMenu("File");
  
    objJMenuItem = new JMenuItem("New");        //New
    objJMenuItem.addActionListener( this );
    objJMenuFile.add( objJMenuItem );
  
    objJMenuItem = new JMenuItem("Open");    //Open...
    objJMenuItem.addActionListener( this );
    objJMenuFile.add( objJMenuItem );
  
    objJMenuItem = new JMenuItem("Save");       //Save
    objJMenuItem.addActionListener( this );
    objJMenuFile.add( objJMenuItem );
  
    objJMenuItem = new JMenuItem("Save As"); //Save As...
    objJMenuItem.addActionListener( this );
    objJMenuFile.add( objJMenuItem );
  
    objJMenuFile.addSeparator();           //add a horizontal separator line
  
    objJMenuItem = new JMenuItem("Quit");       //Quit
    objJMenuItem.addActionListener( this );
    objJMenuFile.add( objJMenuItem );
  }

//-----------------------------------------------------------------------
  private void buildJMenuEdit( ) {
//-----------------------------------------------------------------------

    JMenuItem objJMenuItem;
          
    objJMenuEdit = new JMenu("Edit");
  
    objJMenuItem = new JMenuItem("Undo");        
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );
    
    objJMenuItem = new JMenuItem("Redo");        
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );
    
    objJMenuEdit.addSeparator();

    objJMenuItem = new JMenuItem("Cut");
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Copy");
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Paste");
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Delete");
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );

    objJMenuEdit.addSeparator();
    
    objJMenuItem = new JMenuItem("Find");
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Replace");
    objJMenuItem.addActionListener( this );
    objJMenuEdit.add( objJMenuItem );


  }
//-----------------------------------------------------------------------
  private void buildJMenuAction( ) {
//-----------------------------------------------------------------------

    JMenuItem            objJMenuItem;
    JMenu                objJMenu_Sub;
    JRadioButtonMenuItem objJRBtnMenuItem;
    JCheckBoxMenuItem    objJCBoxMenuItem;
    
    objJMenuAction = new JMenu("Action");
  
    //******************************
    
    objJMenu_Sub = new JMenu("Sub 1");
    
    objJMenuItem = new JMenuItem("Sub 1, Item 1");        
    objJMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Sub 1, Item 2");        
    objJMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Sub 1, Item 3");        
    objJMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJMenuItem );

    objJMenuAction.add( objJMenu_Sub );

    //******************************
    
    objJMenu_Sub = new JMenu("Sub 2");
    
    objJMenuItem = new JMenuItem("Sub 2, Item 1");        
    objJMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJMenuItem );

    objJMenuItem = new JMenuItem("Sub 2, Item 2");        
    objJMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJMenuItem );

    objJMenuAction.add( objJMenu_Sub );

    //******************************

    objJMenuAction.addSeparator();
    
    //******************************
    
    objJMenu_Sub = new JMenu("Sub 3");

    ButtonGroup objButtonGroup = new ButtonGroup();

    objJRBtnMenuItem = new JRadioButtonMenuItem( "Radio 1" );
    objJRBtnMenuItem.setSelected( true );
    objJRBtnMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJRBtnMenuItem );
    objButtonGroup.add( objJRBtnMenuItem ); //Groups the radio buttons together.

    objJRBtnMenuItem = new JRadioButtonMenuItem( "Radio 2" );
    objJRBtnMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJRBtnMenuItem );
    objButtonGroup.add( objJRBtnMenuItem ); //Groups the radio buttons together.

    objJRBtnMenuItem = new JRadioButtonMenuItem( "Radio 2" );
    objJRBtnMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJRBtnMenuItem );
    objButtonGroup.add( objJRBtnMenuItem ); //Groups the radio buttons together.

    objJMenu_Sub.addSeparator();
    
    objJCBoxMenuItem = new JCheckBoxMenuItem( "Check Box 1" );
    objJCBoxMenuItem.setSelected( true );
    objJCBoxMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJCBoxMenuItem );

    objJCBoxMenuItem = new JCheckBoxMenuItem( "Check Box 2" );
    objJCBoxMenuItem.setSelected( false );
    objJCBoxMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJCBoxMenuItem );

    objJCBoxMenuItem = new JCheckBoxMenuItem( "Check Box 3" );
    objJCBoxMenuItem.setSelected( true );
    objJCBoxMenuItem.addActionListener( this );
    objJMenu_Sub.add( objJCBoxMenuItem );

    //zzz Note:  Need to add .addItemListener to JCheckBoxMenuItem
    //           Also add code to show selected vs deselected for Radio & Checkbox.
    
    objJMenuAction.add( objJMenu_Sub );
    
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
  public static void main( String args [] )  { 
  //-----------------------------------------------------------------------
    
    JFrame app = new JFrame( "Swing Menu's" );  
    app.setSize( 400, 200);  //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    MySwingJMenu applet = new MySwingJMenu();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.getContentPane().add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()
}