package com.rathod.garbageCollections;

public class GcTest {

	public static void main(String[] args) {
		GcTest x= new GcTest();
		GcTest y = new GcTest();
		GcTest z = new GcTest();
		GcTest a ;
		a = x;
		x = y;
		y = z;
		z = null;
		System.out.println("              check a   "+a+"  	 x "+x+"		y "+y +"	z "+z);
		System.gc();		
		System.out.println("After GC call check a   "+a+"  	 x "+x+"		y "+y +"	z "+z);
		
	}

}
