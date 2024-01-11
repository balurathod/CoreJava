package com.rathod.oops;

class MyStaticEx {
  
  public static final String STRHELLO = "Hello from a variable.";

  //Note: Normally you would make the following vars private and then use getters and setters.
  public static int intClassVar = 0;
  public static int intClassConstructVar = 0;
  
  public int intInstanceVar = 0;
  public int intInstanceConstructVar = 0;
  
  //---------------------------------------------------------------
  public MyStaticEx() {
  //---------------------------------------------------------------
    intClassConstructVar++;
    intInstanceConstructVar++;
  }
  
  //---------------------------------------------------------------
  static public String getHelloString () {
  //---------------------------------------------------------------
    return "Hello from MyStaticEx.getHelloString();";
  }
  
}