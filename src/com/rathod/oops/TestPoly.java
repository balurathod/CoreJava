package com.rathod.oops;
import java.util.*;

class Parent
{}
class Child extends Parent
{}
public class TestPoly
{
	public static void main(String[] args) 
	{
		Parent [] myArray = new Child[3];    //yes no problm which means u r also allow this to do...

		Object [] myArray = new JButton[3];   //yes...but u do not this...

		List<Object> list = new ArrayList<JButton>();    //no never...

		System.out.println("Hello World!");
	}
}
/*
why r d rul for typing of arrays diffrnt from the d rules for genric typing...?

just burn it into ur mind....
Polymorphism does not work d same way for generics as it does with arrays.... 
*/