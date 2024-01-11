package com.rathod.garbageCollections;

class Student_Test5
{
	public static void main(String[] args)
	{
			
				 m1();
	}
	public static Student_Test5 m1()
	{
			Student_Test5 s1  = new Student_Test5();
			Student_Test5 s2  = new Student_Test5();
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			return s1;
		}
}
