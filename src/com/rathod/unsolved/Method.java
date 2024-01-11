package com.rathod.unsolved;
class A
{
	static String m(float i)    {return "Float";}
    
//	static String m(int i)    {return "int";}

	static String  m(double i )  {return "Double";}

//	static long  m(long i)  { return "Five";}//Err-incomptbl type

/*	static long  m(long i)  { return 100000;}
  
    static int  m(int i)  { return 500;}

    static short  m(short i)  { return 150;}

    static byte  m(byte i)  { return 5;}
*/
    static long  m(byte i)  { return 100000;}   //o/p-> wen passng byte type
  
    static int  m(short i)  { return 500;}      //o/p-> wen passng short type

    static short  m(long i)  { return 150;}     //o/p-> wen passng long type

    static byte  m(int i)  { return 5;}         //o/p-> wen passng int type



	public static void main(String[] args) 
	{
	//	int a1=1;     //o/p->500 , 500      Note - it srach eidr int or long only ,print it.
	//	int b1=2;

//		byte a1=1;   //o/p->5 , 5  Note - wen u pass BYTE den it 1st serch BYTE if not avi den SHORT if not den INT if not den LoNG ,prnt it.  
//		byte b1=2;

        short a1=1;   //o/p-> 150 , 150   Note - it not search BYTE it start from Shot to LOng
    	short b1=2;

		System.out.println(m(a1)+" , "+m(b1));
	}
}
/*

Note:- Passing paramt val type & assingd  arg type r  related vt each other in mtd def,
       bt that both r not relatd vt return type of metd.

Note:-other than  STRING data type of method m() gives an incompatibility types.




D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac A.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java A
Float , Float

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac A.java
A.java:5: incompatible types
found   : java.lang.String
required: byte
        static byte m(double i )  {return "Double";}
                                          ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>

When byte is added to a char.result is an int.
   Bcoz...The result of all Arithmetic performed with the binary operators
   (not assignment operators) is an int ,a long, a float, a double.
   Here byte & char promoted to int,so result is an int.


*/