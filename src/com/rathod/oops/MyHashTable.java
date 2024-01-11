package com.rathod.oops;
/*
 * MyHashTable.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

import java.util.Hashtable;
import java.util.Enumeration;

//#################################################################################
public class MyHashTable extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Example of using Hashtable class:" + STRCRLF;
    strMsg += STRCRLF;

    strMsg += "Look at the source code.  Values are added using put().  Notice the order." + STRCRLF;
    strMsg += "Notice that the order is reversed when retrieved using Enumeration." + STRCRLF;

    Hashtable objHashTable = new Hashtable();
    objHashTable.put("Key1", "#1 - Frist item");  //Hashtable.put( Key, value );
    objHashTable.put("Key2", "#2 - Second item");
    objHashTable.put("Key3", "#3 - Third item");
      
    int x;
    Enumeration objEnumeration;

    strMsg += STRCRLF;
    strMsg += "Example of retrieving values via Hashtable.elements():" + STRCRLF;

    objEnumeration = objHashTable.elements(); //Return an enumeration of values.
    x = 0;
    while ( objEnumeration.hasMoreElements()) {
      x++;
      strMsg += "<"+x+"> " + objEnumeration.nextElement() + STRCRLF;
    }

    strMsg += STRCRLF;
    strMsg += "Example of retrieving keys via Hashtable.keys():" + STRCRLF;
        
    objEnumeration = objHashTable.keys(); //Return an enumeration of values.
    x = 0;
    while ( objEnumeration.hasMoreElements()) {
      x++;
      strMsg += "<"+x+"> " + objEnumeration.nextElement() + STRCRLF;
    }

    strMsg += STRCRLF;
    strMsg += "The real power of a hastable is Storage & Retrieval of value pairs:" + STRCRLF;

    strMsg += "Search for key=\"Key1\" - value = " + objHashTable.get("Key1") + STRCRLF;
    strMsg += "Search for key=\"Key3\" - value = " + objHashTable.get("Key3") + STRCRLF;
    strMsg += "Search for key=\"Key2\" - value = " + objHashTable.get("Key2") + STRCRLF;

    return strMsg;
  }    
  
//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    java.awt.Frame objFrame = new java.awt.Frame( "Training Example JDK1.1" );  
    final MyHashTable applet = new MyHashTable();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof