package com.rathod.oops;
/*
  File.......: MyHello_JAppletOrApp.java
  Description: Example of Swing Components (App or Applet)
  Programmer.: Michael Thomas
  Date.......: Updated 12/22/01, Orig 12/22/01

*/
import javax.swing.JApplet;      //need for extends Applet.
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.text.Document;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.DocumentListener;

import java.awt.Container;
import java.awt.Graphics;       //need for paint()
import java.awt.Color;
import java.awt.List;
import java.awt.Choice;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//#######################################################################
public class MySwingComponents extends JApplet {
//#######################################################################
  JTextArea txtareaMsg;

  //-----------------------------------------------------------------------
  public void init() {
//-----------------------------------------------------------------------

    Container objContainer = super.getContentPane();
    objContainer.setBackground( Color.white );

    JPanel p;

    super.getContentPane().setLayout( new BorderLayout(5, 5) ); // (horizontal gap, verticle gap)

    //**********************
    //  North Border
    //**********************
    JPanel pNorth = new JPanel( new GridLayout(2,1) );

    p = new JPanel();
    p.add( new JLabel( "Very Basic Example of the Swing's Components & Events" ) );

    pNorth.add( p ); // Grid 1, Centered because of panel.
    
    p = new JPanel();  //default-FlowLayout Manager

      p.add( new JLabel("My Label") );
      
      JButton btnMyButton = new JButton("My Button");
      btnMyButton.addActionListener( new EventMyButton() );
      p.add( btnMyButton );

      p.add( new JLabel("Text:") );
      
      JTextField txtMyTextField = new JTextField("My TextField. Type here!",20);
      txtMyTextField.addActionListener( new EventMyTextField() );
      p.add( txtMyTextField );

      p.add( new JLabel("Pswd: ") );
      
      JPasswordField pswdMyPassword = new JPasswordField(10);
      pswdMyPassword.addActionListener( new EventMyPswd () );
      p.add( pswdMyPassword );
      
    pNorth.add( p );

    super.getContentPane().add(BorderLayout.NORTH, pNorth  );

    //**********************
    // South Border
    //**********************

    p = new JPanel();
    
    EventMyHobbies objEventMyHobbies = new EventMyHobbies();
    JCheckBox ckbkSports = new JCheckBox("Sports");
      ckbkSports.addItemListener( objEventMyHobbies );  //Example of sharing one ItemListener.
    JCheckBox ckbkCooking = new JCheckBox("Cooking");
      ckbkCooking.addItemListener( objEventMyHobbies );  //Example of sharing one ItemListener.
    JCheckBox ckbkReading = new JCheckBox("Reading");
      ckbkReading.addItemListener( objEventMyHobbies );  //Example of sharing one ItemListener.
    
    p.add( new JLabel("Hobbies: ") );
      p.add( ckbkSports );
      p.add( ckbkCooking );
      p.add( ckbkReading );

    p.add( new JLabel( "  " ) ); //Used for Spacing.

    EventMyMarriageStatus objEventMyMarriageStatus = new EventMyMarriageStatus();
    
    JRadioButton ckbkMarried = new JRadioButton("Married", false);
      ckbkMarried.addItemListener( objEventMyMarriageStatus );  //Example of sharing one ItemListener.
    JRadioButton ckbkSingle = new JRadioButton("Single", true);
      ckbkSingle.addItemListener( objEventMyMarriageStatus );  //Example of sharing one ItemListener.
    JRadioButton ckbkWidowed = new JRadioButton("Widowed", false);
      ckbkWidowed.addItemListener( objEventMyMarriageStatus );  //Example of sharing one ItemListener.
    
    ButtonGroup btngrpMaritialStatus = new ButtonGroup();
    btngrpMaritialStatus.add( ckbkMarried );
    btngrpMaritialStatus.add( ckbkSingle );
    btngrpMaritialStatus.add( ckbkWidowed );
      
    p.add( new JLabel("Marriage Status: ") );

      p.add( ckbkMarried );
      p.add( ckbkSingle );
      p.add( ckbkWidowed );
      
    super.getContentPane().add(BorderLayout.SOUTH, p );

    //**********************
    // West Border
    //**********************

    EventMyCheckbox objEventMyCheckbox = new EventMyCheckbox();
    JCheckBox obJCheckBox1 = new JCheckBox("Checkbox 1");
      obJCheckBox1.addItemListener( objEventMyCheckbox );  //Example of sharing one ItemListener.
    JCheckBox obJCheckBox2 = new JCheckBox("Checkbox 2");
      obJCheckBox2.addItemListener( objEventMyCheckbox );  //Example of sharing one ItemListener.
    JCheckBox obJCheckBox3 = new JCheckBox("Checkbox 3");
      obJCheckBox3.addItemListener( objEventMyCheckbox );  //Example of sharing one ItemListener.
    
    p = new JPanel();
    p.setLayout( new GridLayout( 10, 1 ) );
      p.add( new JLabel("** Checkbox **") );
      p.add( obJCheckBox1 );
      p.add( obJCheckBox2 );
      p.add( obJCheckBox3 );

    EventMyRadio objEventMyRadio = new EventMyRadio();

    JCheckBox obJCheckBoxRadio1 = new JCheckBox("Radio 1 (w/Group)", false);
      obJCheckBoxRadio1.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.
    JCheckBox obJCheckBoxRadio2 = new JCheckBox("Radio 2 (w/Group)", true);
      obJCheckBoxRadio2.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.
    JCheckBox obJCheckBoxRadio3 = new JCheckBox("Radio 3 (w/Group)", false);
      obJCheckBoxRadio3.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.
    JCheckBox obJCheckBoxRadio4 = new JCheckBox("Radio 4 (w/Group)", false);
      obJCheckBoxRadio4.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.

    ButtonGroup btngrpGroup = new ButtonGroup();
    btngrpGroup.add( obJCheckBoxRadio1 );
    btngrpGroup.add( obJCheckBoxRadio2 );
    btngrpGroup.add( obJCheckBoxRadio3 );
    btngrpGroup.add( obJCheckBoxRadio4 );

      
      p.add( new JLabel("** Checkbox-Radio **") );
      p.add( obJCheckBoxRadio1 );
      p.add( obJCheckBoxRadio2 );
      p.add( obJCheckBoxRadio3 );
      p.add( obJCheckBoxRadio4 );

    super.getContentPane().add("West", p );  //BorderLayout.WEST

    //**********************
    // East Border
    //**********************

    p = new JPanel();
    p.setLayout( new GridLayout( 3, 1 ) );

    Choice choMy = new Choice();
      choMy.add("Choice 1");
      choMy.add("Choice 2");
      choMy.add("Choice 3");
      choMy.add("Choice 4");      choMy.addItemListener( new EventMyChoice() );
      
    p.add( choMy );

    super.getContentPane().add(BorderLayout.EAST, p );

    //**********************
    // Center Border
    //**********************
    
    p = new JPanel();
    p.setLayout( new GridLayout( 4, 1 ) );

    //List(# of rows, boolean-Can have multiple selections.)
    String [] astrListMulti = {"Multi Choice 1","Multi Choice 2","Multi Choice 3","Multi Choice 4","Multi Choice 5"};
    JList myListMulti = new JList( astrListMulti ); //zzz How ? List only 5 ? MULTIPLE_INTERVAL_SELECTION SINGLE_INTERVAL_SELECTION 
    myListMulti.setSelectionMode(  ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
    
    myListMulti.addListSelectionListener ( new EventMyMultiSelect() );
      
    p.add( new JScrollPane( myListMulti ) );

    String [] astrListSingle = {"Single Choice 1","Single Choice 2","Single Choice 3","Single Choice 4","Single Choice 5"};
    JList myListSingle = new JList( astrListSingle);
    myListSingle.setSelectionMode(  ListSelectionModel.SINGLE_INTERVAL_SELECTION );

    myListSingle.addListSelectionListener ( new EventMySingleSelect() );

    p.add( new JScrollPane( myListSingle ) );
    
    JTextArea objTextArea = new JTextArea("My TextArea.  Select here and type.",
                                         5, 50);

    objTextArea.getDocument().addDocumentListener( new EventMyTextArea() );
    objTextArea.setLineWrap( true ); //Example of line wrap turned on.
 
    p.add( new JScrollPane( objTextArea ) );

    txtareaMsg = new JTextArea("Messages from events will go here!",
                              5, 50);
    txtareaMsg.setLineWrap( false ); //Example of line wrap turned off.
    txtareaMsg.setEditable( false );
    
    p.add( new JScrollPane ( txtareaMsg ) );    

    super.getContentPane().add(BorderLayout.CENTER, p );


  }

//-----------------------------------------------------------------------
  public static void main( String args [] ) { 
//-----------------------------------------------------------------------

    JFrame app = new JFrame( "Swing Compononents & Events" );  
    app.setSize( 640, 480);  //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    MySwingComponents applet = new MySwingComponents();         //create the applet.

    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.getContentPane().add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible
  } //main()

//##############################################################################
  class EventMyButton implements ActionListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   
      JButton objButton = (JButton) e.getSource();
    
      txtareaMsg.setText( "Pressed MyButton" + "\n" +
                          "Action Command = " + "|" + e.getActionCommand() + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" + 
                          "getLabel() = " + objButton.getName());
    }
    
  } //eoc (inner)
