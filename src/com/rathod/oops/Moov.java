package com.rathod.oops;
class Zoo 
{
	public String coolMethod()
	{
		return "Wowwww ...Baby...";
	}
}
class Moov
{
    public void useAZoo()
	{		}
	public static void main(String[] args) 
	{
		Zoo z=new Zoo();  
//		z.coolMethod(); no need of this.  
	 //why?
       //Bcoz..it directly put & call in s.o.p() metd;

		System.out.println("A Zoo says  " + z.coolMethod());

	}
}




//RULE....
//If a subclass inherits a member,the subclass has the member....?