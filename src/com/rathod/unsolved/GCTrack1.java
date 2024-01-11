package com.rathod.unsolved;
//Reassigning a ref var...
class GCTrack1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello...");  //why here need not importing of pkg for dis class? 
		StringBuffer sb1 = new StringBuffer("GoodBye...");

		System.out.println(sb1);
	  //At this pt the  StringBuffer "Hello" is not eligible for collection 
		
		sb = sb1;  //Redirct sb to refer to d "Goodbye" obj.
        System.out.println(sb1);
		System.out.println(sb);

	 //Now StringBuffer "Hello" is  eligible for collection means what obj delete/null?
	}
}
//Once d metd has returned,d obj created in d metd r eligible for GC. 