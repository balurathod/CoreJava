package com.rathod.oops;
/*
 * MyString.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyString extends MyTrain11 {
//#################################################################################  
  
  String strJavaVersion = System.getProperty("java.version");
  double dblJavaVersion;
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------
    System.out.println( "Java Version:" +  strJavaVersion );
    Double objDouble = new Double( strJavaVersion.substring(0,strJavaVersion.lastIndexOf(".")) );
    double dblJavaVersion = objDouble.doubleValue();
    System.out.println("Java Major Version: " + dblJavaVersion);
    
    String strMsg = "";

    String strMy;
    char charMy;
    boolean blnMy;
    int intMy;
    String strCmp1;
    String strCmp2;
    String strTest;
    int intCmp;
    int intCmp1;
    int intCmp2;
    
    //----------------------------
    strMsg += "String Class" + STRCRLF;
    strMsg += "  * Strings are immutable - they are constant and cannot change" + STRCRLF;
    strMsg += "    after they have been created." + STRCRLF;
    strMsg += "  * myString += \"Hello\"; - This statement creates a new String Object" + STRCRLF;

    //----------------------------
    strMsg += "== vs equals()" + STRCRLF;
    strMsg += "  * == - is it the same object in memory." + STRCRLF;
    strMsg += "  * equals() - is the string contents the same." + STRCRLF;
    strMsg += "  * If at compile time, 2 strings have the same litteral value then a new object is not created!"  + STRCRLF;
    strMsg += "  (Note: You need to look at the java code!) " + STRCRLF;
    
    String strA1 = new String ("java");
    String strB1 = new String ("java");
    String strA = "java";
    String strB = "java";
    String strX = "ja";
    String strY = "va";

    strMsg += "  Ex 1: " + (strA1 == strB1) + " - 2 different objects" + STRCRLF; //false
    strMsg += "  Ex 2: " + (strA == strB) + " - strB was assigned to the strA object by JVM." + STRCRLF ;    //true
    strMsg += "  Ex 3: " + (strA == ("ja" + "va")) + " - compiler assigned \"java\" to the strA object (just like strB)" + STRCRLF ;  //true
    strMsg += "  Ex 4: " + (strA1 == ("ja" + "va")) + " - compiler assigned \"java\" to strA which is another object." + STRCRLF ; //false
    strMsg += "  Ex 5: " + (strA == ("ja" + strY)) + " - this happens at runtime, therefore the JVM creates another object." + STRCRLF ;    //false
    strMsg += "  Ex 6: " + (strA == (strX + strY)) + " - this happens at runtime, therefore the JVM creates another object." + STRCRLF ;    //false
    strMsg += "  Ex 7: " + (strB == ("ja" + "va")) + " - \"java\" was assigned to the strA object which strB had also be assigned to." + STRCRLF ;  //true

    //----------------------------
    strMsg += "charAt() - returns a char at a specific position. (Start w/ 0)" + STRCRLF;
    
    strMy = "Java"; charMy = strMy.charAt(2);
    strMsg += "  * strMy = \"Java\"; charMy = strMy.charAt(2); Returns: "  + charMy + STRCRLF;
    
    charMy = "Java".charAt(2);
    strMsg += "  * \"Java\".charAt(2); Returns: " + charMy + STRCRLF;
 

    //----------------------------
    strMsg += "compareTo() & compareToIgnoreCase()" + STRCRLF;
    strMsg += "  Note: 0 = same, Positive = >, Negative = <" + STRCRLF;

    //----------------------------
    strCmp1 = "a"; strCmp2 = "b";
    strMsg += "  * strCmp1 = \"a\"; strCmp2 = \"b\";" + STRCRLF;
    
    intCmp = strCmp1.compareTo( strCmp2 );
    strMsg += "    int intCmp = strCmp1.compareTo( strCmp2 ) - Results: " + intCmp + STRCRLF;

    strMsg += "    " + strCmp1 + " is ";
    if ( intCmp < 0 ) {
      strMsg += " less than ";
    } else if ( intCmp > 0 ) {
      strMsg += " greater than ";
    } else {
      strMsg += " equal to ";
    }
    strMsg += " " + strCmp2 + "." + STRCRLF;
    
    //----------------------------
    intCmp1 = ( int ) 'a';
    intCmp2 = ( int ) 'A';

    strMsg += "  Note: a = " + intCmp1 + ", A = " + intCmp2 + ", a - A = " + ( intCmp1 - intCmp2 ) + STRCRLF;

    //----------------------------
    strCmp1 = "a"; strCmp2 = "a";
    intCmp = strCmp1.compareTo( strCmp2 );
    strMsg += "  * strCmp1 = \"a\"; strCmp2 = \"a\";" + STRCRLF;
    strMsg += "    int intCmp = strCmp1.compareTo( strCmp2 ) - Results: " + intCmp + STRCRLF;

    //----------------------------
    strCmp1 = "a"; strCmp2 = "A";
    intCmp = strCmp1.compareTo( strCmp2 );
    strMsg += "  * strCmp1 = \"a\"; strCmp2 = \"A\";" + STRCRLF;
    strMsg += "    int intCmp = strCmp1.compareTo( strCmp2 ) - Results: " + intCmp + STRCRLF;

    //----------------------------
    strCmp1 = "A"; strCmp2 = "a";
    intCmp = strCmp1.compareTo( strCmp2 );
    strMsg += "  * strCmp1 = \"A\"; strCmp2 = \"a\";" + STRCRLF;
    strMsg += "    int intCmp = strCmp1.compareTo( strCmp2 ) - Results: " + intCmp + STRCRLF;

    //----------------------------
    strCmp1 = "Java"; strCmp2 = "JAva";
    intCmp = strCmp1.compareTo( strCmp2 );
    strMsg += "  * strCmp1 = \"Java\"; strCmp2 = \"JAva\";" + STRCRLF;
    strMsg += "    int intCmp = strCmp1.compareTo( strCmp2 ) - Results: " + intCmp + STRCRLF;

    //Java 1.2 only!  If you want to test with Appletviewer, just remove the comments.
    //intCmp = strCmp1.compareToIgnoreCase(strCmp2);
    //strMsg += "    intCmp = strCmp1.compareToIgnoreCase(strCmp2); - Results: " + intCmp + STRCRLF;

    //----------------------------
    strCmp1 = "Java"; strCmp2 = "JAVA";
    intCmp = strCmp1.compareTo( strCmp2 );
    strMsg += "  * strCmp1 = \"Java\"; strCmp2 = \"JAVA\";" + STRCRLF;
    strMsg += "    int intCmp = strCmp1.compareTo( strCmp2 ) - Results: " + intCmp + STRCRLF;

 
    //----------------------------
    strMsg += "concat()" + STRCRLF;

    strCmp1 = "I Love "; strCmp2 = "Java";
    strMsg += "  * strCmp1 = \"I Love \"; strCmp2 =\"Java\";" + STRCRLF;

    strMy = strCmp1.concat( strCmp2 );
    strMsg += "  * strMy = strCmp1.concat( strCmp2 ); Results: " + strMy + STRCRLF;
    
    //----------------------------
    strMsg += "endsWith()" + STRCRLF;
    
    strMy = "Java"; blnMy = strMy.endsWith( "va" );

    strMsg += "  * strMy = \"Java\"; blnMy = strMy.endsWith( \"va\" ); Results: " + blnMy + STRCRLF;
    
    //----------------------------
    strMsg += "equals() & equalsIgnoreCase()" + STRCRLF;
    
    strCmp1 = "Java"; strCmp2 = "JaVa";
    blnMy = strCmp1.equals( strCmp2 );

    strMsg += "  * strCmp1 = \"Java\"; strCmp2 = \"JaVa\";" + STRCRLF;
    strMsg += "    blnMy = strCmp1.equals( strCmp2 ); Results: " + blnMy + STRCRLF;

    blnMy = strCmp1.equalsIgnoreCase( strCmp2 );
    
    strMsg += "  * blnMy = strCmp1.equalsIgnoreCase( strCmp2 ); Results: " + blnMy + STRCRLF;

    //----------------------------
    strMsg += "hashCode()" + STRCRLF;
    
    strCmp1 = "Java"; strCmp2 = "JaVa"; strMy = strCmp2;
    
    strMsg += "  * strCmp1 = \"Java\"; strCmp2 = \"JaVa\"; strMy = strCmp2;" + STRCRLF;

    strMsg += "    strCmp1.hashCode(); Results: " + strCmp1.hashCode() + STRCRLF;
    strMsg += "    strCmp2.hashCode(); Results: " + strCmp2.hashCode() + STRCRLF;
    strMsg += "    strMy.hashCode(); Resutls: "   + strMy.hashCode() + STRCRLF;
    
    //----------------------------
    strMsg += "indexOf()" + STRCRLF;
    strMsg += "  Returns position of match or -1 for not found. Starts from the begining." + STRCRLF;

    strMy = "I Love Java" + STRCRLF;
    strMsg += "  * strMy = \"I Love Java\"" + STRCRLF;
    
    intMy = strMy.indexOf( 'a' );
    strMsg += "  * intMy = strMy.indexOf( 'a' ); Returns: " + intMy + STRCRLF;
    intMy = strMy.indexOf( 'a', ++intMy );
    strMsg += "  * intMy = strMy.indexOf( 'a', ++intMy ); Returns: " + intMy + STRCRLF;
    
    intMy = strMy.indexOf( "Love" );
    strMsg += "  * intMy = strMy.indexOf( \"Love\" ); Returns: " + intMy + STRCRLF;
    intMy = strMy.indexOf( "Love", --intMy );
    strMsg += "  * intMy = strMy.indexOf( \"Love\", --intMy ); Returns: " + intMy + STRCRLF;

    //----------------------------
    strMsg += "lastIndexOf()" + STRCRLF;
    strMsg += "  Returns position of match or -1 for not found. Starts from the end." + STRCRLF;

    strMy = "I Love Java" + STRCRLF;
    strMsg += "  * strMy = \"I Love Java\"" + STRCRLF;
    
    intMy = strMy.lastIndexOf( 'a' );
    strMsg += "  * intMy = strMy.lastIndexOf( 'a' ); Returns: " + intMy + STRCRLF;
    intMy = strMy.lastIndexOf( 'a', --intMy );
    strMsg += "  * strMy.lastIndexOf( 'a', --intMy ); Returns: " + intMy + STRCRLF;
    
    intMy = strMy.lastIndexOf( "Love" );
    strMsg += "  * intMy = strMy.lastIndexOf( \"Love\" ); Returns: " + intMy + STRCRLF;
    intMy = strMy.lastIndexOf( "Love", ++intMy );
    strMsg += "  * strMy.lastIndexOf( \"Love\", ++intMy ); Returns: " + intMy + STRCRLF;

    //----------------------------
    strMsg += "length()" + STRCRLF;

    strMy = "I Love Java" + STRCRLF;
    strMsg += "  * strMy = \"I Love Java\"" + STRCRLF;
    
    strMsg += "    strMy.length() = " + strMy.length() + STRCRLF;
    
    //----------------------------
    strMsg += "regionMatches()" + STRCRLF;

    strCmp1 = "I Love Java"; strCmp2 = "I Love JaVa";
    strMsg += "  * \"I Love Java\"; strCmp2 = \"I Love JaVa\"" + STRCRLF;
    
    strMsg += "    strCmp1.regionMatches( 2, strCmp2, 2, 4 ); Returns: " + strCmp1.regionMatches( 2, strCmp2, 2, 4 ) + STRCRLF;
    strMsg += "    strCmp1.regionMatches( 7, strCmp2, 7, 4 ); Returns: " + strCmp1.regionMatches( 7, strCmp2, 7, 4 ) + STRCRLF;
    strMsg += "    strCmp1.regionMatches( true, 7, strCmp2, 7, 4 ); Returns: " + strCmp1.regionMatches( true, 7, strCmp2, 7, 4 ) + STRCRLF;
    
    //----------------------------
    strMsg += "replace()" + STRCRLF;
    
    strMy  = "I Love Java";
    strMsg += "  * strMy  = \"I Love Java\";" + STRCRLF;
    
    strTest = strMy.replace(' ', ',');
    strMsg += "    strTest = strMy.replace(' ', ',') Results: " + strTest + STRCRLF;
    
    //----------------------------
    strMsg += "startsWith()" + STRCRLF;

    strMy  = "I Love Java";
    strMsg += "  * strMy  = \"I Love Java\";" + STRCRLF;
    
    blnMy = strMy.startsWith( "I Love" );
    strMsg += "    blnMy = strMy.startsWith( \"I Love\" ); Results: " + blnMy + STRCRLF;
    
    blnMy = strMy.startsWith( "Love" );
    strMsg += "    blnMy.startsWith( \"Love\" ); Results: " + blnMy + STRCRLF;
    
    blnMy = strMy.startsWith( "Love", 2);
    strMsg += "    blnMy.startsWith( \"Love\", 2); Results: " + blnMy + STRCRLF;

    //----------------------------
    strMsg += "substring()" + STRCRLF;
    
    strMy  = "I Love Java";
    strMsg += "  * strMy  = \"I Love Java\";" + STRCRLF;
    
    strTest = strMy.substring(7);
    strMsg += "    strMy.substring(7)" + strTest + STRCRLF;
    
    strTest = strMy.substring(2,6);
    strMsg += "    strMy.substring(2,6)" + strTest + STRCRLF;

    //----------------------------
    strMsg += "toUpperCase() & toLowerCase()" + STRCRLF;
    
    strMy  = "I Love Java";
    strMsg += "  * strMy  = \"I Love Java\";" + STRCRLF;
    
    strMsg += "    strMsg.toUpperCase(); Results: " + strMy.toUpperCase();
    strMsg += "    strMsg.toLowerCase(); Results: " + strMy.toLowerCase();

    //----------------------------
    strMsg += "trim()" + STRCRLF;

    strMy  = " I Love Java ";
    strMsg += "  * strMy  = \" I Love Java \";" + STRCRLF;
    
    strMsg += "    Value of strMy: " + "|" + strMy + "|" + STRCRLF;
    strMsg += "    strMy.trim(); Returns: " + "|" + strMy.trim() + "|" + STRCRLF;
    
    //----------------------------
    strMsg += "valueOf()" + STRCRLF;
    strMsg += "  * Converts Primitive Data Types to Strings." + STRCRLF;
    
    strMsg += "    strMy = String.valueOf( 10 ); Results: " + String.valueOf( 10 ) + STRCRLF;
    strMsg += "    strMy = String.valueOf( false ); Results: " + String.valueOf( false ) + STRCRLF;
    
    strMsg += "  * Using Objects" + STRCRLF;
    
    Integer objInteger = new Integer( 100 );
    strMsg += "    Integer objInteger = new Integer( 100 );" + STRCRLF;
   
    strMsg += "    Integer objInteger = new Integer( 100 ); Results: " + String.valueOf( objInteger ) + STRCRLF;
    strMsg += "    String.valueOf( this )" + String.valueOf( this ) + STRCRLF;
    
    //----------------------------
    strMsg += "intern()" + STRCRLF;

    strMy  = "I Love Java";
    strMsg += "  * strMy  = \"I Love Java\";" + STRCRLF;

    strMsg += "    strMy.intern(); Returns: " + strMy.intern() + STRCRLF;  //Don't know why I would use this!
    
    //----------------------------
    strMsg += "substring()" + STRCRLF;
    strMsg += "  * Start index begins with 0 " + STRCRLF;
    strMsg += "  * Stop index is 1 less than value " + STRCRLF;
    strMsg += "  * 1 Parm will Start at index and continue for length of String" + STRCRLF;
    
    strMy  = "I Love Java";
    strMsg += "  * strMy  = \"I Love Java\";" + STRCRLF;
    
    strMsg += "    strMy.substring(7); Returns: " + strMy.substring(7) + STRCRLF;
    strMsg += "    strMy.substring(0,1); Returns:" + strMy.substring(0,1) + STRCRLF;
    strMsg += "    strMy.substring(2,6); Returns: " + strMy.substring(2,6) + STRCRLF;
    
    //----------------------------
    strMsg += "String - actually an array of char." + STRCRLF;
    strMsg += "  * see code" + STRCRLF;
    
    char acharMy[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd',};
    strMy = new String( acharMy ); //Creates a String from a char array.
    
    strMsg += "  * char acharMy[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd',};" + STRCRLF;
    strMsg += "    strMy = new String( acharMy ); Results: " + strMy + STRCRLF;
    
    strMsg += STRCRLF;
    strMsg += "You may want to play with:" + STRCRLF;
    strMsg += "  * isDefined(), isDigit, isLetter()" + STRCRLF;
    
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
    final MyString applet = new MyString();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof