package com.rathod.java5;

public class TestAutoBoxing {
		// Suppose the internal variables are in Wrapper types
		Integer iObj;
		Float fObj;
		Long lObj;
		Double dObj;
		public TestAutoBoxing() {
		}
		public static void main( String[] args ) {
			TestAutoBoxing a = new TestAutoBoxing();
		// You have to create instances of Wrapper classes first
		// before you save them into the internal variables. This
		// is called boxing.
		a.iObj = new Integer( 22 );
		a.fObj = new Float( 22.0 );
		a.lObj = new Long( 22L );
		a.dObj = new Double( 22 );
		// get primitive types.
		System.out.println( " int Value of iObj is: " + a.iObj.intValue() );
		System.out.println( " float Value of iObj is: " + a.fObj.floatValue() );
		System.out.println( " long Value of iObj is: " + a.lObj.longValue() );
		System.out.println( " double Value of iObj is: " + a.dObj.doubleValue());
		
		//using Auto Boxing
		a.iObj = 22;
		a.fObj = 22.0f;
		a.lObj = 22L;
		a.dObj = 22d;
		// get primitive types.
		System.out.println( "==== Now using Auto Boxing ====");
		System.out.println( " int Value of iObj is: " + a.iObj);
		System.out.println( " float Value of iObj is: " + a.fObj);
		System.out.println( " long Value of iObj is: " + a.lObj);
		System.out.println( " double Value of iObj is: " + a.dObj);
				
		}
}