package com.rathod.oops;
interface I2
{
	void f1();

    public void f2();

	//protected void f3();   //All method declared within an interface r implicitly PUBLIC.

	//private void f4();      //A weaker access(private & protected) level can not b declared.

	abstract void f5();
}