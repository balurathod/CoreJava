package com.rathod.unsolved;
class Test37 
{
	public static void main(String[] args) 
	{
		Object a="hello";
		String b="hello";
		if(a==b)
				System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}


/*
D:\SCJP\Oldscjp(1-5)\Exam2>javac Test37.java
.\Object.java:1: class, interface, or enum expected
 Given:
 ^
.\Object.java:8: class, interface, or enum expected
 Arrays.sort(myObjects);                 //A ClassCastException occurs
 ^
.\Object.java:9: class, interface, or enum expected
for(int i=0; i<myObjects.length; i++) {
^
.\Object.java:9: class, interface, or enum expected
for(int i=0; i<myObjects.length; i++) {
             ^
.\Object.java:9: class, interface, or enum expected
for(int i=0; i<myObjects.length; i++) {
                                 ^
.\Object.java:11: class, interface, or enum expected
 System.out.print(" ");
 ^
.\Object.java:12: class, interface, or enum expected
 }
 ^
Test37.java:5: cannot access Object
bad class file: .\Object.java
file does not contain class Object
Please remove or make sure it appears in the correct subdirectory of the classpath.
                Object a="hello";
                ^
8 errors
*/