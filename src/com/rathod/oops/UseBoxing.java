package com.rathod.oops;
class UseBoxing 
{
	public static void main(String[] args) 
	{
		UseBoxing ub = new UseBoxing();
		ub.go(5);
	}
	boolean go(Integer i)                  //boxes d int it was passed
	{  
	     Boolean ifSo = true;              //boxes d literal
		Short s = 300;                     //boxes d primitive.
		
		
		if (ifSo)                         //unboxing
		{
		   System.out.println(++s);       //unboxes,incrmnt,reboxes
	    }
	return !ifSo;                         //unboxes,return, why inverse ?
}
}
