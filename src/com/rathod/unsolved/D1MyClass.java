package com.rathod.unsolved;
class D1MyClass 
{
	public static void main(String[] args) 
	{
		Long l=new Long(23);
		Float f=new Float(84);
		Short s=new Short((short)5);          //not converted why?
		//String s=new String("u");       //only numeric conversion r possible...
		Double d=new Double(567);
		Integer i=new Integer(456);             
		Double dbl=l.doubleValue();               
		System.out.println(dbl);
	}
}
