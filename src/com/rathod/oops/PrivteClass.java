package com.rathod.oops;
final class TestPrivate  //class as Private/static never allowed
{						//class as static allowed only in inner class
	public void meth(){
		System.out.println("Private class mtd");
	}
}

public class PrivteClass {
	public static void main(String[] args) {
		TestPrivate ts = new TestPrivate();
		ts.meth();
		System.out.println("Public class mtd");
		
	}

}
