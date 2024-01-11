package com.rathod.unsolved;
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
		double d = 114.567789;
		System.out.println(d);
		char c = 'B';
		System.out.println(c);
		String str="ARUN";     //String is not a primimtive data types.
		System.out.println(str);
		boolean boo=true;
		System.out.println(boo);
        System.out.println("\n");   

   
   
   //implicit conversion....
        System.out.println("\n");   
		System.out.println(" Implicit Conversion....");
		System.out.println("\n");   
		short sb = b;
		System.out.println(" IC   byte Val into short is sb= " + sb);
        int ib =b;
		System.out.println(" IC     byte Val into int is ib= "  + ib);
		int si = s;
		System.out.println(" IC    short Val into int is si= "  + si);
		long lb =b;
		System.out.println(" IC   byte Val into long  is lb= "  + lb);
		long sl =s;
		System.out.println(" IC   short Val into long is sl= "  + sl);
        long il = i;
		System.out.println(" IC   int Val into long   is il= "  + il);
        double df = f;
		System.out.println(" IC float Val into double is df= "  + df);
	   System.out.println("\n");   
	   // int i2 = f;  //"pocbl los of prcgn" bcz float into int never implctly.
	   //System.out.println(" IC float Val into int is i1= "  + i2);



//explicit conversion....
        System.out.println(" Explicit Conversion....");
//byte to short,int,long,float,duoble....
        System.out.println("\n");   
		byte s1b =(byte)s;
		System.out.println("EC short val into byte is bs= " + s1b);   
        byte i1b =(byte)i;
		System.out.println("EC int val into byte is bi=   " + i1b);
		byte l1b =(byte)l;
		System.out.println("EC long val into byte is bl=  " + l1b);
		byte fb =(byte)f;
		System.out.println("EC float val into byte is bf= " + fb);
		byte db =(byte)d;
		System.out.println("EC double val into byte is bd= " + db);//out of range

//short to int ,long,float,double....		
		System.out.println("\n");   
		short fs =(short)f;
		System.out.println(" EC float Val into short is fs= "  + fs);
        short ds =(short)d;
		System.out.println(" EC double Val into short is ds= "  + ds);
		short ls =(short)l;
		System.out.println(" EC long Val   into short is ls= "  + ls);
		short is =(short)i;
		System.out.println(" EC  int Val   into short is is= "  + is);

//int to long,float,double....
		System.out.println("\n");   
        int fi = (int)f;
		System.out.println(" EC  float Val into int is fi= "  + fi);
		int di = (int)d;
		System.out.println(" EC double Val into int is di= "  + di);
		int li =(int)l;
		System.out.println(" EC   long Val into int is li= "  + li);

//long to float,double....
         System.out.println("\n");
		long dl = (long)d;
		System.out.println(" EC double Val into   long is dl= "  + dl);
		long lf =(long)f;
		System.out.println(" EC float  Val into long  is lf = "  + lf);

//float to byte,short,int,long,double...
        System.out.println("\n");
		float bf=(float)b;
		System.out.println(" EC   byte Val into float is bf= "  + bf);
		float sf= (float)s;
		System.out.println(" EC  short Val into float is sf= "  + sf);
        float If =(float)i;
		System.out.println(" EC    int Val into float is if= "  + If);
        float l1f =(float)l;
		System.out.println(" EC   long Val into float is lf= "  + l1f);

//double to byte,short,int,long...
         System.out.println(" \n");
		double bd = (double)b;
		System.out.println(" EC byte Val into double is  bd= "  + bd);
		double sd =(double)s;
		System.out.println(" EC short Val into double is sd= "  + sd);
		double id =(double)i;
		System.out.println(" EC  int  Val into double is id= "  + id);
	    double ld =(double)l;
		System.out.println(" EC  long Val into double is ld= "  + ld);

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


B-EXPLICIT CAST-->The large value into a small contener conversion is reffered to 
                  as NARROWING.& requires an explicit casting.

     Where U tell d compilr that u r aware of danger & accept full responsobolity.  




A-IMPLICIT CASTING-->

NOTE-converts smallest primitive data types into bigger primi data type by default.

NOTE-boolean & char  primitives never converts into type casting.



1-float type primi converts into doubles.

2-int primi converts into longonly.

3-byte primi converts into short,int,long.

4-short primi converts into int & long.



A-EXPLICIT CASTINNG-->







*/