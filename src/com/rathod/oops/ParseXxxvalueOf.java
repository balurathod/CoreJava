package com.rathod.oops;
class ParseXxxvalueOf 
{
	public static void main(String[] args) 
	{
		double d = Double.parseDouble("3.14");    //convrt to String
		System.out.println(" String val of d is = " + d);

		double d1 = Double.valueOf("3.14");    //convrt to String
		System.out.println(" d1 instanceof  Double is = " + d1);

		
		long l2 = Long.parseLong("101010", 2);
		System.out.println("L2 is binary String to primi covted val is " + l2);

        
		long l =  Long.valueOf("101010", 2);	
		System.out.println("L2 is binary  to primi val is = " + l);

	}
}
