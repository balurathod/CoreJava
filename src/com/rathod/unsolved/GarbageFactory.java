package com.rathod.unsolved;
//If obj is return from metd..its ref might b assign to ref var in metd that 
//  call to it.
import java.util.Date;
class GarbageFactory 
{
 	public static void main(String[] args) 
	{
    	Date d = getDate();        //what is meaning?
       	System.out.println("D = " + d);
    }
	public static Date getDate()     //what is meaning?  getDate() is a FACTORY method
	{
		Date d1 = new Date();
		StringBuffer now = new StringBuffer(d1.toString()); //why dis st.?
		
		System.out.println(now);
	    return d1;  //Date obj is not eligible for GC even if metd is returned.
	}
}
//Once d metd has returned,d obj created in d metd r eligible for GC. 

//when we use Factory method & when we use user define method?