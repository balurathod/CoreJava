package com.rathod.oops;
class C18 
{
	public void m1(){ }

}
class CD extends C18
{  
   private void m1(){}     //in overriding return type should & must b same.
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C18.java
C18.java:9: m1() in CD cannot override m1() in C18; attempting to assign weaker access privileges; was public
private void m1(){}
             ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C18.java

*/