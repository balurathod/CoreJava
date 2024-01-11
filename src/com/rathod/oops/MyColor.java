package com.rathod.oops;
/* File.......: MyColor.java
   Author.....: Michael Thomas 03/25/99, ver 1.0 - 03/25/99
                      
   Compile....: javac MyColor.java -d bin

   Run Browser: MyColor.html
   Run JDK....: appletviewer MyColor.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.*;
import java.awt.event.*; 

//***********************************************************************
public class MyColor extends Applet implements ItemListener, ActionListener
//***********************************************************************
{ Choice choColor;
  Color aColor [] = new Color[13];
  String astrColor [] = new String[13];

  Label     lblMyChoice = new Label("Label's Foreground.");
  TextField txtMyChoice = new TextField("TextField's Background.");
  Button    butMyChoice = new Button("Button's Background.");

  Label     lblMyRGB    = new Label("This is a test of the RGB color.");

  Button    butSetRGB   = new Button( "Set RGB Color" );

  TextField txtRed   = new TextField("0",15);
  TextField txtGreen = new TextField("0",15);
  TextField txtBlue  = new TextField("0",15);

  Label     lblNorth = new Label("Label: Last Color Chosen");
  TextField txtSouth = new TextField("TextField: Foreground= Last Color Chosen; "+
                                                "Background=Color.white always!");

  Button    butWest  = new Button("Choice");
  Button    butEast  = new Button("RGB");

  Panel     panSouth;

  GridLayout layGrid;
  BorderLayout layBorder;

//-----------------------------------------------------------------------
  public void init()
  { Panel p;
    Panel pCenter;

    setBackground( Color.white );
    
    aColor[0]  = Color.black;     astrColor[0]  = "black";
    aColor[1]  = Color.blue;      astrColor[1]  = "blue";
    aColor[2]  = Color.cyan;      astrColor[2]  = "cyan";
    aColor[3]  = Color.darkGray;  astrColor[3]  = "darkGray";
    aColor[4]  = Color.gray;      astrColor[4]  = "gray";
    aColor[5]  = Color.green;     astrColor[5]  = "green";
    aColor[6]  = Color.lightGray; astrColor[6]  = "lightGray";
    aColor[7]  = Color.magenta;   astrColor[7]  = "magenta";
    aColor[8]  = Color.orange;    astrColor[8]  = "orange";
    aColor[9]  = Color.pink;      astrColor[9]  = "pink";
    aColor[10] = Color.red;       astrColor[10] = "red";
    aColor[11] = Color.white;     astrColor[11] = "white";
    aColor[12] = Color.yellow;    astrColor[12] = "yellow";

    choColor = new Choice();   //Choice of colors
      for ( int i = 0; i < astrColor.length; i++ )
        choColor.add( astrColor[i] );

    choColor.addItemListener( this );
    butSetRGB.addActionListener( this );

    pCenter = new Panel();
    layGrid = new GridLayout( 2, 3 );
    pCenter.setLayout( layGrid );  //rows, cols

    FlowLayout layFlow = new FlowLayout();
    layFlow.setAlignment( FlowLayout.LEFT );

    //-------
    p=new Panel( layFlow );
      p.add( new Label( "Pick your color" ) );
    pCenter.add( p );

    p=new Panel( layFlow );
      p.add( choColor );
    pCenter.add( p );

    p=new Panel( layFlow );
      p.add( lblMyChoice );
      p.add( txtMyChoice );
      p.add( butMyChoice );
    pCenter.add( p );

    //-------
    p=new Panel( layFlow );
      p.add( new Label( "Enter Red value (0 - 255)" ) ); 
      p.add( new Label( "Enter Green value (0 - 255)" ) );
      p.add( new Label( "Enter Blue value (0 - 255)" ) );
    pCenter.add( p );

    //-------
    p=new Panel( layFlow );
      p.add( txtRed );
      p.add( txtGreen );
      p.add( txtBlue ); add( p );
    pCenter.add( p );

    //-------

    p=new Panel( layFlow );
      p.add( butSetRGB );
      p.add( lblMyRGB );
    pCenter.add( p );

    //-------

    layBorder = new BorderLayout();
    setLayout( layBorder );


    add(BorderLayout.NORTH,  lblNorth );
      lblNorth.setAlignment(Label.CENTER);
      lblNorth.setFont( new Font("TimesRoman",Font.BOLD+Font.ITALIC,36) );

    panSouth = new Panel(); panSouth.add(txtSouth);
    add(BorderLayout.SOUTH, panSouth);

    add(BorderLayout.WEST, butWest);

    add(BorderLayout.EAST, butEast);

    add(BorderLayout.CENTER, pCenter );

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  { setBackground( Color.white );


  } //paint()

//-----------------------------------------------------------------------
  public void actionPerformed( ActionEvent event )
  { int intRed = 0; int intGreen = 0; int intBlue = 0;

    try { intRed   = Integer.parseInt( txtRed.getText() ); }
      catch ( NumberFormatException e ) {intRed = 0;}
    try { intGreen   = Integer.parseInt( txtGreen.getText() ); }
      catch ( NumberFormatException e ) {intGreen = 0;}
    try { intBlue   = Integer.parseInt( txtBlue.getText() ); }
      catch ( NumberFormatException e ) {intBlue = 0;}

    intRed   = (intRed   > 255 || intRed   < 0 ? 0 : intRed   );
    intGreen = (intGreen > 255 || intGreen < 0 ? 0 : intGreen );
    intBlue  = (intBlue  > 255 || intGreen < 0 ? 0 : intBlue  );

    txtRed.setText( Integer.toString(intRed) );
    txtGreen.setText( Integer.toString(intGreen) );
    txtBlue.setText( Integer.toString(intBlue) );

    Color colorNew = new Color( intRed, intGreen, intBlue );

    lblMyRGB.setForeground( colorNew ); lblMyRGB.repaint();

    lblNorth.setForeground( colorNew ); lblNorth.repaint();

    butEast.setForeground( colorNew ); butEast.repaint();

    txtSouth.setForeground( colorNew ); txtSouth.repaint();

    repaint();

  }
//-----------------------------------------------------------------------
  public void itemStateChanged( ItemEvent event )
  { 
    Choice myCho = (Choice) event.getSource();
    int intRow = myCho.getSelectedIndex();    //@ Choice.getSelectedIndex()

    Color colorNew = aColor[intRow];

    //Must repaint() the component for IE5!
    lblMyChoice.setForeground( colorNew ); lblMyChoice.repaint(); 

    txtMyChoice.setBackground( colorNew ); txtMyChoice.repaint();

    butMyChoice.setBackground( colorNew ); butMyChoice.repaint();

    lblNorth.setForeground( colorNew ); lblNorth.repaint();

    butWest.setForeground( colorNew ); butWest.repaint();

    panSouth.setBackground( colorNew ); panSouth.repaint();

    txtSouth.setForeground( colorNew ); txtSouth.repaint();
    txtSouth.setBackground( Color.white ); txtSouth.repaint();


    repaint();
  }

} //class MyColor



