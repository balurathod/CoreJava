package com.rathod.oops;
/*
 * MyArrays.java
 *
 * Created on 09/17/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyArrays extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
  
    strMsg += "Arrays" + STRCRLF;
    strMsg += "  * Arrays are objects" + STRCRLF;
    strMsg += "    Arrays must hold the same data type!" + STRCRLF;
    strMsg += STRCRLF;
    
    strMsg += "Declaring & Instantiating Arrays - Single Dimension" + STRCRLF;
    strMsg += Ex_DeclareInitialize();
    strMsg += STRCRLF;
    
    strMsg += "Accessing rows in Arrays - Single Dimension" + STRCRLF;
    strMsg += Ex_Accessing(); 
    strMsg += STRCRLF;
    
    strMsg += "Arrays of Objects" + STRCRLF;
    strMsg += Ex_Objects();
    strMsg += STRCRLF;
    
    strMsg += "Two-Dimensional Arrays" + STRCRLF;
    strMsg += Ex_MultiDimensional();
    strMsg += STRCRLF;
    
    return strMsg;
  }    
  
//-----------------------------------------------------------------------
  private String Ex_DeclareInitialize()  {
//-----------------------------------------------------------------------
    String strMsg = "";

    
    strMsg += "  * Example of one line: 'declare', 'initialze', and assigning values" + STRCRLF;

    int [] aintTestA = {1,2,3}; //Ok because used {} when declaring/initializing!
    int aintTestB [] = {1,2,3}; //Same as above, [] after name!
    int aintTestC [] = new int []  {1,2,3};  //Another way of doing the same thing.

    strMsg += "    int [] aintTestA = {1,2,3};" + STRCRLF;
    strMsg += "    int aintTestB [] = {1,2,3};" + STRCRLF;
    strMsg += "    int aintTestC [] = new int []  {1,2,3};" + STRCRLF;
    
    //---------------------------------
    strMsg += "  * Example of separate: 'declare', 'initialze', assigning values." + STRCRLF;
    strMsg += "    (see code)" + STRCRLF;
    
    strMsg += "    String [] astrMy1; - Most popular." + STRCRLF;
    String [] astrMy1;  //Declare - Most popular
    astrMy1 = new String [2]; //Initialize array with 2 rows.
    
    strMsg += "    String astrMy2 []; - Not as popular." + STRCRLF;
    String astrMy2 [];  //Declare - Also valid, but not as clear.
    astrMy2 = new String [2]; //Initialize array with 2 rows.
    
    astrMy1[0] = "Hello"; astrMy1[1] = "World";  //Load array with Strings
    astrMy2[0] = "Hello"; astrMy2[1] = "World";  //Load array with Strings
  
    //---------------------------------
    strMsg += "  * Array length" + STRCRLF;
    strMsg += "    Length = " + astrMy1.length + STRCRLF;
    
    //---------------------------------
    strMsg += "  * More Examples of one statement: 'declare', 'initialze', and assigns values" + STRCRLF;
    strMsg += "    Arrays must hold the same data type!" + STRCRLF;
    int [] aintMy  = {1,2,3,4,5};
    double [] adblMy = {1.0, 2.0, 3.0, 4.0, 5.0};
    String [] astrMy = { "String1", "String2", "String3" };
    
    //int [] aintMyError = {1,1.0}; //Compile error:  possible loss of precision

    //---------------------------------
    strMsg += "  * Values used to Initalize arrays." + STRCRLF;

    strMsg += "    Constants" + STRCRLF;
    int [] aintConstant = new int [ 5 ];
    
    strMsg += "    Variables" + STRCRLF;
    int intSize = 5;
    int [] aintVariable = new int [ intSize ];
    
    strMsg += "    Expressions" + STRCRLF;
    int [] aintExpression = new int [ intSize + 1 ];
    
    //---------------------------------
    strMsg += "  * Defalut values when initialized." + STRCRLF;
    
    int [] aintDefaultValues = new int [5];
    strMsg += "    Example of int (0): ";
    for ( int x=0; x < aintDefaultValues.length; x++ ) {
      strMsg += "," + aintDefaultValues[x];
    }
    strMsg += STRCRLF;
    
    double [] adblDefaultValues = new double [5];
    strMsg += "    Example of double (0.0): ";
    for ( int x=0; x < adblDefaultValues.length; x++ ) {
      strMsg += "," + adblDefaultValues[x];
    }
    strMsg += STRCRLF;

    String [] astrDefaultValues = new String [5];
    strMsg += "    Example of Strings (null): ";
    for ( int x=0; x < astrDefaultValues.length; x++ ) {
      strMsg += "," + astrDefaultValues[x];
    }
    strMsg += STRCRLF;

    Integer [] aobjdoubleDefaultValues = new Integer [5];
    strMsg += "    Example of Integer (null): ";
    for ( int x=0; x < aobjdoubleDefaultValues.length; x++ ) {
      strMsg += "," + aobjdoubleDefaultValues[x];
    }
    strMsg += STRCRLF;

    
    return strMsg;
  }

//-----------------------------------------------------------------------
  private String Ex_Accessing()  {
//-----------------------------------------------------------------------
    String strMsg = "";
   
    //----------------------------------------------
    strMsg += "    Simple loading of int: ";
    int [] aintMy = new int [5];
    for ( int x=0; x < aintMy.length; x++ ) {
      aintMy[x] = x;
    }
    
    for ( int x=0; x < aintMy.length; x++ ) {
      strMsg += "," + aintMy[x];
    }
    strMsg += STRCRLF;

    //----------------------------------------------
    strMsg += "    Simple loading of String: ";
    String [] astrMy = new String [3];
    for ( int x=0; x < astrMy.length; x++ ) {
      astrMy[x] = "String #" + x;
    }
    
    for ( int x=0; x < astrMy.length; x++ ) {
      strMsg += "," + astrMy[x];
    }
    strMsg += STRCRLF;

    //----------------------------------------------
    strMsg += "    Simple loading of Integer: ";
    Integer [] aobjintMy = new Integer [5];
    for ( int x=0; x < aobjintMy.length; x++ ) {
      aobjintMy[x] = new Integer(x);
    }
    
    for ( int x=0; x < aobjintMy.length; x++ ) {
      strMsg += "," + aobjintMy[x].toString();
    }
    strMsg += STRCRLF;

    //----------------------------------------------
    strMsg += "    Simple loading of String of Month Names: ";
    String [] astrMonth = new String [12];
    
    astrMonth[0] = "January";
    astrMonth[1] = "February";
    astrMonth[2] = "March";
    astrMonth[3] = "April";
    astrMonth[4] = "May";
    astrMonth[5] = "June";
    astrMonth[6] = "July";
    astrMonth[7] = "August";
    astrMonth[8] = "September";
    astrMonth[9] = "October";
    astrMonth[10] = "November";
    astrMonth[11] = "December";
    
    for ( int x=0; x < astrMonth.length; x++ ) {
      strMsg += "," + astrMonth[x];
    }
    strMsg += STRCRLF;

    
    //----------------------------------------------
    
    return strMsg;
    
  }

//-----------------------------------------------------------------------
  private String Ex_Objects()  {
//-----------------------------------------------------------------------
    String strMsg = "";

    Student [] aobjStudent = new Student [4];
    
    aobjStudent[0] = new Student( "Thomas, Michael", 100.0 );
    aobjStudent[1] = new Student( "Doe, John", 95.5 );
    aobjStudent[2] = new Student( "Doe, Jane", 90.0 );
    
    strMsg += Ex_DisplayValues( aobjStudent );
    

    strMsg += "  * Using setters (mutators) and getters (accessors)" + STRCRLF;
    strMsg += "    Setters/Getters works with Java Beans." + STRCRLF;
    strMsg += "    Rules: " + STRCRLF;
    strMsg += "      1) Create a variable: ex: strMyVar" + STRCRLF;
    strMsg += "      2) Create a getter method: get + the variable name w/first letter uppercase" + STRCRLF;
    strMsg += "         public String getStrMyVar() { return this.strMyVar };" + STRCRLF;
    strMsg += "      3) Create a setter method:  set + the variable name w/first letter uppercase" + STRCRLF;
    strMsg += "         public void setStrMyVar( String strMyVar ) { this.strMyVar = strMyVar; }" + STRCRLF;
    aobjStudent[0].setStrName( "Bush, George" );
    aobjStudent[0].setDblGrade( 99.0 );
    
    strMsg += Ex_DisplayValues( aobjStudent );
    
    strMsg += "  * Passing Arrays to Methods" + STRCRLF;
    strMsg += Ex_ChangeValueByReference( aobjStudent );
    strMsg += Ex_DisplayValues( aobjStudent );
    
    return strMsg;
  }

//-----------------------------------------------------------------------
  private String Ex_ChangeValueByReference(Student [] aobjStudent)  {
//-----------------------------------------------------------------------
    String strMsg = "";

    strMsg += "  * Changing values by reference." + STRCRLF;
    
    aobjStudent[0].setStrName( "Jordon, Michael" );
    aobjStudent[0].setDblGrade( 105.0 );
    
    return( strMsg );
  }
//-----------------------------------------------------------------------
  private String Ex_DisplayValues(Student [] aobjStudent)  {
//-----------------------------------------------------------------------
    String strMsg = "";

    strMsg += "  * Example of a Student object (see code)" + STRCRLF;
    for ( int x=0; x < aobjStudent.length; x++ ) {
      if( aobjStudent[x] != null ) {
        strMsg += "    Name = " + aobjStudent[x].getStrName() + ", Grade = " + aobjStudent[x].getDblGrade() + STRCRLF;
      } else {
        strMsg += "    No student record" + STRCRLF; 
      }
    }
    
    return strMsg;
  }  
//-----------------------------------------------------------------------
  private String Ex_MultiDimensional() {
//-----------------------------------------------------------------------
    String strMsg = "";

    String strMy = "";
    
    strMsg += "  * 2-Dimensional: First Style " + STRCRLF;
    int [] [] aintMy1 = { {10, 11 },
                          {20, 21 }, 
                          {30, 31 } };
    
    strMsg += Ex_DisplayMultiInt( aintMy1 );

    strMsg += "  * 2-Dimensional: Second Style" + STRCRLF;
    
    int [] [] aintMy2 = new int [2] [2];
    aintMy2 [0] [0] = 10;
    aintMy2 [0] [1] = 11;
    aintMy2 [1] [0] = 20;
    aintMy2 [1] [1] = 21;
    
    strMsg += Ex_DisplayMultiInt( aintMy2 );

    strMsg += "  * 2-Dimensional: Third Style." + STRCRLF;

    int [] [] aintMy3 = new int [2] [];
    
    //aintMy3 [0] = {10, 11}; //Compile Error: illegal start of expression or Array constants can only be used in initializers
    aintMy3 [0] = new int [2]; 
    aintMy3 [0] [0] = 10;
    aintMy3 [0] [1] = 11;
    
    //aintMy3 [1] [0] = 20; //Runtime error: java.lang.NullPointerException
    aintMy3 [1] = new int [2]; 
    aintMy3 [1] [0] = 20;
    aintMy3 [1] [1] = 21;
    
    strMsg += Ex_DisplayMultiInt( aintMy3 );
    
    strMsg += "  * 2-Dimensional: Forth Style. (2nd Dimension is variable in length)" + STRCRLF;

    int [] [] aintMy4 = new int [2] [];
    
    aintMy4 [0] = new int [2]; 
    aintMy4 [0] [0] = 10;
    aintMy4 [0] [1] = 11;
    
    aintMy4 [1] = new int [4]; 
    aintMy4 [1] [0] = 20;
    aintMy4 [1] [1] = 21;
    aintMy4 [1] [2] = 22;
    aintMy4 [1] [3] = 23;
    

    
    strMsg += Ex_DisplayMultiInt( aintMy4 );

    strMsg += " 3 Dimensional (see code)" + STRCRLF;
    
    strMsg += "  * String [] [] [] astrMy1 = new String [2] [2] [2];" + STRCRLF;
    String [] [] [] astrMy1 = new String [2] [2] [2];

    astrMy1[0][0][0] = "Michael";
    astrMy1[0][0][1] = "Thomas"; 
    
    astrMy1[0][1][0] = "Charmaine";
    astrMy1[0][1][1] = "Thomas"; 
    
    astrMy1[1][0][0] = "Stephen";
    astrMy1[1][0][1] = "Thomas"; 

    astrMy1[1][1][0] = "Adam";
    astrMy1[1][1][1] = "Thomas"; 

    
    strMsg += "    " + astrMy1[0][0][0] + ", " + astrMy1[0][0][1] + STRCRLF;
    strMsg += "    " + astrMy1[0][1][0] + ", " + astrMy1[0][1][1] + STRCRLF;
    strMsg += "    " + astrMy1[1][0][0] + ", " + astrMy1[1][0][1] + STRCRLF;    
    strMsg += "    " + astrMy1[1][1][0] + ", " + astrMy1[1][1][1] + STRCRLF;    
    
   
    return strMsg;
  }
  
//-----------------------------------------------------------------------
  private String Ex_DisplayMultiInt( int [] [] aintMy)  {
//-----------------------------------------------------------------------
    String strMsg = "";
    
    for ( int x=0; x < aintMy.length; x++ ) {
      strMsg += "    ";
      for ( int y=0; y < aintMy[x].length; y++ ) {
        strMsg += "," + aintMy[x][y]; 
      }
      strMsg += STRCRLF;
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

    java.awt.Frame objFrame = new java.awt.Frame( "MyArrays.java" );  
    final MyArrays applet = new MyArrays();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

  //####################################################################
  private class Student {  // inner class!
  //####################################################################
    
    private String strName = "";
    private double dblGrade = 0;
    
    private Student( String strName, double dblGrade ) {
      this.strName = strName;
      this.dblGrade = dblGrade;
    }
    
    //-----------------------------------------
    private String getStrName () {
    //-----------------------------------------
      return this.strName;
    }
    //-----------------------------------------
    private void setStrName (String strName) {
    //-----------------------------------------
      this.strName = strName;
    }

    //-----------------------------------------
    public double getDblGrade () {
    //-----------------------------------------
      return this.dblGrade;
    }
    //-----------------------------------------
    public void setDblGrade (double dblGrade) {
    //-----------------------------------------
      this.dblGrade = dblGrade;
    }
  
  }
  
} //eoc
//eof