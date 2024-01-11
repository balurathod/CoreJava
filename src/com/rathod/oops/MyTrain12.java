package com.rathod.oops;
/*
 * MyTrain12.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */
//#################################################################################
public class MyTrain12 extends javax.swing.JApplet {
//#################################################################################  
  
  protected static final String STRCRLF = "\n"; //Need static for static initializers.
  private static final int INTWIDTH_DEFAULT    = 500;  //Default values if not passed via parms.
  private static final int INTHEIGHT_DEFAULT   = 600;  //    "
  private static final int INTTEXTAREA_COLUMNS = 75;   //Text Area - # of Columns
  private static final int INTTEXTAREA_ROWS    = 35;   //35 Text Area - # of Rows based on default font.
  
  private int intWidth  = 0; //Used to determine Window and TextArea size.  HTML parm or DOS parm.
  private int intHeight = 0; //      "

  //Start: Training instance variables
  
  
  //Stop:
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------
  String strMsg = "";
  String strFiller = "This is a test of showing some test information.  123456789 123456789 123456789";
      
    for ( int intLine=1; intLine <= 50; intLine++ ) {
      strMsg += "<"+intLine+"> " + "Training information... (JDK 1.2): " + strFiller + STRCRLF;
    }
  
  return strMsg;
}    

//----------------------------------------------------------------------------------  
  public void init_Components ( String strTrain ) {
//----------------------------------------------------------------------------------  

    //Start: Get HTML parameters if launched from browser/appletviewer.
    if ( this.intWidth <= 0 ) {  //Get HTML Parameter if Applet.
      String strWidth =  this.getParameter( "intWidth"  );
      if ( strWidth != null ) {
        this.intWidth = Integer.parseInt( strWidth );  
      } else {
        this.intWidth = INTWIDTH_DEFAULT;
      }
    }
      
    if ( this.intHeight <= 0 ) {
      String strHeight = this.getParameter( "intHeight" );
      if ( strHeight != null ) {
        this.intHeight = Integer.parseInt( strHeight );  
      } else {
        this.intHeight = INTHEIGHT_DEFAULT;
      }
    }
    //Stop:
      
      int intTextAreaColumns  = INTTEXTAREA_COLUMNS; //If you change this #, test printing in Netscape!!!
      int intTextAreaRows     = INTTEXTAREA_ROWS;    //If you change this #, test printing in Netscape!!!
      
      this.setBackground( java.awt.Color.white );
      this.setSize( intWidth, intHeight ); //NS needs this.
      
      //Start: Create & load display area.
      //Warning:  With TextArea, for some reason IE 5.50 may hang when printing.  NS4.7 works for me.
      
      javax.swing.JPanel pnlMain = new javax.swing.JPanel(); //Will not change components sizes by default.
      //Note: Need to convert to JTextArea.
      java.awt.TextArea objTextArea = new java.awt.TextArea( strTrain, intTextAreaRows, intTextAreaColumns, java.awt.TextArea.SCROLLBARS_BOTH ); //text, rows, columns, scrollbars.      add( objTextArea );
      objTextArea.setEditable(false);
      objTextArea.setFont( new java.awt.Font ("Monospaced", java.awt.Font.PLAIN, 10 ) );
      pnlMain.add( objTextArea );
      
      this.getContentPane().add(pnlMain);  //JDK1.2
      //Stop

    
  }

    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
//----------------------------------------------------------------------------------  
    public void init () {
//----------------------------------------------------------------------------------  
      
    init_Components( this.init_train() );
      
      
    }
//----------------------------------------------------------------------------------      
    public void paint(java.awt.Graphics g) {
//----------------------------------------------------------------------------------        
      
    }
//----------------------------------------------------------------------------------      
  public static void main_init( javax.swing.JFrame objJFrame, MyTrain12 applet, String args [] ) {
//----------------------------------------------------------------------------------      

    int intWidth  = INTWIDTH_DEFAULT;
    int intHeight = INTHEIGHT_DEFAULT;

    if ( args.length == 2 ) {
      intWidth  = Integer.parseInt( args[0] );
      intHeight = Integer.parseInt( args[1] );
    } 
    
    objJFrame.setSize( intWidth, intHeight);                         //set Frame: width, height

    objJFrame.addWindowListener(      //Register an anonymous class as a listener.
         new java.awt.event.WindowAdapter() {
            public void windowClosing( java.awt.event.WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    applet.intWidth  = intWidth;
    applet.intHeight = intHeight;
    applet.init();   //initialize applet.
    applet.start();  //start applet.

    objJFrame.getContentPane().add( applet, java.awt.BorderLayout.CENTER );    //add applet to center of frame.
    objJFrame.setVisible( true );                    //Make frame visible.
    
  }
//----------------------------------------------------------------------------------      
    public static void main( String args [] )
//----------------------------------------------------------------------------------      
  { 

    javax.swing.JFrame objFrame = new javax.swing.JFrame( "Training Example JDK1.1" );  
    final MyTrain12 applet = new MyTrain12();         //create the applet.
    MyTrain12.main_init( objFrame, applet, args );
    
    

  } //main()

} //eoc
//eof ;