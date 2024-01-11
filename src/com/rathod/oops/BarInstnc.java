package com.rathod.oops;
//Modify it for more study on "instanceof" oprator
interface Goo{}

interface Too{}

class Foo implements Goo 	
{}
class Boo  extends Bar implements Goo
{}
class Bar extends Foo implements Goo, Too
{
	public static void main(String[] args) 
	{
		Foo f = new Foo();
		Foo r = new Bar();
        Goo g = new Bar();
		Goo g1 = new Foo();
		Goo g2 = new Boo();
		Goo g3 =  new Boo();
		//r = g2;     //incompatibl type  (Flow is always supr to sub only..Bcz - never supr ref = sub ref)
		g3 = r;     //ok    (Flow is always supr to sub only..going sub ref = supr ref )


		System.out.println(r instanceof Foo);
		System.out.println(f instanceof Bar);
		System.out.println(f instanceof Foo);
		System.out.println(r instanceof Bar);
	
	    
		System.out.println(r instanceof Goo);
		System.out.println(g instanceof Goo);
		System.out.println(g1 instanceof Foo);
		System.out.println(g1 instanceof Bar);

        System.out.println(f instanceof Goo);
		System.out.println(r instanceof Goo);
		System.out.println(g1 instanceof Too);
		System.out.println(g1 instanceof Too);

        System.out.println(r instanceof Goo);
		System.out.println(g2 instanceof Boo);
		System.out.println(g3 instanceof Boo);
		System.out.println(f instanceof Boo);


	
	}
}
/*

G:\SCJP\Query\LOGIC>javac BarInstnc.java

G:\SCJP\Query\LOGIC>java BarInstnc
Exception in thread "main" java.lang.NoClassDefFoundError: BarInstnc

G:\SCJP\Query\LOGIC>java Bar
true
false
true
true
true
true
true
false
true
true
false
false
true
true
false
false

G:\SCJP\Query\LOGIC>
*/