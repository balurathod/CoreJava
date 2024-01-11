package com.rathod.garbageCollections;

class Student_Test6
{
	public static void main(String[] args)
	{
		int i = 10;
			Student_Test6 s1  = new Student_Test6();
			Student_Test6 s2  = new Student_Test6();
			Student_Test6 s3  = new Student_Test6();
				System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			s1.i = s2;
			s2.i = s3;
			s3.i = s1;
			s1 = null;
			s2 = null;
			s3 = null;
		}
}
