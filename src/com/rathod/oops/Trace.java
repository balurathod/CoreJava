package com.rathod.oops;
class Trace 
{
	public static void main(String[] args) 
	{
		try
		{
			//empty...
		}
		catch (ArrayIndexOutOfBoundsException aiobe)
		{
			aiobe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception");
            //system.out.println("Exception");  Error: pkg system does not exist.
		}
		catch(IOException ie)
		{
               	ie.printStackTrace();
			System.out.println("IOException");
		}
		catch(NullPointerException npe)
		{
				npe.printStackTrace();
			System.out.println("NullPtrException");
		}
		catch(IndexOutOfBoundsException ibe)
		{
				ibe.printStackTrace();
			System.out.println("IndexOutOfBoundsException");

		}
		catch(ClassCastException cce)
		{
				cce.printStackTrace();
			System.out.println("ClassCastException");
		}
		catch(IllegalArgumentException eae)
		{
				eae.printStackTrace();
			System.out.println("IllegalArgException");
		}
		catch(IllegalStateException ese)
		{
				ese.printStackTrace();
			System.out.println("illegalStateException");
		}
		catch(NumberFormatException nfe)
		{
				nfe.printStackTrace();
			System.out.println("No.FrmtException");
		}
        //catch(AssertionError)
		//{nfe.printStackTrace();}
		catch(ExceptionInInitializerError eiie)
		{
				eiie.printStackTrace();
			System.out.println("ExceptionInInitializerError");
		}
		catch(StackOverflowError soe)
		{
				soe.printStackTrace();
			System.out.println("StackOverflowError");
		}
		catch(NoClassDefFoundError ncdfe)
		{ 
          	ncdfe.printStackTrace();
			System.out.println("NoClassDefFoundError");
		}
		}


	}
/*
run properly nothing o/p.....
aiobe-instance of ArrayIndexOutOfBoundsException class.As with any other obj,
u can call its methods.
*/