package com.rathod.unsolved;
//vvvv imp topic pass-by-value..(scjp-215)
class Foo
{}
class Bar1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	void bar()
	{
		Foo f = new Foo();  //one obj created for Foo,by loc var f, no problm
		doStuff(f);         
	}
	void doStuff(Foo g)    //next obj created for Foo ref by local(arg) var g
	                       //bcz doStuff() has a copy of d ref var,it has a way to
	                       //get to the original Foo obj to call a setName().  
	{                         
		g.setName("Boo");  //so doStuff() can change val within the obj f refer
		                   //to,but doStuff()can't change d actual contents(bit pattern)of f. 
		g = new Foo(); 
	}
}
/*
what is rel bet f & g? how many objs & refs r created in dis prog?   
Ans-

so doStuff() can change val within the obj f refers to,but doStuff()can't 
change d actual contents(bit pattern)of f.

i.e.-  doStuff() can change the state of obj that  f refers to,
       but doStuff()can't make f refer to a different obj.

*/