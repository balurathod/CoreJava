package com.rathod.oops;
public class TestForEach
{
		public static void main(String args[])
		{
			int nums[]={10,20,30,40,50};
			int sum=0;
				for(int x: nums)
				{
					System.out.println(" "+x);
					sum+=x;
				}

				System.out.println("The sum is : "+sum);
		}
}