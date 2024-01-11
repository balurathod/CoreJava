package com.rathod.unsolved;
//shadowing variable.... new creation but ,,...
class Bar 
{
	int barNum = 28;
}
class Bar1
{
   int barNum1 =45;
}
class Foo2
{
	Bar myBar = new Bar();
    Bar1 myBar = new Bar1();
	
	void changeIt(Bar myBar)
	{
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
		
	    myBar =new Bar1();      //this is a obj whose scope is limited up to method.
		myBar.barNum1 = 420;   //loc var - barNum & loc para - myBar
		System.out.println("myBar.barNum  in changeIt is now " + myBar.barNum1);

	}
  	public static void main(String[] args) 
	{
		Foo1 f = new Foo1();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);


		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum & f.myBar.barNum after  changeIt is " + f.myBar.barNum + " " + f.myBar.barNum1);
	}
}
//why duplicat class err aries when it aries?