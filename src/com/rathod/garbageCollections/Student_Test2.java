package com.rathod.garbageCollections;

class Student_Test2
{
	public static void main(String[] args)
	{
		
			Student_Test2 s1  = new Student_Test2();
			Student_Test2 s2  = new Student_Test2();
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			s1 = new Student_Test2();
			System.out.println(s1.hashCode());
			System.out.println("Hi");
			s2 = s1;
			
			System.out.println(s2.hashCode());
				System.out.println("After");
	}
}
