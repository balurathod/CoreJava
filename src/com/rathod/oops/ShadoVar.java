package com.rathod.oops;
//shadowing variable.... 
class Bar 
{
	int barNum = 28;
}
class ShadoVar
{
    Bar myBar = new Bar();  //NOTE:anywhere u can cret obj within a class.
	
	void changeIt(Bar myBar)
	{
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt() is " + myBar.barNum);
		
		//myBar =new Bar();      //this is a obj whose scope is limited up to method.
		myBar.barNum = 420;   //loc var - barNum & loc para - myBar
		System.out.println("myBar.barNum in changeIt() is now " + myBar.barNum);

	}
  	public static void main(String[] args) 
	{
		ShadoVar f = new ShadoVar();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);


		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum after  changeIt() is " + f.myBar.barNum);
	}
}
