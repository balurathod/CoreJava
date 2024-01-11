package com.rathod.oops;
/* File.......: MyComponentsAWT.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
*/

import java.applet.Applet;  //needed for: extends Applet

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;

import java.awt.List;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.CheckboxGroup;
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
public class MyAWTComponents extends Applet {
//#######################################################################
  TextArea txtareaMsg;

  //-----------------------------------------------------------------------
  public void init() {
//-----------------------------------------------------------------------

    Panel p;

    setBackground( Color.white );

    setLayout( new BorderLayout(5, 5) ); // (horizontal gap, verticle gap)

    //**********************
    //  North Border
    //**********************
    Panel pNorth = new Panel( new GridLayout(2,1) );

    p = new Panel();
    p.add( new Label( "Very Basic Example of the AWT's Components & Events" ) );

    pNorth.add( p ); // Grid 1, Centered because of panel.
    
    p = new Panel();  //default-FlowLayout Manager
    
      p.add( new Label("My Label") );
      
      Button btnMyButton = new Button("My Button");
      btnMyButton.addActionListener( new EventMyButton() );
      p.add( btnMyButton );
      
      p.add( new Label("Text:") );
      
      TextField txtMyTextField = new TextField("My TextField. Type here!",20);
      txtMyTextField.addActionListener( new EventMyTextField() );
      p.add( txtMyTextField );
      
      p.add( new Label("Pswd:") );

      TextField txtMyPassword = new TextField("",10);
      txtMyPassword.addActionListener( new EventMyTextField() );
      txtMyPassword.setEchoChar('*');
        
      p.add( txtMyPassword );
      
    pNorth.add( p );

    add(BorderLayout.NORTH, pNorth  );

    //**********************
    // South Border
    //**********************

    p = new Panel();
    
    EventMyHobbies objEventMyHobbies = new EventMyHobbies();
    Checkbox ckbkSports = new Checkbox("Sports");
      ckbkSports.addItemListener( objEventMyHobbies );  //Example of sharing one ItemListener.
    Checkbox ckbkCooking = new Checkbox("Cooking");
      ckbkCooking.addItemListener( objEventMyHobbies );  //Example of sharing one ItemListener.
    Checkbox ckbkReading = new Checkbox("Reading");
      ckbkReading.addItemListener( objEventMyHobbies );  //Example of sharing one ItemListener.

    
    p.add( new Label("Hobbies: ") );
      p.add( ckbkSports );
      p.add( ckbkCooking );
      p.add( ckbkReading );

    p.add( new Label( "  " ) ); //Used for Spacing.

    EventMyMarriageStatus objEventMyMarriageStatus = new EventMyMarriageStatus();
    CheckboxGroup ckgrpMarried = new CheckboxGroup();
    
    Checkbox ckbkMarried = new Checkbox("Married", ckgrpMarried, false);
      ckbkMarried.addItemListener( objEventMyMarriageStatus );  //Example of sharing one ItemListener.
    Checkbox ckbkSingle = new Checkbox("Single", ckgrpMarried, true);
      ckbkSingle.addItemListener( objEventMyMarriageStatus );  //Example of sharing one ItemListener.
    Checkbox ckbkWidowed = new Checkbox("Widowed", ckgrpMarried, false);
      ckbkWidowed.addItemListener( objEventMyMarriageStatus );  //Example of sharing one ItemListener.
    
    p.add( new Label("Marriage Status: ") );

      p.add( ckbkMarried );
      p.add( ckbkSingle );
      p.add( ckbkWidowed );
      
    add(BorderLayout.SOUTH, p );

    //**********************
    // West Border
    //**********************

    EventMyCheckbox objEventMyCheckbox = new EventMyCheckbox();
    Checkbox objCheckbox1 = new Checkbox("Checkbox 1");
      objCheckbox1.addItemListener( objEventMyCheckbox );  //Example of sharing one ItemListener.
    Checkbox objCheckbox2 = new Checkbox("Checkbox 2");
      objCheckbox2.addItemListener( objEventMyCheckbox );  //Example of sharing one ItemListener.
    Checkbox objCheckbox3 = new Checkbox("Checkbox 3");
      objCheckbox3.addItemListener( objEventMyCheckbox );  //Example of sharing one ItemListener.
    
    p = new Panel();
    p.setLayout( new GridLayout( 10, 1 ) );
      p.add( new Label("** Checkbox **") );
      p.add( objCheckbox1 );
      p.add( objCheckbox2 );
      p.add( objCheckbox3 );

    EventMyRadio objEventMyRadio = new EventMyRadio();
    CheckboxGroup ckgrpAge = new CheckboxGroup();
    
    Checkbox objCheckboxRadio1 = new Checkbox("Radio 1 (w/Group)", ckgrpAge,false);
      objCheckboxRadio1.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.
    Checkbox objCheckboxRadio2 = new Checkbox("Radio 2 (w/Group)", ckgrpAge,true);
      objCheckboxRadio2.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.
    Checkbox objCheckboxRadio3 = new Checkbox("Radio 3 (w/Group)", ckgrpAge,false);
      objCheckboxRadio3.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.
    Checkbox objCheckboxRadio4 = new Checkbox("Radio 4 (w/Group)", ckgrpAge,false);
      objCheckboxRadio4.addItemListener( objEventMyRadio );  //Example of sharing one ItemListener.

      p.add( new Label("** Checkbox-Radio **") );
      p.add( objCheckboxRadio1 );
      p.add( objCheckboxRadio2 );
      p.add( objCheckboxRadio3 );
      p.add( objCheckboxRadio4 );

    add("West", p );  //BorderLayout.WEST

    //**********************
    // East Border
    //**********************

    p = new Panel();
    p.setLayout( new GridLayout( 3, 1 ) );

    Choice choMy = new Choice();
      choMy.add("Choice 1");
      choMy.add("Choice 2");
      choMy.add("Choice 3");
      choMy.add("Choice 4");

      choMy.addItemListener( new EventMyChoice() );
      
    p.add( choMy );

    add(BorderLayout.EAST, p );

    //**********************
    // Center Border
    //**********************
    
    p = new Panel();
    p.setLayout( new GridLayout( 4, 1 ) );

    //List(# of rows, boolean-Can have multiple selections.)
    List myListMulti = new List(5, true);
      myListMulti.addItem("Multi Choice 1");
      myListMulti.addItem("Multi Choice 2");
      myListMulti.addItem("Multi Choice 3");
      myListMulti.addItem("Multi Choice 4");
      myListMulti.addItem("Multi Choice 5");

      myListMulti.addActionListener ( new EventMyMultiSelect() );
      myListMulti.addItemListener ( new EventMyMultiSelect() );
      
    p.add( myListMulti );

    List myListSingle = new List(5, false);
      myListSingle.addItem("Single Choice 1");
      myListSingle.addItem("Single Choice 2");
      myListSingle.addItem("Single Choice 3");
      myListSingle.addItem("Single Choice 4");
      myListSingle.addItem("Single Choice 5");

      myListSingle.addActionListener ( new EventMySingleSelect() );
      myListSingle.addItemListener ( new EventMySingleSelect() );

    p.add( myListSingle );
    
    TextArea objTextArea = new TextArea("My TextArea.  Select here and type.",
                                         5, 50);
    objTextArea.addTextListener( new EventMyTextArea() );

    p.add( objTextArea );

    txtareaMsg = new TextArea("Messages from events will go here!",
                              5, 50);
    p.add(txtareaMsg);    

    add(BorderLayout.CENTER, p );


  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );

  } //paint()

