package com.rathod.oops;
//34  public class  Fabric
//{
	public enum Title
	{
		MR("Mr."),MRS("Mrs."),MS("Ms");
	}
	private final String title;

	private Title (String t)
	{
		title =t;
	}
	public String format(Striong last,String first)
	{
		return title+""+first+""+last;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(Title.MR.format("Balu ","Rathod"));
	}
//}
/*Ans-A  Mr. Balu Rathod



35
public static void main(String[] args) 
	{
		Object obj=new int[] {1,2,3};
		int[] someArray=(int[])obj;
		for(int t:someArray)
		System.out.println(i+""); 
		
	}
	o/p-->1 2 3




36
class Foo1 
{
	static void alpha()
	{//B-Foo1.alpha() is valid invocation of beta();
		}
	static void beta()
	{// C-Method beta() can directly call method alpha();
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}





37
C-public void logIt(String...msgs)
this create a logging method that can accept an arbitry no.of arg...like
LogIt("Log Msg 1");
LogIt("Log Msg 2","Log Msg 3");
LogIt("Log Msg 4","Log Msg 5","Log Msg 6");




42
class One 
{
	void foo()
	{   }
}
class Two extends One
{
 which 3 method insert individauly to complt class Two? here BCE
	void foo()
	{/*return code*/}
	//public void foo()
	{/*return code*/}
	//protected void foo()
	{/*return code*/}
}

