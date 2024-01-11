package com.rathod.unsolved;
//Overldng vt VarArgs.... 
class  Vararg
{
	static void wide_vararg(long...  x)
	{
		System.out.println("long....");
	}

  public static void box_vararg(Integer...  x)
	{
		System.out.println("Integer...");
	}

	public static void main(String[] args) 
	{
		int i = 6;
		wide_vararg(i,i);      //needs to widen & use var-args
		box_vararg(i,i);       //needs to box & use var-args.		
	}
}//u can successfully combine var-args with either widening or boxing.


/*






*/