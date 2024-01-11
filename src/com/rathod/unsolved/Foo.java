package com.rathod.unsolved;
public class Foo implements java.io.Serializable 
{
	private int x;
	public int getX(){return x;}
	public Foo(int x){this.x=x;}
	private void writeObjects(ObjectOutputStream s)throws IOException
	{
	  //code here
	 // s.writeInt(x);
	  //s.serilize(x);
	 // s.writeObject(x);
	  s.defaultWriteObject(x);
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	}
}
/*o/p-->d   why....

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Foo.java
Foo.java:6: cannot find symbol
symbol  : class ObjectOutputStream
location: class Foo
        private void writeObjects(ObjectOutputStream s)throws IOException
                                  ^
Foo.java:6: cannot find symbol
symbol  : class IOException
location: class Foo
        private void writeObjects(ObjectOutputStream s)throws IOException
                                                              ^
2 errors

*/