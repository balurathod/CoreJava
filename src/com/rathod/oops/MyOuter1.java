package com.rathod.oops;
//in this way u define inner class.
class MyOuter 
{
//	class MyInner{}
   static 	class MyInner
	   {
	       public static void main(String[] args) 
        	{
		       System.out.println("Hello two dot class r created in INNER CLASS");
	        }
		}	
		
	public static void main(String[] args) 
	{
		MyOuter m = new MyOuter();
		
		
		System.out.println("Hello World! two dot class r created in INNER CLASS");
	}
}
	//Error:No main() found....

	//inner class is static nested class.(not any concept of STATIC CLASS in JAVA)

	//never try to execute d prog using .class of inner class  

   // IC is a member of OC,it define in {} of OC,but not on any metd/block of OC. 