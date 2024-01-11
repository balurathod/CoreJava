package com.rathod.oops;
/* File.......: MySrcFile.java
   Author.....: Michael Thomas 01/24/99, ver 1.0 - 01/24/99

   Compile....: javac MySrcFile -d images  
   Note.......: 1. "-d images" puts the class file in a subdirectory images.
                2. Create a subdirectory called "images" before compiling.

   Run Browser: MySrcFile.html
   Run JDK....: appletviewer MySrcFile.html 
*/

//package - keyword not needed.

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;   //needed for: paint(Graphics g)
import java.awt.Color;

//***********************************************************************
public class MySrcFile extends Applet
//***********************************************************************
{ final  int YSKIP        = 15;               //Y pixel skip increment. (Row Width)
  final  int XCOL1        = 25;               //Column 1, Screen positioning
  final  int XCOL2        = 400;              //Column 2, Screen positioning
  final  int XPOS1        = 0;                //X Axis - position 1
  final  int XPOS2        = XPOS1+YSKIP;      //X Axis - position 2

         int intLineNum   = 0;   //Line # to display on screen.
         int XCol         = 0;
         int YPos         = 0;   //Row pointer (Y axis)

  static int intStatic    = 1;

  static {   //class static initializer block. Belongs to class!
    intStatic++;  //Increments value by 1
  } //static initializer

//-----------------------------------------------------------------------
  public void init()
  { setBackground( Color.white );
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g)
  {
    YPos       = YSKIP;
    intLineNum = 1;  //Must initialize here, because paint() frequently.
    XCol       = XCOL1;

    Show(g,"Start: MySrcFile",XPOS1);
    Show(g,"Ex: Static (intiliazer, variables, methods)",XPOS1);
    Show(g,"intStatic initialized as 1, then incremented by 1 = " +
            intStatic, XPOS2);
    Show(g,"MySuperClass.MySuperStatic() = " +
                                         MySuperClass.MySuperStatic(), XPOS2);
    Show(g,"MyInterface.strAuthor = " + MyInterface.strAuthor,   XPOS2);
    
    MyChildren.intTotalChildren = 0;  //Needed because of applet refreshing.
    MySuperClass.intSuper = 0;        //Needed because of applet refreshing.


    Show(g,"Ex: Inheritance (superclass, subclass)",XPOS1);
    MySuperClass msuper = new MySuperClass( 1000000 );
    Show(g,"instantiated MySuperClass as msuper",XPOS2);


    MySubClass msub1 = new MySubClass();
    Show(g,"instantiated MySubClass as msub1",XPOS2);

    MySubClass msub2 = new MySubClass( 200 );
    Show(g,"instantiated MySubClass( 200 ) as msub2",XPOS2);

    Show(g,"direct.: msuper.MySuperMethod() = " + msuper.MySuperMethod(),XPOS2);
    Show(g,"inherit: msub1.MySuperMethod() = " + msub1.MySuperMethod(),XPOS2);

    Show(g,"Ex: Variable values (Inheritance & constructors)",XPOS1);
    Show(g,"msuper.intSuper = "    + msuper.intSuper,   XPOS2);
    Show(g,"msuper.intSuperObj = " + msuper.intSuperObj,XPOS2);
    Show(g,"msub1.intSuper = "     + msub1.intSuper,    XPOS2);
    Show(g,"msub1.intSuperObj = "  + msub1.intSuperObj, XPOS2);
    Show(g,"msub1.intSubClass = "  + msub1.intSubClass, XPOS2);
    Show(g,"msub2.intSuper = "     + msub2.intSuper,    XPOS2);
    Show(g,"msub2.intSuperObj = "  + msub2.intSuperObj, XPOS2);
    Show(g,"msub2.intSubClass = "  + msub2.intSubClass, XPOS2);

    //compile error: No variable strAuthor defined in class MySubClass.
    //Show(g,"msub2.strAuthor = "+ msub2.strAuthor,XPOS2);
    
    XCol = XCOL2; YPos = YSKIP;

    Show(g,"In source code, study the definition of class MyChild: ",XPOS1);
    Show(g,"Review: abstract class, extend, implements, & interface",XPOS1);

    Show(g,"Ex:  abstract class' (static methods & variables)",XPOS1);
    Show(g,"MyChildren.Hello_Class() = " + MyChildren.Hello_Class(),XPOS2);
    Show(g,"MyChildren.intTotalChildren = " + MyChildren.intTotalChildren,XPOS2);

    //MyChildren mch = new MyChildren(); //compile error: Cannot be instantiated

    Show(g,"Ex: controlling design w/interfaces & abstracts'",XPOS1);
    MyChild mc1 = new MyChild();
    Show(g,"instantiated MyChild as mc1",XPOS2);
    Show(g,"Child/Parent = " + mc1.getChildName() + "/" +
                               mc1.getParentName(), XPOS2);
    mc1.setParentName("Parent Thomas");
    mc1.setChildName("Child1 Thomas");
    Show(g,"New Child/Parent = " + mc1.getChildName() + "/" +
                                   mc1.getParentName(), XPOS2);

    MyChild mc2 = new MyChild("Child2 Thomas","Parent Thomas");
    Show(g,"instantiated MyChild as mc2",XPOS2);
    Show(g,"Child/Parent = " + mc2.getChildName() + "/" +
                               mc2.getParentName(), XPOS2);

    Show(g,"Ex: inherited super Members (Methods & Variables)",XPOS1);
    Show(g,"mc1.Hello_MyChildren() = " + mc1.Hello_MyChildren(), XPOS2);
    Show(g,"mc1.strMyChildren = " + mc1.strMyChildren, XPOS2);

    Show(g,"Ex: Overriding",XPOS1);
    Show(g,"no override: mc1.Hello_MyChildren() = " +
                         mc1.Hello_MyChildren(), XPOS2);
    Show(g,"override: mc1.Hello_Object() = " + mc1.Hello_Object(), XPOS2);

    Show(g,"Ex: Overloading",XPOS1);
    Show(g,"mc1.Hello_Object() = " + mc1.Hello_Object(), XPOS2);
    Show(g,"mc1.Hello_Object(\"Str\") = " +
                                     mc1.Hello_Object("Str"), XPOS2);
    Show(g,"Ex: Static's belong to the class. Exist once!",XPOS1);                                     
    Show(g,"MyChildren.intTotalChildren = " + MyChildren.intTotalChildren,XPOS2);

  } //paint()

//-----------------------------------------------------------------------
  private void Show( Graphics g, String strMsg, int XPos )
  { g.drawString( Integer.toString(intLineNum), XCol,         YPos);
    g.drawString( strMsg,                       XCol+25+XPos, YPos);
    YPos += YSKIP;
    this.intLineNum++;
  }

} //class MySrcFile

