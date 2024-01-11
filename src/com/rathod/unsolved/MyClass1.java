package com.rathod.unsolved;
 public class MyClass1
 {
	 int x=10;
	 //static void final int y=5;

	 public void method(int z)
	 {
		 int a=10;
		 final float b=10;
		 class LocalClass   //inner class
		 {
			 int c=3;
             public void method(int d)
			 {
				 System.out.println("??");
          //     System.out.println("?? C= " + c + " B= " + b + " X=  " + x);
			 }
		 }
	 }
   public static void main(String[] args) 
	{
	}
}

/*

		 LocalClass lc = new LocalClass();
		 lc.method();


MyClass1.LocalClass mc = new MyClass1().new LocalClass();
		 mc.method();

*/
