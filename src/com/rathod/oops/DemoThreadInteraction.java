package com.rathod.oops;
//  Thread InterAction.....
class  DemoThreadInteraction
{
	public void run()
	{
		while (true)
		{
			//Get shape(peace of code) from user
			//calculates machines steps from shape(peace of code  from user)
			//sends steps to Hardware.
		}
	}
	public void userLoop()
	{
		while (true)
		{
           //Get shape(peace of code) from user
			//calculates machines steps from shape(peace of code  from user)
           //Modify COMMON obj vt new Machine steps
		} 
	}
	public void hardwareLoop()
	{
		while (true)
		{
			//Get steps from Common obj.
			//sends  steps to hardware

		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
