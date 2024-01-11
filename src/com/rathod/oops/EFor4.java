package com.rathod.oops;
class EFor4 
{
	public static void main(String[] args) 
	{
		int [][] twoDim = {{1, 2, 3},{4, 5, 6},{7 , 8,9 }};
		for (int [] n : twoDim)
		{
			System.out.println("Hi.. World!" + n + " " + twoDim);
	}
}
}

//something going wrong here? val not printed...ref is printed.
//bcz arry is 2D,in FOR arry is 1D so it print ref,since 1D contn obj ref of 2D. 