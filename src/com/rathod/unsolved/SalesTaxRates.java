package com.rathod.unsolved;
class DoTaxes 
{
	float rate;

	float doColorado()
	{
		SalesTaxRates str=new SalesTaxRates();
		rate=str.salesRate;     //ouch...
	}
}
class SalesTaxRates   //how to recognize cohesion & coupling in prog?
{
	public float salesRate;
	public float adjustedSalesRates;

	public float getSalesRate(String region)
	{
		salesRate =new DoTaxes().doColorado();   //ouch...
		return adjustedSalesRates ;
	} 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*1 error...why? 


What is  coupling & cohesion?

Ans-
    coupling-to join or link together
	 
	cohesion-State of uniting or sticking together

	shuns-To keep away from


-->Both r OO(object oriented) design( hav to do quality of) principles.
    
-->Good OO design calls for loose Coupling & shuns tight coupling. 

-->Good OO design calls for High Cohesion & shuns low cohesion. 

-->Goals
        -Ease of creation
        -Ease of maintenence
        -Ease of enhancement

-->Coupling-is the  degree to which one class knows about another class.

-->Cohesion-is the  degree to which a class has a single,well-focused purpose.






*/  
