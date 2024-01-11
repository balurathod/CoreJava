package com.rathod.oops;
class D1MyClass 
{
	public static void main(String[] args) 
	{
		Long l=new Long(23);
		Float f=new Float(84);
		
		Short s=new Short();          //not converted why?explicit castng is required
		String s=new String("u");       //only numeric conversion r possible...
		
		Double d=new Double(567);
		Integer i=new Integer(456);             
		
		Double dbl=l.doubleValue();               
		
		System.out.println(dbl);
		System.out.println(l);
		System.out.println(f);
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
	}
}
/*
G:\SCJP\Query>javac D1MyClass.java

G:\SCJP\Query>java D1MyClass
23.0
23
84.0
u
567.0
456

G:\SCJP\Query>
*/