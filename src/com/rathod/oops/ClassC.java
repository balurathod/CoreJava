package com.rathod.oops;
 class  ClassA
{
	public void methodA()
		{
		
		ClassB classB=new ClassB();
		classB.getValue();
		}
}
 class  ClassB
{
	public ClassC classC;
	public String getValue();
//	return ClassC.getValue();
}
public class  ClassC
{
	public String value;
	public String getValue(){ value="ClassB"; return value;}

	public static void main(String[] args) 
	{
		ClassA a=new ClassA();
		a.methodA();
		System.out.println("Hello World!");
	}
}
/*
D-An Exception is thrown at run time...



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac ClassC.java
ClassC.java:16: class, interface, or enum expected
        public static void main(String[] args)
                      ^
ClassC.java:19: class, interface, or enum expected
                a.methodA();
                ^
ClassC.java:20: class, interface, or enum expected
                System.out.println("Hello World!");
                ^
ClassC.java:21: class, interface, or enum expected
        }
        ^
4 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac ClassC.java
ClassC.java:1: class ClassA is public, should be declared in a file named ClassA.java
public class  ClassA
       ^
ClassC.java:8: missing method body, or declare abstract
        public String getValue();
                      ^
2 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac ClassC.java
ClassC.java:9: illegal start of type
        return ClassC.getValue();
        ^
ClassC.java:9: ';' expected
        return ClassC.getValue();
              ^
ClassC.java:9: illegal start of type
        return ClassC.getValue();
                     ^
3 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac ClassC.java
ClassC.java:9: <identifier> expected
         ClassC.getValue();
                        ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>
*/