//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - MyComponentsAWT" );  
    app.setSize( 640, 480);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyAWTComponents applet = new MyAWTComponents();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

//##############################################################################
  class EventMyButton implements ActionListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   
      Button objButton = (Button) e.getSource();
    
      txtareaMsg.setText( "Pressed MyButton" + "\n" +
                          "Action Command = " + "|" + e.getActionCommand() + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" + 
                          "getLabel() = " + objButton.getLabel());
    }
    
  } //eoc (inner)
//##############################################################################
  class EventMyTextField implements ActionListener {
//##############################################################################

   
//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   
      TextField objTextField = (TextField) e.getSource();
    
      txtareaMsg.setText( "Pressed enter key in MyTextField" + "\n" +
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
      Object objObject = e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof Checkbox) );
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
  class EventMyRadio implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      Object objObject = e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof Checkbox) );
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
  class EventMyMultiSelect implements ActionListener, ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   

      Object objObject = e.getSource();
      System.out.println( "getSource() = " + objObject.getClass().getName() );
      
      List objList = (List) e.getSource();
      
      String [] astrItems = objList.getSelectedItems();
      String strItemList = "";
      for ( int x=0; x < astrItems.length; x++ ) {
        strItemList += astrItems[x]+","; //Create a list of items choosen.
      }
    
      txtareaMsg.setText( "Double clicked (list): " + strItemList + "\n" +
                          "Action Command = " + "|" + e.getActionCommand() + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n"  
                        );
    }
    
