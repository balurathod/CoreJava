package com.rathod.unsolved;
//Boxing & Var-args can make ovrloding little tricky.

class AutoBoxOvr 
{
	    static void go(Integer x)
		{
	        System.out.println(" Integer ");
	    }
		static void go(long x)
		{
	        System.out.println(" long ");
	    }
	public static void main(String[] args) 
	{
		
		int i = 5;
		go(i);           //which go vl  b invoked.
			
	}
}

/*

clear this concept regad vt all primi?

o/p-->long

Bcoz...
The compiler think that widening a primitive paramtr is more desirable than
perfoming an autoboxing oprcn.?

The ans is that cmplr vl choose widening over boxing,so o/p vl b LONG.
*/