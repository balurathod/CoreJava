package com.rathod.unsolved;
class Test34 
{
	public static void main(String[] args) 
	{
		int i=(int)16.2d;
        byte b=(byte)(long)16.2;
        byte b=(int)16.2;
 System.out.println(i);
  System.out.println(b);

		
		/*char c=110;         //what is meaning of this st?
		double d=10;
	    if (c==d)             //what is the meaning of if()   loop?  
		                           //check 110 is equal to 10 r not
		                           //without loop also same o/p is came.
		   System.out.println("Equal!");
		else
		   System.out.println(" Not Equal");
	*/}
}

//o/p->Not equal


/*if(c=d) error generate

D:\SCJP\Oldscjp(1-5)\Exam2>javac Test34.java
Test34.java:7: possible loss of precision
found   : double
required: char
            if (c=d)             
                  ^
Test34.java:7: incompatible types
found   : char
required: boolean
            if (c=d)            
                 ^
2 errors

*/






/*class Test34 
{
	public static void main(String[] args) 
	{
		char c=65;
		double d=10;
        if (c==d)
		
			System.out.println("Equal!");
		else
		System.out.println(" Not Equal");
	}
}

 //o/p->Not equal




valid assignment...

  1-int i=(int)16.2d;
  2-byte b=(byte)(long)16.2;
  3-byte b=(int)16.2;
*/