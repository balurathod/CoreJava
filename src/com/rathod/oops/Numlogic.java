package com.rathod.oops;
class  NumLogic
{
	public static void main(String[] args) 
	{
		int a = -8;
		int b = ~-33;
		a>>>=b;
				
		//a>>b;  a<<<b; a<<<=b;  a<<b; a>>>b;    Err-not a st.

		
		System.out.println(a);   
		System.out.println(b);  
	}
}
