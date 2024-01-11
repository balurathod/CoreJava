package com.rathod.oops;

public class SingletonTest {
	 public static void main(String [] args) {
		 SingletonEx firstSingleton;
		 SingletonEx secondSingleton;
		// create Singleton objects
		 firstSingleton = SingletonEx.getInstance();
		 secondSingleton = SingletonEx.getInstance();
		 //SingletonEx df = new SingletonEx();						//chk this stmnt for confrmcn
		// the "two" Singletons should refer to same Singleton
		 if(firstSingleton == secondSingleton)
		 System.err.println( "firstSingleton and secondSingleton " +
				 				"refer to the same Singleton object" );
	 }
}

/*
 * Lines 5–6 of class SingletonTest declare two references to Singleton
objects—firstSingleton and secondSingleton. Lines 9–10 call method getSingletonInstance
and assign Singleton references to firstSingleton and secondSingleton,
respectively. Line 12 tests whether these references both refer to the same Singleton
object. Figure P.4 shows that firstSingleton and secondSingleton indeed are both references
to the same Singleton object, because each time method getSingletonInstance
is called, it returns a reference to the same Singleton object.

*/
