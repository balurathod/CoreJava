package com.rathod.unsolved;
public class Test4 
{
	public enum Dogs{collie,harrier};

	public static void main(String[] args) 
	{
		Dogs myDog=new Dogs.collie;

		switch(myDog)
		{
			case collie: 
				System.out.println("collie");
            case harrier:
				System.out.println("Harrier");
			
		}
	}
}

/*
o/p-->collie harrier.

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test4.java
Test4.java:7: '(' or '[' expected
                Dogs myDog=new Dogs.collie;
                                          ^
1 error
*/