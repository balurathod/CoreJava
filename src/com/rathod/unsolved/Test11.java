package com.rathod.unsolved;
class Test11 
{
	z=5;
	public void stuff1(int x)
	{
		assert(x>0);
	   switch(x)
		{
		case 2: x=3;
		default:assert false;
		}
	    }
	  }
	private void stuff2(int y)
	{
		assert(y<0);
	}
	
	private void stuff3()
	{
		assert(stuff4());
	}
	
	private boolean stuff4()
	{
		z=6;
	 return false;
	 }
	
}
//C-the assert st on line 9 & 12 r used properly. 