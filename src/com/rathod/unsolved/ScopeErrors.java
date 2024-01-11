package com.rathod.unsolved;
class ScopeErrors 
{
	public static void main(String[] args) 
	{
		ScopeErrors se=new ScopeErrors();
		se.go();
		System.out.println("Hello World!");
	}
	void go()
	{
		int y = 5 ;  //loc var(some time called STACK,automic,tempryri,method) 
		             //of go()
		go2();
        y++;
	}
	void go2()          
	{
//       y++;              //won't compile bcz y is loc var of go().
	}
	void go3()
	{
		for (int z = 0; z < 5 ; z++ )
		{
			boolean test=false;
			if (z==3)
			{
				test =true;  //is it scope of "test" is upto FOR() only?  
				break;
			}
		}
		System.out.println(test);//'test' is an ex-var it has ceased(to put/stop/end) to be.
		//this is internet time so I hav no memory space of such var. 
	}
}
//Exam Note:-code block scoping errors-In switches,try-catch,for ,do & while loop 