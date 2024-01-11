package com.rathod.oops;
//ovrlodng wen combing Widening & Boxing
class WidenBox 
{
	static void go(Long x) //no prblm convrt byte into Long obj(is called Boxing)
	                       //,but befor this widening is must.
	{
      System.out.println("Long..!");
	}
	public static void main(String[] args) 
	{
		byte b = 5;
		go(b);       //illegal, why first widen den box/autoBoxing?

//here widening is fail....bcz For widening IS-A is imp,so(byte IS-A Long) not pocbl
//& befor widen boxing is not pocbl.  
	}
}
/*


what is diff bet type casting & Widening?

  Ans- The KEY pt for WIDENING is that ref widening depends on inheritance,
       in other words IS-A test.Bcz of this it's not legal to widen from 1 wrapper
	   class to anther,(Wrapper classes r peer to 1 another).




so on which basis primimtive r legal for Widening?




Remember....

--> Boxing-convrt primi data types into object.

-->     None of d wrapper  classes vl WIDEN from one to another!
     Bytes won't widen to Short,Short's wont widen to Longs. etc.


-->   When more than one convercn is reqird ,In this case compilr vl hav to 
    widen & den autobox d paramtr for a match to b made.


G:\SCJP\Query>
G:\SCJP\Query>javac WidenBox.java
WidenBox.java:10: go(java.lang.Long) in WidenBox cannot be applied to (byte)
                go(b);       //must widen den box--illegal
                ^
1 error

G:\SCJP\Query>


//ovrlodng wen Boxing & Widen

class BoxAndWiden 
{
	static void go(Object o) //here IS-A test succed bcz(Widening),Byte is sub class of Object class.	                 
	{                 //& Byte convrt into byte(AutoBoxing).
		 Byte b2 = (Byte)o;      //ok it's Byte's obj.

      System.out.println(b2);
	}
	public static void main(String[] args) 
	{
		byte b = 2;
		go(b);       //can this byte turn into Object ? s defntly
	}
}


CONCLUSION.....from above two examples..

    When more than one convercn is reqird ,In this case compilr vl hav to 
    widen & den autobox d paramtr for a match to b made.

i.e.-Bottom line...Before Boxing/AutoBoxing , to check Widening is possible or not(Is-A test).
i.e.-Without Widening,.... Boxing/AutoBoxing is nenver possible.





*/