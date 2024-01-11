package com.rathod.oops;
class Default
{
      	 byte b;
		 short s;
		 //int i;
		 long l;
		 //float f;
		 double d;
		// boolean bl;

	     //String str	;	 
		 String str = "";
		 
		 char c ;            // o/p -->'\u0000'  how? by default val of char
		 //char c = '' ;       //Err-empty/enclosed char litrl        		 

		 Object o;      

		 Integer i;           //NOTE By default val of all Wrapper class is NULL.
 
		 Float f;
       
	     Boolean bl;
	

	public static void main(String[] args) 
	{
		Default d = new Default();

		//o=new Object();
        
		System.out.println(" Byte b     = " + d.b);
		System.out.println(" Short s    = " + d.s);
	 	System.out.println(" int i      = " + d.i);
	    System.out.println(" long l     = " + d.l);

		System.out.println(" float f    = " + d.f);
		System.out.println(" double d   = " + d.d);
		System.out.println(" booleab bl = " + d.bl);
		System.out.println(" char c     = " + d.c);
		
        System.out.println("String str  = " + d.str);

		System.out.println("Object ref  = " + d.o);


		} 
}
