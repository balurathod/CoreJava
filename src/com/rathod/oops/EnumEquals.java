package com.rathod.oops;
class EnumEquals        //Enum= such class name is not allowed  why?
	{
		enum Color {RED,BLUE}        //; is optional vt enum...
	public static void main(String[] args) 
	{
		Color c1 = Color.RED;
		Color c2 = Color.RED;
		
//		Color c2 = Color.BLUE;  compile & run bt nothing o/p.
		if (c1==c2)
		{
			System.out.println("==");
		}
		if (c1.equals(c2))
		{
			System.out.println("Dot Equals");
		}
	}
}
//enum ref variables?

/*what is d diff bet "==" & equals() method?
Ans-We just used "==" to do a little exploration of Wrappers(classes)
    ,compare  two ref equal or not. 



    Intention of "equals()"-(subjective def.)
	To detmine wheather 2-instances of a given class r "meaningfully equivalent".
	To detmine wheather 2-val of ref of a given class r "meaningfully equivalent".

    

	It's upto d creater of d class to determine what "equivalent" means for obj of 
	class in question.

	The API devlprs decides that for all the wrapperclasses,two objs r equal 
	if dey r of d same type & have d same val.
*/
