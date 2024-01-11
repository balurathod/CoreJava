package com.rathod.oops;
class C10 
{
	public static void main(String[] args) 
	{
		String s1="hjhh";           //1
		String s2="\u0002";       //2
		String s3="'\\'";             //3
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}

//Why String primitive data types 'S' capital? where as all other r small(int,float,char,short)letters.
//Ans-It is not a primitive data type,it is a WRAPPER class.like Integer,Float,Charactor,Short,Double,Boolean,Byte all r WC.

//String is a Final class in Java.When you create its instance it create obj of String class ,not primitive 
/*

G:\SCJP\Query\LOGIC>javac C10.java

G:\SCJP\Query\LOGIC>java C10
hjhh
?   smiley face
'\'

G:\SCJP\Query\LOGIC>
*/