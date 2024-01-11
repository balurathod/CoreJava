package com.rathod.unsolved;
class AMyClass 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		System.out.println(str.indexOf('d'));
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf("W"));  //here String allow & single char also consider as a String. 
		System.out.println(str.indexOf("xs"));
//		System.out.println(str.indexOf('Dx'));  only char allow not String
	}
}

/*
o/p->10 -1 -1  

           "Hello Word"
		    12345678910   char positioning in index of String type obj
			
			indexOf()-metd of String class. count index val of STRING char wise.
			
			so val of 'd' is 10
			   
			   'a' is not present in given String obj
            so val of 'a'  is any -ve, i.e."-1"     
			     
			    'h' is not present in given String obj
            so val of 'h'  is any -ve, i.e."-1"    
*/
