package com.rathod.oops;
class TypeCast 
{
	public static void main(String[] args) 
	{
		byte b = 35;
        System.out.println(b);
		short s = 45;
		System.out.println(s);
		int i = 55;
		System.out.println(i);
		long l = 65;
		System.out.println(l);
		float f = 25.2500f;
		System.out.println(f);
		double d = 234.567789;
		System.out.println(d);
		char c = 'B';
		System.out.println(c);
		String str="ARUN";     //String is not a primimtive data types.
		System.out.println(str);
		boolean boo=true;
		System.out.println(boo);


   
   
   //implicit conversion....
        
		System.out.println(" Implicit Conversion....");
		short sb = b;
		System.out.println(" IC byte Val into short is sb= " + sb);
        int ib =b;
		System.out.println(" IC byte Val into int is ib= "  + ib);
		int is = s;
		System.out.println(" IC short Val into int is is = "  + is);
		long lb =b;
		System.out.println(" IC byte Val into long is lb= "  + lb);
		long ls =s;
		System.out.println(" IC short Val into long is ls= "  + ls);
        long li = i;
		System.out.println(" IC int Val into long is li  = "  + li);
        double df = f;
		System.out.println(" IC float Val into double is df= "  + df);
	   
	   // int i2 = f;  //"pocbl los of prcgn" bcz float into int never implctly.
	   //System.out.println(" IC float Val into int is i1= "  + i2);



//explicit conversion....
        

		System.out.println(" Explicit Conversion....");   
        int fi = (int)f;
		System.out.println(" IC float Val into int is fi= "  + fi);
		int di = (int)d;
		System.out.println(" IC double Val into int is di= "  + di);
		int bi = (int)b;
		System.out.println(" IC byte Val into int is  bi= "  + bi);
		int si =(int)s;
		System.out.println(" IC short Val into int is si= "  + si);
		int li =(int)l;
		System.out.println(" IC long Val into int is li= "  + li);
		long sl =(long)s;
		System.out.println(" IC short Val into long is sl= "  + sl);
		long dl = (long)d;
		System.out.println(" IC double Val into long is dl= "  + dl);
		long lb =(long)b;
		System.out.println(" IC long Val into byte is lb= "  + lb);
		long lf =(long)f;
		System.out.println(" IC long Val into float is lf = "  + lf);

		float sf= (float)s;
		System.out.println(" IC short Val into float is sf = "  + sf);
        double sd =(double)s;
		System.out.println(" IC short Val into double is sd= "  + sd);
		int i1 = s;
		System.out.println(" IC short Val into int is i1 = "  + i1);

		float bf=(float)b;
		System.out.println(" IC short Val into float is bf= "  + bf);
	}
}




/*how it work ? what it check?

For type casting.....Imlicit cast  & Explicit cast.


A-IMPLICIT CAST-->U dont have to write code for d cast.
                  Imlicit cast happens,when u r doing a widening conversion.
		          i.e.-smaller things(byte) into a bigger container(short/int/long).		  


"possible loss of precision"-complr err,in assignmnt sec.

    those happen when we tried to put a larger thing(long) into a smaller contenr
	(byte/short/int). so....


B-EXPLICIT CAST-->UnSafe
                 The large value into a small contener conversion is reffered to 
                  as NARROWING.& requires an explicit casting.

     Where U tell d compilr that u r aware of danger & accept full responsobolity.  




A-IMPLICIT CASTING-->Type Safe

NOTE-converts smallest primitive data types into bigger primi data type by default.

NOTE-boolean & char  primitives never converts into type casting.



1-float type primi converts into doubles.

2-int primi converts into longonly.

3-byte primi converts into short,int,long.

4-short primi converts into int & long.



A-EXPLICIT CASTINNG-->







*/