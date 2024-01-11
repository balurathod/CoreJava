package com.rathod.unsolved;
class C9 
{
	public static void main(String a[] ) 
	{
		C9 c1=new C9();
        C9 c2=m1(c1);
		C9 c3=new C9();
		c2=c3;                //6 line no.
		//another method();
		
	}
	static C9 m1(C9 obj)
	{
		obj=new C9();
		return obj;
	}
}
//after line 6 how many objs r eligible for garbage colletion?
//Ans-2

 //How & which?????