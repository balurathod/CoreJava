package com.rathod.unsolved;
import java.text.*;
import java.util.*;
class NumFrmt 
{
	public static void main(String[] args) 
	{
		float f = 123.4567f;
		Locale locFR = new Locale("fr");
		NumberFormat[] nf = new NumberFormat[4];

		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(locFR);
		nf[2] = NumberFormat.getCurrencyInstance();
		nf[3] = NumberFormat.getCurrencyInstance(locFR);

		for(NumberFormat nf1 : nf )
			//System.out.println(nf1.format(f));
	    	System.out.println(nf);
	}
}
/*

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\DateNum&Currncy>javac NumFrmt1.java

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\DateNum&Currncy>java NumFrmt1
3
123.457
123.45670319
0
123.45670319
1234.4567
1234

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\DateNum&Currncy>

*/