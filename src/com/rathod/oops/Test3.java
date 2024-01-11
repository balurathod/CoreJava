package com.rathod.oops;
//28
public class Test2 
{
	int x=12;
	public void method(int x)
	{
		x += x;
		System.out.println(x);
	}
}
/*
given Test2 t=new Test2();
t.method(5);   wat is o/p?


Ans-B ->10





//29
int[]x={1,2,3,4,5}
int y[]=x;
System.out.println(y[2]);
wat is o/p?

Ans--B->print the val=3



//30
String #name="Balu";  ....not compile
int $age=23;         ....compile
Double _height=123.5; ....compile
Double ~temp=37.5;    ....not compile



//31
A-static final int[]a={100,200};

B-static final int[]a;
static {a=new int[2];a[0]=100 ,a[1]=200;}   

C-static final int[]a=new int[2]{100,200};

D-B-static final int[]a;
static void init {a=new int[3];a[0]=100 ,a[1]=200;}

Ans-A & B r legal




*/