//##############################################################################
  class EventMyTextField implements ActionListener {
//##############################################################################

   
//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   
      JTextField objTextField = (JTextField) e.getSource();
    
      txtareaMsg.setText( "Pressed enter key in MyTextField" + "\n" +
                          "Action Command = " + "|" + e.getActionCommand() + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" + 
                          "getText() = " + objTextField.getText());
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyPswd implements ActionListener {
//##############################################################################
   
//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   
      JTextField objTextField = (JTextField) e.getSource();
    
      txtareaMsg.setText( "Pressed enter key in MyPassword." + "\n" +
                          "Action Command = " + "|" + e.getActionCommand() + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" + 
                          "getText() = " + objTextField.getText());
    }
    
  } //eoc (inner)
  
//##############################################################################
  class EventMyCheckbox implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      //Object [] aobjObject = e.getItemSelectable().getSelectedObjects();
      //if ( aobjObject.length >= 1 ) {
      //  System.out.println( "getSelectedObjects row 0's data type = " + aobjObject[0].getClass().getName() );
     // }
      
      //Start: Debuging to figure out what getItem() is returning.
      JCheckBox objObject = (JCheckBox) e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof JCheckBox) );
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      String strItem = objObject.getText();
      
      txtareaMsg.setText( "Checked a Checkbox: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyRadio implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      JCheckBox objObject = (JCheckBox) e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof JCheckBox) );
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      String strItem = objObject.getText();
      
      txtareaMsg.setText( "Checked a Checkbox: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyMultiSelect implements ListSelectionListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void valueChanged(ListSelectionEvent e) {
//-----------------------------------------------------------------------------   

      Object objObject = e.getSource();
      System.out.println( "getSource() = " + objObject.getClass().getName() );
      
      JList objList = (JList) e.getSource();
      
      Object [] astrItems = objList.getSelectedValues();
      String strItemList = "";
      for ( int x=0; x < astrItems.length; x++ ) {
        strItemList += astrItems[x].toString()+","; //Create a list of items choosen.
      }
    
      txtareaMsg.setText( "Double clicked (list): " + strItemList + "\n" +
                          "getFirstIndex() = " + e.getFirstIndex()  + "|" + "getLastIndex() = " + e.getLastIndex()  + "|" + "\n" +
                          "getValueIsAdjusting() = " + e.getValueIsAdjusting()  + "|" + "\n" +
                          "Objects properties = " + "|" + e.toString() + "|" + 
                          ""
                        );
    }
    
    
  } //eoc (inner)

