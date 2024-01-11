package com.rathod.unsolved;
class Test12 
{
	try
	{
		ResourceConnection con=resourceFactory.getConnection();
		Results r=con.query("GET INFO FROM CUSTOMER");
		info=r.getData();
		con.close();
	}
	catch (ResourceException re)
	{
		errorLog.write(re.getMessage());
			
	}
	return info;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
which is true?if a ResourceException is thrown on line 6?
Ans-->the resource connection is not close on line 8
*/