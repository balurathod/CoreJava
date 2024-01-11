package com.rathod.oops;
abstract public class  Employee
{
	protected abstract double getSalesAmount();
	public double getCommision()
	{
		return getSalesAmount()*0.15;
	}
}
class Sales extends Employee
{
//B-public double getSalesAmount(){return 1230.45;}
//D-protected double getSalesAmount(){return 1230.45;}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
