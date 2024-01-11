package com.rathod.oops;
class ComparePrimitives 
{
	public static void main(String[] args) 
	{
		System.out.println("char 'a' == 'a' ? " + ('a' == 'a'));//chars
        System.out.println("char 'a' == 'a' ? " + ('a' == 'b')); //chars
		System.out.println("5 != 6? " + (5 != 6));               //nos
		System.out.println("5.0 == 5L? " + (5.0 == 5L));         //nos
		System.out.println("true == false? " + (true == false));  //boolean primits
  
	
	//Object ref variables also check/test/compare on d basis of bit pattern/val of var
	 //   eg-JButton a=new JButton("Exit");
	 //      JButton b=a; 
	}
}
/*

Equality OPERATOR....   "=="   &   "!="
         


NOTE:--U can't compare INCOMPATIBLE TYPES.
eg-boolean=char,Button=String array etc.


G:\SCJP\Scjp6\ch4-Oprtor>javac ComparePrimitives.java

G:\SCJP\Scjp6\ch4-Oprtor>java ComparePrimitives
char 'a' == 'a' ? true
char 'a' == 'a' ? false
5 != 6? true
5.0 == 5L? true
true == false? false

*/