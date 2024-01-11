package com.rathod.oops;
/*
 * MyArraysClass12.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyArraysClass12 extends MyTrain12 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

  String strMsg = "";
  int intIndex;
  
  strMsg += "Array Class" + STRCRLF;
  strMsg += "  Rules" + STRCRLF;
  strMsg += "  * sort() - sorts Primatives & Objects" + STRCRLF;
  strMsg += "  * binarySearch() - array must be sorted." + STRCRLF;
  strMsg += STRCRLF;
  
  //------------------------------------------------
  
  strMsg += "  * Sorting with Array Class: int []" + STRCRLF;
  
  int [] aintMy = {8,5,1,2,6,3,4,7,9};
  strMsg += "    int [] aintMy = {8,5,1,2,6,3,4,7,9};" + STRCRLF;
  strMsg += "    Array order: ";
  for ( int x=0; x < aintMy.length; x++ ) {
    strMsg += "" + aintMy[x] + ","; 
  }
  strMsg += STRCRLF;
  
  java.util.Arrays.sort( aintMy );
  strMsg += "    java.util.Arrays.sort( aintMy );" + STRCRLF;
  
  strMsg += "    Array order after sort: ";
  for ( int x=0; x < aintMy.length; x++ ) {
    strMsg += "" + aintMy[x] + ","; 
  }
  strMsg += STRCRLF;

  strMsg += "  * binarySearch() on an int []" + STRCRLF;
  intIndex = java.util.Arrays.binarySearch( aintMy, 4);
  strMsg += "    intIndex = java.util.Arrays.binarySearch( aintMy, 4); Results: " + intIndex + STRCRLF;
  
  //------------------------------------------------
  
  strMsg += "  * Sorting with Array Class: String []" + STRCRLF;
  
  String [] astrMy = {"Michael","Mark","Adam","Stephen","John","Jane"};
  strMsg += "    String [] astrMy = {\"Michael\",\"Mark\",\"Adam\",\"Stephen\",\"John\",\"Jane\"};" + STRCRLF;
  strMsg += "    Array order: ";
  for ( int x=0; x < astrMy.length; x++ ) {
    strMsg += "" + astrMy[x] + ","; 
  }
  strMsg += STRCRLF;  
  
  java.util.Arrays.sort( astrMy );
  strMsg += "    java.util.Arrays.sort( astrMy );" + STRCRLF;
  
  strMsg += "    Array order after sort: ";
  for ( int x=0; x < astrMy.length; x++ ) {
    strMsg += "" + astrMy[x] + ","; 
  }
  strMsg += STRCRLF;

  strMsg += "  * binarySearch() on a String []" + STRCRLF;
  intIndex = java.util.Arrays.binarySearch( astrMy, "John");
  strMsg += "    intIndex = java.util.Arrays.binarySearch( astrMy, \"John\"); Results: " + intIndex + STRCRLF;
  strMsg += STRCRLF;
  
  strMsg += "You may want to play with: " + STRCRLF;
  strMsg += "  * sort() w/ a Comparator" + STRCRLF;
  strMsg += "  * fill()" + STRCRLF;
  strMsg += "  * equals()" + STRCRLF;
  
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
    final MyArraysClass12 applet = new MyArraysClass12();         //create the applet.
    MyTrain12.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof