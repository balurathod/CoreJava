class MyOuter6 
{
	private String x="Outer6";
	void doStuff()
	{
		private String y="locale Variable";
		class MyInner
		{
			public void seeOuter()
			{
				System.out.println("Outer X is = "+x);
				System.out.println("Local Variable Y is= "+y);
			}
		}	

	}
	
}

//this not run why?  
