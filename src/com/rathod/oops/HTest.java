package com.rathod.oops;
public class HTest
{
	public void add(int a)
	{
		loop: for(int i=1;i<3;i++)        //loop,oop,p u can anythig here...
		{
			for(int j=1;j<3;j++)          //what is d meaning of 'loop' here vt for loop st?
			{
				if(a==5)
				{
					break loop;//labeled break st.apply only when loop is nested.
				}
                System.out.println(i*j);
			}
		}
	}
	
}
//for(){while(){if(){}}}-nested loop.

//for(){for(){}}-also nested loop.

/*public class HTest           //this 1 also compile...
{
	public void add(int a)
	{
		 for(int i=1;i<3;i++)      
		{
			for(int j=1;j<3;j++)
			{
				if(a==5)
				{
					break ;
				}
                System.out.println(i*j);
			}
		}
	}
	
}

public class HTest                    //this 1 also compile
{
	public void add(int a)
	{
		loop:  for(int i=1;i<3;i++)        //loop,oop,p u can anythig here...
		{
			for(int j=1;j<3;j++)
			{
				if(a==5)
				{
					break ;
				}
                System.out.println(i*j);
			}
		}
	}
	
}
*/