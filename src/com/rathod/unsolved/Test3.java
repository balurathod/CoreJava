package com.rathod.unsolved;
public class Test3 
{
	public enum Dogs{collie,harrier,shepherd};
	public static void main(String[] args) 
	{
		Dogs myDog=new Dogs();
		switch(myDog)
		{
			case collie: System.out.println("collie");
            case harrier: System.out.println("Harrier");
			//case default: System.out.println("retriever");
		}
		//System.out.println("Hello World!");
	}
}
/*
compilation fail...how?


D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test3.java
Test3.java:6: '(' or '[' expected
                Dogs myDog=new Dogs.shepherd;
                                            ^
Test3.java:10: illegal start of expression
            case default:System.out.println("retriever");
                 ^
Test3.java:10: illegal start of expression
            case default:System.out.println("retriever");
                        ^
Test3.java:10: ';' expected
            case default:System.out.println("retriever");
                               ^
4 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test3.java
Test3.java:6: '(' or '[' expected
                Dogs myDog=new Dogs.shepherd;
                                            ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test3.java
Test3.java:6: '(' or '[' expected
                Dogs myDog=new Dogs.shepherd;
                                            ^
Test3.java:9: illegal start of expression
                        case: collie System.out.println("collie");
                            ^
Test3.java:9: ';' expected
                        case: collie System.out.println("collie");
                                           ^
Test3.java:11: illegal start of expression
                        case: harrier System.out.println("Harrier");
                            ^
Test3.java:11: ';' expected
                        case: harrier System.out.println("Harrier");
                                            ^
5 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test3.java
Test3.java:6: '(' or '[' expected
                Dogs myDog=new Dogs.shepherd;
                                            ^
Test3.java:11: illegal start of expression
                        case default: System.out.println("retriever");
                             ^
Test3.java:11: illegal start of expression
                        case default: System.out.println("retriever");
                                    ^
Test3.java:11: ';' expected
                        case default: System.out.println("retriever");
                                            ^
4 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test3.java
Test3.java:11: illegal start of expression
                        case default: System.out.println("retriever");
                             ^
Test3.java:11: illegal start of expression
                        case default: System.out.println("retriever");
                                    ^
Test3.java:11: ';' expected
                        case default: System.out.println("retriever");
                                            ^
3 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test3.java
Test3.java:6: enum types may not be instantiated
                Dogs myDog=new Dogs();
                           ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>




*/