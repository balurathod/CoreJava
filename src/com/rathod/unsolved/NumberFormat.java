package com.rathod.unsolved;

class NumberFormat1  // class-NumberFormat -error in whole dir. 
{
	
		NumberFormat nf=NumberFormat.getInstance();
	  
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		
		String a=nf.format(3.145926);
		String b=nf.format(2);
	
	public static void main(String[] args) 
	{
		System.out.println("Val of b="+b);
	}
}
//compilation err why?
//why we cant define lib class?