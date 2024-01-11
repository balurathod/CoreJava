package com.rathod.unsolved;
//73
static class A
{
	public void process() throws Exception  //why apply here-bcz progmr dont want excpcn in this fun. 
		{
		   new Exception(); //user define
		}
}
static class B3 extends A
{
	public void process()          //Method should not be more restricted.......due to public
		{
	      System.out.print("B,");
	    }
	public static void main(String[] args) 
	{
		//A a=new B3();
    	//a.process();        //static class/method/block 
		                   //  doesn't need of obj & its ref(a). 
		
	}
}
//compliation fail at line 15.