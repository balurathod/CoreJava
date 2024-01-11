package com.rathod.oops;
class IntBool 
{
	public static void main(String[] args) 
	{
		int x=1;
		//if (x=0)    //not possible.bcoz  x is an int ,here only boolean val check.
	    	            //i.e. TRUE/FALSE 
	   System.out.println("val of x is=" + x);
		
	
		int x1=0;
		if(x1==0)   //if this IF st. is T then & & then, it is executed.
		            //otherwise it never executed it.	
		System.out.println("Here IF cond is F ,val of x1 is=" + x1);
	}
}
/*why o/p is not printed for x?
ANS-bcoz  x is an int ,here only boolean val check.(i.e.TRUE/FALSE) 
    



NOTE-FOR 2nd IF St...
if this IF st. is T then & & then, it is executed.otherwise it never executed it.	
     
*/