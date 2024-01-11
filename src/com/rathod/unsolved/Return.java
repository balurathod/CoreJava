package com.rathod.unsolved;
//import java.awt.Button; for use of "Button" class it must b import.
class Return                 //user define class.
{
    public Button doStuff()  //meaning? is it pocble vt user define class also?
	{//doStuff()- must b in "Button" class ,bt it is user define metd.
		return null;
	}
	public static void main(String[] args) 
	{
		Button b=new Return();  //very firstly IS-A test check here(in bet Button & Return).
		b.doStuff();            //ref of Button class 'b' call only factory metds.
		System.out.println(""); //obj of String class is created & print(if pocble) 
	}
}
/*
Conclusion....

G:\SCJP\Query>javac Return.java
Return.java:4: cannot find symbol
symbol  : class Button
location: class Return
    public Button doStuff()  
           ^
Return.java:10: cannot find symbol
symbol  : class Button
location: class Return
                Button b=new Return();
                ^
2 errors






Aftr importing  "import java.awt.Button;"

G:\SCJP\Query>javac Return.java
Return.java:11: incompatible types
found   : Return
required: java.awt.Button
                Button b=new Return();
                         ^
Return.java:12: cannot find symbol
symbol  : method doStuff()
location: class java.awt.Button
                b.doStuff();
                 ^
2 errors


*/