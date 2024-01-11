package com.rathod.oops;
/*
 * MyVector.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

import java.util.Vector;

//#################################################################################
public class MyVectorJdk11 extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Example of using Vector class:" + STRCRLF;
    strMsg += "  * The Vector class implements a growable array of objects." + STRCRLF;
    strMsg += "  * In JDK 1.2 the Vector class was retrofited to the collection framework" + STRCRLF;
    strMsg += "  * This Applet will teach JDK1.1 methods of the Vector Class." + STRCRLF;
    strMsg += STRCRLF;

    strMsg += "Values are added using addElement()." + STRCRLF;
    strMsg += "  Vector objVector = new Vector();" + STRCRLF;
    strMsg += "  objVector.addElement(\"#1 - Frist item\");" + STRCRLF;
    Vector objVector = new Vector();
    objVector.addElement("Frist");
    objVector.addElement("Second");
    objVector.addElement("Third");
    objVector.addElement("Hello");
    objVector.addElement("World");
    objVector.addElement("Hello");    
    
      
    strMsg += "size() & elementAt: Retrieving values" + STRCRLF;

    for ( int x=0; x < objVector.size(); x++ ) {
      strMsg += "  <"+x+"> " + objVector.elementAt(x) + STRCRLF;
    }

    strMsg += "Enumeration, hasMoreElements, & nextElement: Retrieving values" + STRCRLF;
    
    java.util.Enumeration objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "  * " + objEnumeration.nextElement().toString() + STRCRLF;
    }
    
    strMsg += "Other Methods" + STRCRLF;
    strMsg += "  * firstElement() Returns: " + objVector.firstElement() + STRCRLF;
    strMsg += "  * lastElement() Returns: " + objVector.lastElement() + STRCRLF;   
    strMsg += "  * indexOf(Object) Example: " + objVector.indexOf("Hello") + STRCRLF;
    strMsg += "  * indexOf(Object, Start) Example: " + objVector.indexOf("Hello",4) + STRCRLF;
    strMsg += "  * lastIndexOf(Object) Example: " + objVector.lastIndexOf("Hello") + STRCRLF;
    strMsg += "  * lastIndexOf(Object, Start) Example: " + objVector.lastIndexOf("Hello",4) + STRCRLF;
    strMsg += "  * size() Returns: " + objVector.size() + STRCRLF;
    
    strMsg += "  * setElementAt(), removeElementAt(), removeElement(), insertElementAt()" + STRCRLF;
    strMsg += "    (see source code)" + STRCRLF;
    
    int intMy = 0;
    intMy = objVector.indexOf("Hello");
    objVector.setElementAt("New Item", intMy);
    
    strMsg += "    " + objVector.elementAt( intMy ) + STRCRLF;
    
    objVector.removeElementAt( intMy );
    objVector.removeElement( "World" );
    objVector.insertElementAt("Insert", 1);
    
    strMsg += "  * New List after several methods run" + STRCRLF;
    objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }
    
    objVector.removeAllElements();

    strMsg += "Using Wrappers & Vector: Integer Wrapper" + STRCRLF;

    Integer objInteger;
    objVector.removeAllElements();

    for ( int x=0; x < 12; x++ ) {
      objVector.addElement( new Integer( x ) );
    }

    objEnumeration = objVector.elements();
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "  * " + objEnumeration.nextElement().toString() + STRCRLF;
    }
    
  /* //JDK 1.2
    strMsg += "toArray( Object )" + STRCRLF;
    
    Integer [] aobjInteger = new Integer [ objVector.size() ];
    objVector.toArray( aobjInteger );
    
    for (int x=0; x < aobjInteger.length; x++ ) {
      objInteger = (Integer) aobjInteger[x]; //Need cast because toArray() works with data type: Object.
      strMsg += objInteger.toString() + ",";
    } 
  */
    
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
    final MyVectorJdk11 applet = new MyVectorJdk11();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof