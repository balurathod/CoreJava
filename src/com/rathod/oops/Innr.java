package com.rathod.oops;
interface I1
{        //1
   public class Inner
   {         //2
   Inner()
	   {
	       System.out.println("Inner Created");
       }
   };
};
//compile fine. but exception error - no main().