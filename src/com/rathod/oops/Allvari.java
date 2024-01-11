package com.rathod.oops;
//Scope of variables....
class Layout
{
	static int s=343;
	int x;                    //instance var.
	{                         //initialization block.
		long a = 7,b=8; 
	    b =b + 5;             //x2-block var a flavor of loc var.
		System.out.println("Init block ,a =	 " + a + " b is = " + b	);
	}
   Layout()                   //constor.
	{
		x+=8;
		int x3=6;             //constor var a flavor of loc var 
		System.out.println("in Constr Val of x = " + x +	 " & X3 = " + x3 + " Respectively");
	}
	void doStuff()            //method
	{
		int y=0;               //local var.
		for (int z=0 ;z < 4 ;z++ )         //z-block var.
		{
			y += z + x;
			System.out.println("In metd Val of y " + y);
		}
	}
    public static void main(String[] args) 
	{
        System.out.println("Scope of Variable...val of static  s is " + s);
		Layout l = new Layout();
		l.doStuff();

	}
}
/*

TYPES Of VARIABLES....

1-Static  -->longest scope, it loaded when class is loaded & live upto class live on JVM 



2-Instance -->next most long liveed!,it create when new instance is created & live untill instance is removed.
  


3-Local   -->live as long as their method.  (some time called STACK,automic,tempryri,method



4-Block  -->live as long as code block is executing. 

*/