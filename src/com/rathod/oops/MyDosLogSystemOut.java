package com.rathod.oops;
/*
  File.......: MyDosLogCompileErrors.java
  Description: Example of loging compile errors via DOS.
  Programmer.: Michael Thomas, 11/29/02

*/
public class MyDosLogSystemOut {
  public static void main( String [] args ) {

    System.out.println( "Example of Dos logging of System.out.println()" ); //Compile error.
    
    for ( int x=1; x < 30; x++ ) {
    	System.out.println("" + x + ". Example");
    }
    
  }
}
