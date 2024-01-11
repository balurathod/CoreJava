package com.rathod.unsolved;
class DoStuff 
{
	public static void main(String[] args) 
	{
		void doStuff()     //2-bt doStuff() is still in trouble...Why?
		{
			doMore();  
		}
		void doMore()throws IOException//1-throw checked excp.bt does not declr it.
		{
			throw new IOException();  //is it pocbl in metd?
			
			//IOException is a sub class of Exception class. 
		}

		System.out.println("Hello World!");
	}
}
//is it pocbl metd in main() metd?

//if we aply 'throws' on metd then why we aply 'throw' in  same metd?