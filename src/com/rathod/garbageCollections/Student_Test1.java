package com.rathod.garbageCollections;

class Student_Test1
{
	public static void main(String[] args)
	{
			Student_Test1 s1  = new Student_Test1();
			Student_Test1 s2  = new Student_Test1();
			System.out.println("Hello");
			s1 = null;
			System.out.println(s1.hashCode());
			System.out.println("Hi");
			s2 = null;
			System.out.println(s2.hashCode());
				System.out.println("After");
	}
}
