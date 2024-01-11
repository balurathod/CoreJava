package com.rathod.oops;
class One 
{
	public One foo()
	{
		return this;
	}
}
class Two extends One
{
	public One foo()
	{
		return this;
	}
}
class Three extends Two
{
	// insert method here
	//C-public One foo()
	    //{return this;}
	//D-public Two foo()
	    {
			return this;
		}

}
/*
class Three extends Two
{
	// insert method here
	//public One foo()
	{return this;}
	public Two foo()
	{return this;}

}
Erro-
D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Three.java
Three.java:15: return outside method
        {return this;}
         ^
1 error





class Three extends Two
{
	// insert method here
	public One foo()
	{return this;}
	public Two foo()
	{return this;}

}
Error-

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Three.java
Three.java:16: foo() is already defined in Three
        public Two foo()
                   ^
1 error
*/	