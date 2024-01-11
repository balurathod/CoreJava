package com.rathod.java5;

import java.util.Iterator;
import java.util.Vector;

public class EnancedForLoop {
	public static void main( String[] args ) {

		Vector<Object> v = new Vector<Object>();
		v.add( new String( "Hello World" ) );
		v.add( new Integer( 10 ) );
		v.add( new Double( 11.0 ) );
		v.add( new Long( 12 ) );
		//for ( Iterator i = v.iterator(); i.hasNext(); ) {
			//	System.out.println( " Vector element is: " + i.next() );
		for ( Object o : v) {
			System.out.println( " Vector element is: " + o);
		}
		String [] s = {
		"Java 2",
		"Platform",
		"Standard",
		"Edition",
		"1.5",
		"is",
		"the",
		"latest",
		"release",
		"of",
		"the",
		"Java",
		"Platform" };
		//for ( int i = 0; i < s.length; ++i ) {
			//System.out.println( "String array element is: " + s[i] );
		for ( String i : s ) {
			System.out.println( "String array element is: " + i );
		}
	}
}
		