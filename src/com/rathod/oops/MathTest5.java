package com.rathod.oops;
public class MathTest5 
{
	public static void main(String[] args) 
	{
		double d=25.3,f=56.78;
	   System.out.println("ceil val of d="+d+" is = "+Math.ceil(d));
	   System.out.println("floor val d="+d+" is= "+Math.floor(d));
       System.out.println("sin val of d="+d+" is="+Math.sin(d));
	   System.out.println("cos val of d="+d+" is= "+Math.cos(d));
	   System.out.println("tan val of d="+d+" is="+Math.tan(d));
	   System.out.println("log val of d="+d+" is="+Math.log(d));
	   System.out.println("log10 val  of d="+d+" is="+Math.log10(d));
	   System.out.println("pow val of d="+d+" & f="+f+" is="+Math.pow(d,f)); //f-base & d-power of f
	   System.out.println("sqrt val of d="+d+" is="+Math.sqrt(d));
	   System.out.println("abs val of d="+d+" is="+Math.abs(d));
	   System.out.println("min val of d="+d+" & f="+f+" is="+Math.min(d,f));
	   System.out.println("max val of d="+d+" & f="+f+"is="+Math.max(d,f));
	   System.out.println("round val of d="+d+" is="+Math.round(d));                  //round figure val is 25 of d.
	   System.out.println("random val of d="+d+" is="+Math.random());
	   System.out.println("toRadians val of d="+d+" is="+Math.toRadians(d));
	   System.out.println("toDegrees val of d="+d+" is="+Math.toDegrees(d));

	}
}

//ceil() -raise the given arg value to next int value.
 
 //if int is given to this method it gives the same value.

  //eg-double 2.4 -> 3.0, 2.999 -> 3.0 , 5.2 -> 6.0 , 25.1 -> 26.0
 //eg-int 29 -> 29.0 , -27 -> -27.0


 //floor() -decrease the given arg value to previous  int value.
 
 //if int is given to this method it gives the same value.
//eg int  -25 -> -25.0 , 25 -> 25.0 
//eg double   25.1 -> 25.0