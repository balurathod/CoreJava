package com.rathod.oops;
/*
 * MyTrainExample12.java
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
public class MyVectorJdk12 extends MyTrain12 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    int intRow = 0;

    strMsg += "Example of using Vector class:" + STRCRLF;
    strMsg += "  * The Vector class implements a growable array of objects." + STRCRLF;
    strMsg += "  * In JDK 1.2 the Vector class was retrofited to the collection framework" + STRCRLF;
    strMsg += "  * This Applet will teach JDK1.1 & JDK1.2 methods of the Vector Class." + STRCRLF;
    strMsg += "  * Use the Collections.sort() to sort the Vector class" + STRCRLF;
    strMsg += STRCRLF;

    strMsg += "Values are added using addElement()." + STRCRLF;
    strMsg += "  Vector objVector = new Vector();" + STRCRLF;
    strMsg += "  objVector.addElement(\"#1 - Frist item\");" + STRCRLF;
    Vector objVector = new Vector();
    objVector.addElement("Frist");
    objVector.addElement("Second");
    objVector.addElement("Third");
    objVector.add("Hello");         //Note: add() is JDK 1.2 only.  Same as addElement!
    objVector.add("World");
    objVector.add("Hello");    
      
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

    strMsg += "Sorting & Searching with Collections class" + STRCRLF;

    strMsg += "  * Order before Sort: (added 2 elements)" + STRCRLF;

    objVector.add("sort case test 1");
    objVector.add("Sort case test 2");

    objEnumeration = objVector.elements();
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }

    strMsg += "  * java.util.Collections.sort( objVector ); //JDK 1.2 Only. " + STRCRLF;
    strMsg += "  * Ascending Order (case sensitive):" + STRCRLF;
    
    java.util.Collections.sort( objVector ); //JDK 1.2 Only.
    
    objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }
    
    strMsg += "  * java.util.Collections.sort( objVector, java.util.Collections.reverseOrder() ); //JDK 1.2 Only. " + STRCRLF;
    strMsg += "  * Reverse order: (case sensitive)" + STRCRLF;
    
    java.util.Collections.sort( objVector, java.util.Collections.reverseOrder() ); //JDK 1.2 Only.
    
    objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }
    
    IgnoreCase_Ascending comparatorIgnoreCase_Ascending = new IgnoreCase_Ascending();
    
    strMsg += "  * java.util.Collections.sort( objVector, comparatorIgnoreCase_Ascending ); //JDK 1.2 Only. " + STRCRLF;
    strMsg += "  * Custom Order (not case sensitive !!!):" + STRCRLF;
    
    java.util.Collections.sort( objVector, comparatorIgnoreCase_Ascending ); //JDK 1.2 Only.
    
    objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }

    strMsg += "  * java.util.Collections.sort( objVector ); //JDK 1.2 Only. " + STRCRLF;
    strMsg += "  * Ascending Order - prepare for the binary search:" + STRCRLF;
    
    java.util.Collections.sort( objVector ); //JDK 1.2 Only.
    
    objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }
    
    strMsg += "  * Using java.util.Collections.binarySearch(...); //JDK 1.2 Only. " + STRCRLF;
    
    intRow = java.util.Collections.binarySearch(objVector, "Insert");
    strMsg += "    Insert is at row #: " + intRow + " (Row # starts with 0) "+ STRCRLF;
    
    objVector.removeAllElements();

    strMsg += "Using Wrappers & Vector: Integer Wrapper" + STRCRLF;
    strMsg += "  * Populating the array" + STRCRLF;

    Integer objInteger;
    objVector.removeAllElements();

    for ( int x=5; x >= 0; x-- ) {
      objVector.addElement( new Integer( x ) );
    }

    objEnumeration = objVector.elements();
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }

/*  Doesn't work.  Need to look into the Comparator interface.
    strMsg += "  * java.util.Collections.sort( objVector, java.util.Collections.reverseOrder()); //JDK 1.2 Only. " + STRCRLF;
    strMsg += "  * Reverse sort:" + STRCRLF;
    
    java.util.Collections.sort( objVector, java.util.Collections.reverseOrder() ); //JDK 1.2 Only.
    
    objEnumeration = objVector.elements();
    
    while ( objEnumeration.hasMoreElements() ) {
      strMsg += "    " + objEnumeration.nextElement().toString() + STRCRLF;
    }
*/
    
    //JDK 1.2 Only
    strMsg += "toArray( Object )" + STRCRLF;
    
    Integer [] aobjInteger = new Integer [ objVector.size() ];
    objVector.toArray( aobjInteger );
    
    for (int x=0; x < aobjInteger.length; x++ ) {
      objInteger = (Integer) aobjInteger[x]; //Need cast because toArray() works with data type: Object.
      strMsg += objInteger.toString() + ",";
    } 

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

    javax.swing.JFrame objFrame = new javax.swing.JFrame( "Training Example JDK1.2" );  
    final MyVectorJdk12 applet = new MyVectorJdk12();         //create the applet.
    MyTrain12.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

  class IgnoreCase_Ascending implements java.util.Comparator {
  	
  	public int compare(Object obj1, Object obj2) {
      int intReturn = 0;
      
      intReturn = ((String) obj1).compareToIgnoreCase((String) obj2); //Ignores Case.
      
  		return ( intReturn );
  	}

  } //eoc

} //eoc
//eof