package com.rathod.oops;
interface I
{
//         int i;                     //invalid can't assign a val to final var i
//		   protected int i3=0;         //invalid
//		   private int i4=0;           //invalid


		   int i=0;                   //valid   by default it is FINAL
		   static  int i1=10;           //valid
	       public  int i2=100;           //valid
    	   public static  int i5=1000;    //valid
		   public static final int i6 =10000;  //valid 

}
class CI implements I
{
public static void main(String  a[]) 
	{
	   
		System.out.println(i);

		System.out.println(i1);

		System.out.println(i2);

		System.out.println(i5);

		System.out.println(i6);

//		System.out.println(i++);      //line 2 final var can't modify
	}
}


/*

Note:Interface constants r final so they must b initialized when declaring it.
         & they can't not b altered.

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>
D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac CI.java
CI.java:3: = expected
        int i;              //line 1
             ^
1 error

*/