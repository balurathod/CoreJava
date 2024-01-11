package com.rathod.oops;
/*
  File.......: MyHello_AppletAwtComponents.java
  Description: Basic Applet w/awt Components
  Programmer.: Michael Thomas
  Date.......: Updated 02/10/99, Orig 02/10/99


*/
import java.applet.Applet;
import java.awt.*;  //Label, TextField, Button, Panel
                    //GridLayout, BorderLayout, Graphics
import java.awt.event.*; //ActionListener, ActionEvent


public class MyHello_AppletAwtComponents extends Applet implements ActionListener {

  Label lblEnterName     = new Label("Enter your name:") ;
  TextField txtEnterName = new TextField( 30 );
  Button butSubmit       = new Button("Submit");
  Label lblName          = new Label("I'm waiting for your name.");
  Panel p;

  public void init() {

    butSubmit.addActionListener( this );    //single click on Submit!
    txtEnterName.addActionListener( this ); //catch the enter key!

    Panel p2 = new Panel();
    p2.setLayout( new GridLayout(4, 1, 5, 5 ) );  //4rows, 1 Col, 5 hgap, 5 vgap
      p = new Panel(); //default layout is FlowLayout!
      p.add( new Label("Example of Applet with AWT Components") );
    p2.add( p );        //Row 1
      p = new Panel(); p.add(lblEnterName); p.add(txtEnterName);
    p2.add( p );        // Row 2
      p = new Panel(); p.add( butSubmit );
    p2.add( p );        //Row 3
      p = new Panel(); p.add( lblName );
    p2.add( p );  //Row 4

    setLayout( new BorderLayout());
    add( "North", new Button("North of the Border") );
    add( "South", new Button("South of the Border") );
    add( "East", new Button("East") );
    add( "West", new Button("West") );
    add( "Center", p2 );

    txtEnterName.requestFocus();

  } //init

  public void paint(Graphics g) {

  } //paint

  public void actionPerformed(ActionEvent e) {

    lblName.setText( "Hello "+txtEnterName.getText() );
    txtEnterName.setText("");
    repaint();

  } //actionPerformed()

}//class Hello_Applet2