//***********************************************************************
class MySuperClass
//***********************************************************************
{ static int intSuper    = 0;  //class    variable
         int intSuperObj = 0;  //instance variable

  MySuperClass()
  { intSuper++; intSuperObj++; } //constructor

  MySuperClass( int intSuperObj)
  { intSuper++; this.intSuperObj = intSuperObj; } //constructor

  static String MySuperStatic() { return "in MySuperStatic()"; }
  String MySuperMethod() { return "in MySuperMethod()"; }

}//class MySuper
//***********************************************************************
class MySubClass extends MySuperClass
//***********************************************************************
{ int intSubClass = 0; //instance variable

  /*1. Notice: if no constructors were defined, Java creates a "no arg" one!
    2. However, if a constructor is defined, then it will not automatically
         create one.
    3. Because we call 2 types of constructors, both must be defined!
  */
  MySubClass(){} //Had to add this constructor!
  MySubClass( int intSubClass ){ this.intSubClass = intSubClass; }

}//class MySubClass
//***********************************************************************
abstract class MyChildren
//***********************************************************************
{ static int intTotalChildren = 0;
         String strMyChildren = "String in MyChildren";

  MyChildren() { intTotalChildren++; }//constructor

  abstract void setParentName( String pn);
  abstract String getParentName();

  static String Hello_Class() { return "Hello_Class"; }
  String Hello_Object()       { return "Hello_Object"; }
  String Hello_MyChildren()   { return "Hello_MyChildren"; }

}//class MyChildren()
//***********************************************************************
class MyChild extends MyChildren implements MyInterface
//***********************************************************************
{ int intChild = 0;
  String strPName;
  String strCName;

  MyChild()  //this() be first, otherwise compile error.
  { this("No Child Name","No Parent Name"); }//constructor

  MyChild(String strCName, String strPName)
  { setChildName(strCName); setParentName(strPName);
    intChild++;
  } //constructor

  //Needed because of "extends MyChildren". Methods could have been package.
  public void   setParentName( String strPName){ this.strPName = strPName; }
  public String getParentName(){ return strPName; }

  //Needed because of "implements MyInterface". Methods must be public!
  public void   setChildName(String strCName){ this.strCName = strCName; }
  public String getChildName(){ return strCName; }

  String Hello_Object() { return "Hello Object-MyChild."; }
  String Hello_Object(String strMsg) { return "Hello Object-"+strMsg; }

}//class MyChild
//***********************************************************************
interface MyInterface
//***********************************************************************
{ public String strAuthor = "Michael Thomas";  //implied final & static
  public void   setChildName(String cn);       //implied abstract
  public String getChildName();                //implied abstract
}
