/* File.......: MyPackTestA.java
   Author.....: Michael Thomas 02/03/99, ver 1.0 - 02/03/99

   Compile/Run: see MyPackage.java
*/
package com.rathod.oops;

//***********************************************************************
public class MyPackTestA
//***********************************************************************
{
  public    String strPublic    = "Public";
  protected String strProtected = "Protected";
            String strPackage   = "Package";
  private   String strPrivate   = "Private";

  //Test the access of Methods!

  public    void MyPackTestAPublic() {};
  protected void MyPackTestAProtected() {};
            void MyPackTestAPackage() {};
  private   void MyPackTestAPrivate() {};

}
