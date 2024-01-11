package com.rathod.oops;

public class TestWidenBoxVarAgrsRuleEx {
	

	public void doX(Integer i)
	{
		 System.out.println("Integer "+i);  
	}
	public void doX(long l)
	{
		 System.out.println("long "+l);  
	}
   public static void main(String[] args)throws Exception { 
	   TestWidenBoxVarAgrsRuleEx twbvr = new TestWidenBoxVarAgrsRuleEx();
	   twbvr.doX(Integer.valueOf(888888885));
	   twbvr.doX(888888885);
   }
}



/*
doX(Integer i) & doX(long l)       doX(5)              long (by Rule 1)
doX(int...i) & doX(Integer i)      doX(5)              Integer (by Rule 1)
doX(Long l) & doX(int...i)         doX(5)              int...i (Rule 2 & 1)
doX(Long l) & doX(Integer...i)     doX(5)              Integer...i(R. 2&1)
doX(Object o) & doX(Long l)        doX(5)              Object o (Rule 2&3)
doX(Object o) & doX(int...i)       doX(5)              Object o (Rule 3&1)
doX(Object o) & doX(long l)        doX(5)              long l (Rule 3&1)
doX(long...l) & doX(Integer...i)   doX(5)              ambiguous (Rule 4)
doX(long...l) & doX(Integer i)     doX(5)              Integer (Rule 1)
doX(Long l)                        Integer i;          error (Rule 5)  
                                   doX(i)
doX(Long l) & doX(long...l)        Integer i;          long...l(Rule 5 & 1) // here is 'Un'boxing and then Widening.
                                   doX(i)
doX(Integer... i) doX(Object o)    doX(5) (Object o) based of rule 1, 3.



byte---->Integer... is not boxing+varargs. 
it is 
byte---->int //widening then int --->Integer //boxing then Integer... //var-args 
so 
byte--->Integer... is widening+boxing+var-args 


a.getNum(4);  here 4 is int 

so for getNum(int... n) 
it is only varargs. 
int ---> int... 

for getNum(Integer... n) 
it is boxing + varargs. 
int--->Integer--->varargs 
Here rule no 4 applies, but we need to make rule no 4 more clear to cover this behavior also.

*/