//##############################################################################
  class EventMySingleSelect implements ListSelectionListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void valueChanged(ListSelectionEvent e) {
//-----------------------------------------------------------------------------   

      Object objObject = e.getSource();
      System.out.println( "getSource() = " + objObject.getClass().getName() );
      
      JList objList = (JList) e.getSource();
      
      Object [] astrItems = objList.getSelectedValues();
      String strItemList = "";
      for ( int x=0; x < astrItems.length; x++ ) {
        strItemList += astrItems[x].toString()+","; //Create a list of items choosen.
      }
    
      txtareaMsg.setText( "Double clicked (list): " + strItemList + "\n" +
                          "getFirstIndex() = " + e.getFirstIndex()  + "|" + "getLastIndex() = " + e.getLastIndex()  + "|" + "\n" +
                          "getValueIsAdjusting() = " + e.getValueIsAdjusting()  + "|" + "\n" +
                          "Objects properties = " + "|" + e.toString() + "|" + 
                          ""
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyTextArea implements DocumentListener {
//##############################################################################

    //**************************************************************************
    public void removeUpdate(javax.swing.event.DocumentEvent de) {
    //**************************************************************************
      txtareaMsg.setText ( createMsg( de ) );
    }
    
    //**************************************************************************
    public void changedUpdate(javax.swing.event.DocumentEvent de) {
    //**************************************************************************
      txtareaMsg.setText ( createMsg( de ) );
      System.out.println( "changedUpdate() - a mystery to me!");
    }
    
    //**************************************************************************
    public void insertUpdate(javax.swing.event.DocumentEvent de) {
    //**************************************************************************
      txtareaMsg.setText ( createMsg( de ) );
    }
    
    //**************************************************************************
    public String createMsg(javax.swing.event.DocumentEvent de) {
    //**************************************************************************

      String strReturn;

      String strText = "";
      Document objDocument = (Document) de.getDocument();
      
      try {
        strText = objDocument.getText(de.getOffset(), de.getLength());
      } catch ( javax.swing.text.BadLocationException ble ) {
        strText = "Bad pointer to text in text area. Also: 'Delete' or CTR-X.";
      }

      strReturn =  "getType() = " + de.getType().toString()  + "\n" +
                   "Text = " + strText + "\n" +
                   "getOffset() / getLength() = " + de.getOffset() + "/" + de.getLength() + 
                   "";
                   
      
      return strReturn;
      
    }
    
  }//inner eoc

//##############################################################################
  class EventMyChoice implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      Object objObject = e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof JCheckBox) );
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      String strItem = (String) objObject;
      
      txtareaMsg.setText( "Checked a Checkbox: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyHobbies implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      //Object [] aobjObject = e.getItemSelectable().getSelectedObjects();
      //if ( aobjObject.length >= 1 ) {
      //  System.out.println( "getSelectedObjects row 0's data type = " + aobjObject[0].getClass().getName() );
     // }
      
      //Start: Debuging to figure out what getItem() is returning.
      JCheckBox objObject = (JCheckBox) e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof JCheckBox) );
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      String strItem = objObject.getText();
      
      txtareaMsg.setText( "Checked a Checkbox: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyMarriageStatus implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      JRadioButton objObject = (JRadioButton) e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof JRadioButton) );
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      String strItem = objObject.getText();
      
      txtareaMsg.setText( "Checked a Checkbox: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)


} //eoc
//eof
