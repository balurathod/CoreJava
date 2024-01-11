package com.rathod.unsolved;
 class Test26 
{
	void getCount()
	{
		int counter =0;
		for (int i=10;i>0 ;i-- )
		{
			int j=0;
			while (j>10)
			{
				if(j>1)
					break;
				j++;
				
			}System.out.println(counter + "" +j +""+i);
		}
	System.out.println(counter );
	}
	public static void main(String[] args) 
	{
        Test26 t=new Test26();
		t.getCount();
    }
}

/*o/p-->0   but not display on screen why?



class Test26 
{
	void getCount()
	{
		int counter =0;
		
		/*for (int i=10;i>0 ;i-- )
		{
			int j=0;
			while (j>10)
			{
				if(j>1)
					break;
				j++;
			}
		}
		*/

	/*System.out.println(counter);
	}
	public static void main(String[] args) 
	{
        Test26 t=new Test26();
    }
}
o/p compile but not o/p...why?*/