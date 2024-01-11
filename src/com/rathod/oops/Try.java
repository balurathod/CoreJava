package com.rathod.oops;
class C32 
{
	private String get(String str)
	{
		try
		{
			throw new Exception();
			return str;

		}
		catch (Exception e)
		{
			return null;
		}
	}
	public static void main(String peace[])
		
	{
		try
		{
			System.out.println((new C32()).get("C30"));
		}
		catch (Exception e)
		{
                 System.out.println("Exception");
		}
		
	}
}



/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C32.java
C32.java:15: illegal start of expression
        public static void main(String peace[])
        ^
C32.java:15: illegal start of expression
        public static void main(String peace[])
               ^
C32.java:15: ';' expected
        public static void main(String peace[])
                     ^
C32.java:15: ')' expected
        public static void main(String peace[])
                                      ^
C32.java:15: illegal start of expression
        public static void main(String peace[])
                                            ^
C32.java:15: ';' expected
        public static void main(String peace[])
                                             ^
C32.java:15: illegal start of expression
        public static void main(String peace[])
                                              ^
C32.java:15: ';' expected
        public static void main(String peace[])
                                               ^
C32.java:20: ';' expected
                        System.out.println((new C32()).get("C30"))
                                                                  ^
9 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>	
*/