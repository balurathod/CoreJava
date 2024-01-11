package com.rathod.oops;
class WraprNotWiden 
{
	public static void main(String[] args) 
	{
		WraprNotWiden wnw = new WraprNotWiden();
		wnw.test(new Integer(5));     //can't widen Int to Long
	}
	void test(Long x)
	{
		System.out.println("Wrapper classes r never Widening they r peers to 1 another.");
	}
}
