package com.rathod.oops;
class C14 
{
	public static void main(String a[]) 
	{
		C14 obj = new C14();
		Object obj1 = obj;    //== gives error bcoz obj  & obj1 r not a st
		System.out.println(obj1 instanceof Object);  //Bc0z every class extends Object class
		System.out.println(obj instanceof C14);
		System.out.println(obj1 instanceof Object);//

	}
}
/*
o/p-> true true true

for instanceOf....

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C14.java
C14.java:9: ')' expected
                System.out.println(obj instanceOf Object);
                                      ^
C14.java:9: not a statement
                System.out.println(obj instanceOf Object);
                                                  ^
C14.java:9: ';' expected
                System.out.println(obj instanceOf Object);
                                                        ^
3 errors

 
  "instanceof" -Concept of Java,it shows rel bet two or more class/ref/intrfce,
                on basis of INHERITANCE(IS-A Relcncip)
    eg-Horse is an instance of Animal not vice-versa.
	
	eg-Car is not an instancs of HumanBeing. 
 
 
 "instanceOf" - not a concept of JAVA but in exam may ask for confusion ?

*/