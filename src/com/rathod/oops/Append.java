package com.rathod.oops;
class Append 
{
	public static void main(String[] args) 
	{
//		String s ="Mr. ARUN";  illegal...
        
//      StringBuffer sb = new StringBuffer("MR. BALU");

//U can replace StringBuilder class vt StringBuffer class directly without any 
// other  changes on code

		StringBuilder sb = new StringBuilder("MR. BALU");

		System.out.println(sb.append("Rathod"));
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.indexOf("BALU"));
		System.out.println(sb.lastIndexOf("Rathod"));
		System.out.println(sb.insert(7, "o"));
		System.out.println(sb.substring(5,8));  //7,5,8,4-position of char in index of String
		System.out.println(sb.substring(5));
		System.out.println(sb.replace(4,8,"DOLLY"));
        System.out.println(sb.delete(4,9));
        //System.out.println(sb.trimToSize());


	}
}
