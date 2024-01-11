package com.rathod.oops;

import java.util.HashSet;

public class TestDepartment {
	public static void main(String[] args) 
	{
		Department dmp = new Department(23);
		System.out.println("dmp.hashCode()--->>>"+dmp.hashCode());
		
		Department dmp1 = new Department(23); 		 //diff ref diff obj
		//Department dmp1 = dmp;					 //diff ref same obj
		System.out.println("dmp.equals(dmp)--->>>"+dmp.equals(dmp1));
		
		int originalHashCode = System.identityHashCode(dmp);
		System.out.println("Original hashCode of Department---->>>"+originalHashCode);
		
		int orgnalHashCode = System.identityHashCode(dmp1);
		System.out.println("Orgnal hashCode of Department  ---->>>"+orgnalHashCode);
		
		Department emp1 = new Department(23);
		Department emp2 = new Department(24);
		Department emp3 = new Department(25);
		Department emp4 = new Department(26);
		Department emp5 = new Department(27);
		
		HashSet<Department> hs = new HashSet<Department>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
	
		System.out.println("HashSet Size--->>>"+hs.size());
		System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Department(25)));
		System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove( new Department(24)));
		System.out.println("Now HashSet Size--->>>"+hs.size());
	}
}