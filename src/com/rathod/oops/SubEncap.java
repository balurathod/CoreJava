package com.rathod.oops;
//Encapsulation....implmnt through inheritance & polymorphism.
class  Encap
{
	//scope of all private is upto only this class.(security & restriction)
	private int i =10;
	private short j ;

	//private void getData(); to declr here & define in other class not possible 
	//private void clsData();

//scope of all public is for all(supr & sub) class.(Binding & sharable)
	
	public byte k = 89;
	public char c = 'B';

    public void forSub(){}
	public void forSubSub(){}

 void getData()
	{
	   System.out.println("it is only for this class " + i);
    }
}
public class SubEncap extends Encap
{
	public void forSub()
	{

			System.out.println("sharable vt all supr & sub In forSub " + k);
	}
	public void forSubSub()
	{
			System.out.println("sharable vt all supr & sub In forSubSub " + c);
	}
	public static void main(String[] args) 
	{
      Encap e = new Encap();
		  e.getData();
		  e.forSub();
		  e.forSubSub();

     SubEncap se = new SubEncap();
		  se.getData();
		  se.forSub();
		  se.forSubSub();
	}
}