//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      Object objObject = e.getItem();
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      Integer objIntegerItem = (Integer) objObject;
      String strItem = objIntegerItem.toString();
      
      txtareaMsg.setText( "Single clicked: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMySingleSelect implements ActionListener, ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void actionPerformed ( ActionEvent e ){
//-----------------------------------------------------------------------------   

      Object objObject = e.getSource();
      System.out.println( "getSource() = " + objObject.getClass().getName() );
      
      List objList = (List) e.getSource();
      
      String [] astrItems = objList.getSelectedItems();
      String strItemList = "";
      for ( int x=0; x < astrItems.length; x++ ) {
        strItemList += astrItems[x]+","; //Create a list of items choosen.
      }
    
      txtareaMsg.setText( "Double clicked (list): " + strItemList + "\n" +
                          "Action Command = " + "|" + e.getActionCommand() + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n"  
                        );
    }
    
//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      Object objObject = e.getItem();
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      Integer objIntegerItem = (Integer) objObject;
      String strItem = objIntegerItem.toString();
      
      txtareaMsg.setText( "Single Clicked: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)

//##############################################################################
  class EventMyTextArea implements TextListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void textValueChanged(TextEvent e) {
//-----------------------------------------------------------------------------

      //Start: Debuging to figure out what getItem() is returning.
      Object objObject = e.getSource();
      System.out.println( "getSource() = " + objObject.getClass().getName() );
      //Stop:

      TextArea objTextArea = (TextArea) e.getSource();

      txtareaMsg.setText( "Changed TextArea for : " + objTextArea.getName() + "\n" +
                          "Length of text = " +objTextArea.getText().length() + "\n" +
                          "paramString() = " + e.paramString()  + "\n" +
                          "Text = " + objTextArea.getText()
                        );
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
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof Checkbox) );
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
      Object objObject = e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof Checkbox) );
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
  class EventMyMarriageStatus implements ItemListener {
//##############################################################################

//-----------------------------------------------------------------------------
    public void itemStateChanged(ItemEvent e) {
//-----------------------------------------------------------------------------   
      
      //Start: Debuging to figure out what getItem() is returning.
      Object objObject = e.getItem();
      System.out.println( "Is instanceof Checkbox: " + (objObject instanceof Checkbox) );
      System.out.println( "getItem() = " + objObject.getClass().getName() );
      //Stop:
    
      String strItem = (String) objObject;
      
      txtareaMsg.setText( "Checked a Checkbox: " + strItem + "\n" +
                          "getStateChange() = " + "|" + e.getStateChange()  + "|" + "\n" + 
                          "paramString() = " + e.paramString()  + "\n" 
                        );
    }
    
  } //eoc (inner)


} //eoc
//eof




