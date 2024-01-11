package com.rathod.unsolved;
//using throw...
class Sample 
{
	static void demo()
	{
		try
		{
			System.out.println("Inside demo()");
			throw new NullPointerException("Exception data") ;  //why this only?
		    //throw new IOException("My IOException");          //why this not?
		}
		//catch (NullPointerException ne,IOException ioe)
		catch (NullPointerException ne)
		{
			//ne.printStackTrace();
			System.out.println(ne);
		}
		/*
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}*/
	}
}
class Throwdemo
{
	public static void main(String[] args) 
	{
		Sample.demo();
		
	}
}
//what type of que may ask on Exception?