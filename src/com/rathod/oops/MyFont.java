package com.rathod.oops;
/* File.......: MyFont.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
   Compile....: javac MyFont.java -d bin

   Run Browser: MyFont.html
   Run JDK....: appletviewer MyFont.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.*;
import java.awt.event.*;

//***********************************************************************
public class MyFont extends Applet implements ActionListener,
                                              ItemListener
//***********************************************************************
{
  Choice    choFonts;
  TextField txtPoint;
  Checkbox  ckbBold        = new Checkbox("Bold");
  Checkbox  ckbItalic      = new Checkbox("Italic");
  Label     lblDescription = new Label("Description");
  Label     lblExample     = new Label("Example");

  int intFontIndex = 0;

//-----------------------------------------------------------------------
  public void init()
  { Panel p;

    setBackground( Color.white );

    setLayout( new BorderLayout() );

    //Start: North Border
    p = new Panel();
      choFonts = makeFontChoice();
      choFonts.addItemListener( this );
      p.add( choFonts );

      p.add( new Label("Point Size") );

      txtPoint = new TextField( "36", 15 );
      txtPoint.addActionListener( this );
      p.add( txtPoint );

      ckbBold.addItemListener( this );
      p.add( ckbBold );

      ckbItalic.addItemListener( this );
      p.add( ckbItalic );

      add( BorderLayout.NORTH, p );

    //Stop: North Border

    //South Border
    add( BorderLayout.SOUTH, lblDescription );

    //Center Border
    lblExample.setAlignment(Label.CENTER);    //Center in the text in Label
    add( BorderLayout.CENTER, lblExample );

    //Set lblDescription & lblExample ( Font & Text Description)
    setNewFont();  

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  { 

  } //paint()

//-----------------------------------------------------------------------
  public void actionPerformed(ActionEvent event)
  {
    setNewFont();
    repaint();
  }

//-----------------------------------------------------------------------
  public void itemStateChanged( ItemEvent event )
  {
    intFontIndex = choFonts.getSelectedIndex();    //Save item # choosen.

    setNewFont();
    repaint();
  }

//-----------------------------------------------------------------------
  private void setNewFont()
  {
    lblExample.setFont( getNewFont() );       //Get new Font.
    lblExample.setText( getNewFontDesc( lblExample.getFont() ) ); //Get Font description

    lblDescription.setText( lblExample.getFont().toString() );
    lblDescription.setAlignment(Label.CENTER);  //Center in the south!
  }

//-----------------------------------------------------------------------
  private Font getNewFont()
  {
    Font fntReturn;
    String strFontName;
    int    intStyle;
    int    intPoint;

    strFontName = choFonts.getItem( intFontIndex );  //Get new Font Name

    intPoint    = txtToInt( txtPoint );  //Get new Point Size

    intStyle = Font.PLAIN;         //Get the new Style.
    if ( ckbBold.getState() )
      intStyle += Font.BOLD;
    if ( ckbItalic.getState() )
      intStyle += Font.ITALIC;

    fntReturn = new Font( strFontName, intStyle, intPoint );  //Create Font!

    return fntReturn;
  }

//-----------------------------------------------------------------------
  private String getNewFontDesc( Font fontMy )
  { String strReturn;

    strReturn = fontMy.getName() + " " +     //Font class: name of font
                fontMy.getSize() + "pt " +   //            point size
                getFontStyle( fontMy );

    return strReturn;
  }

//-----------------------------------------------------------------------
  private String getFontStyle( Font fontMy )  // used by getNewFontDesc
  { String strReturn = "";

    if ( fontMy.isBold() )
      strReturn += "Bold ";        //If Bold, then say its bold.
    if ( fontMy.isItalic() )
      strReturn += "Italic ";      //If Italic, then say its italic.

    return strReturn;
  }

//-----------------------------------------------------------------------
  private int txtToInt( TextField txtField )
  { int intReturn = 0;

    //Convert a TextField's value to an integer.
    try { intReturn  = Integer.parseInt( txtField.getText() ); }
      catch ( NumberFormatException e ) {
        intReturn = 0; txtField.setText("0");
      }

    return intReturn;
  }

//-----------------------------------------------------------------------
  private Choice makeFontChoice()
  { String [] astrFonts;
    
    Choice choReturn = new Choice();

    //Build a list of fonts available via the Browser using Toolkit.
    astrFonts = Toolkit.getDefaultToolkit().getFontList();
    for ( int i=0; i < astrFonts.length; i++ )
      choReturn.addItem( astrFonts[ i ] );
    
    return choReturn;
  }

} //class MyFont





