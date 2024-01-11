package com.rathod.oops;
abstract class Vehicle 
{
	abstract public void speed();
}
/*abstract*/ class Car extends Vehicle //forces the class Car to b declared as abstract.
{
	public static void main(String[] args) 
	{
		Vehicle ob1;
		ob1=new Car();     //1
	
	}
}

/*

if car is abs class & remove ln 10 den it vl compl & run vt no o/p


G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac Car.java
Car.java:5: Car is not abstract and does not override abstract method speed() in Vehicle
class Car extends Vehicle //forces the class Car to b declared as abstract.
^
1 error

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>
*/