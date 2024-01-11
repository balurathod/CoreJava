package com.rathod.garbageCollections;

class Student_Test4
{
	public static void main(String[] args)
	{
			
				 Student_Test4 s3 = m1();
				 System.out.println(s3.hashCode());
				 
	}
	public static Student_Test4 m1()
	{
			Student_Test4 s1  = new Student_Test4();
			Student_Test4 s2  = new Student_Test4();
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			return s1;
		}
}
