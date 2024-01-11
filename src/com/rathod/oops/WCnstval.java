package com.rathod.oops;
class  WCnstval
{
	public static void main(String[] args) 
	{
		//Wrapper Constor...

		Integer i = new Integer(42);
		Integer i1 = new Integer("42");

		Float f = new Float(3.14f);
		Float f1 = new Float("3.14f");
		
		Character c = new Character('c');
		
		Boolean b = new Boolean("false");
		// if(b)   won't compile using java4 or earlier.
		//Bcz from java5 compiler automatically unbox the Boolean into boolean.
				
		//valueOf()......
		
		Integer i2 = Integer.valueOf("011",2);  //binary octal or Hexadeciml 
		//convrt 101011 to 43 & assign d val 43 to Integer obj i2;
        

		Float f2 = Float.valueOf("3.14f");
		//assign 3.14 to Float obj f2.


 		System.out.println("Hello World!");
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(b);
		System.out.println(c);
	}
}
