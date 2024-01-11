package com.rathod.unsolved;
class GCTrack 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hi...");  //why use this class?

	  //StringBuffer obj is not eligible for collection 
		sb = null;
	  System.out.println(sb);
	//Now StringBuffer obj is  eligible for collection
	}
}
