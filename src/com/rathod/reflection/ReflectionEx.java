package com.rathod.reflection;

// 1) 
class Simple {
}

// public class ReflectionEx {
// public static void main(String args[]) {
// Class c = Class.forName("Simple");
// System.out.println(c.getName());
// }
// }

// 2) getClass() method of Object class
// It returns the instance of Class class. It should be used if you know the
// type. Moreover, it can be used with primitives.

// class ReflectionEx {
// void printName(Object obj) {
// Class c = obj.getClass();
// System.out.println(c.getName());
// }
//
// public static void main(String args[]) {
// Simple s = new Simple();
//
// ReflectionEx re = new ReflectionEx();
// re.printName(s);
// }
// }

// 3) The .class syntax

// If a type is available but there is no instance then it is possible to obtain
// a Class by appending ".class" to the name of the type.It can be used for
// primitive data type also.

class ReflectionEx {
	public static void main(String args[]) {
		Class c = boolean.class;
		System.out.println(c.getName());

		Class c2 = ReflectionEx.class;
		System.out.println(c2.getName());
	}
}