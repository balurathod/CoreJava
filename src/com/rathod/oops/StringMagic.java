package com.rathod.oops;
class StringMagic 
{
	public static void main(String[] args) 
	{
		String a="String";
		int b=3;
		int c=7;
		System.out.println(a+b+c);
		System.out.println(b+a+c);
		System.out.println(b+c+a);
		System.out.println(c+b+a);
		System.out.println(a+(b+c));


		String s="123";
		s+="45";
		s+=67;
		System.out.println(s);


		int d=2;
		System.out.println(""+d+3);  //""-means obj creation for Final String class
		System.out.println(d+3);
		}
}
//the + oprtor treat 3 & 7 as chars & concatenate them.


//Rule....If operand is a String the '+' operator become a String concatenation operator.
//        If both operand are  Number the '+' operator is the addition operator. 
        