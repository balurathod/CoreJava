package com.rathod.oops;

public class StringAllMtdExample { 
	public static void main(String args[]){  
		String s1="java";//creating string by java string literal   
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string    
		String s3=new String("example");//creating java string by new keyword    
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  

		char ch1=s1.charAt(2);//returns the char value at the 2nd index  
		System.out.println(ch1); 
		System.out.println("string length is: "+s1.length());//4 is the length of java string  

		String str="this is index of example";//there are 2 's' characters in this sentence  
		int index1=str.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  

		//String joinString1= String.join("-","welcome","to","javatpoint");  
		//System.out.println(joinString1);

		String s33="";  
		String s4="javatpoint";  
		  
		System.out.println(s33.isEmpty());  
		System.out.println(s4.isEmpty());  

		String s5="hello";  
		String s6="hello";  
		String s7="meklo";  
		String s8="vit";  
		System.out.println(s5.compareTo(s6));  //s1 == s2 => 0  
		System.out.println(s5.compareTo(s7));  //s1 < s2 => negative number  
		System.out.println(s5.compareTo(s8));  //s1 > s2 => positive number 

		String s9="java string";  
		s9.concat("is immutable");  
		System.out.println(s9);  
		s9=s9.concat(" is immutable so assign it explicitly");  
		System.out.println(s9);  

		String name1="what do you know about me";  
		System.out.println(name1.contains("do you know"));  
		System.out.println(name1.contains("about"));  
		System.out.println(name1.contains("hello")); 

		String s10="java by javatpoint";  
		System.out.println("endsWith--"+s10.endsWith("t"));  
		System.out.println("startsWith--"+s10.startsWith("point")); 
		//String s1="java string split method by javatpoint";  
		System.out.println("startsWith--"+s10.startsWith("ja"));  
		System.out.println("startsWith--"+s10.startsWith("java"));  

		String s11="javatpoint";  
		String s12="javatpoint";  
		String s13="JAVATPOINT";  
		String s14="python";  
		System.out.println("equals--"+s11.equals(s12));//true because content and case is same  
		System.out.println(s11.equals(s13));//false because case is not same  
		System.out.println(s11.equals(s14));//false because content is not same  

		String name2="sonoo";  
		String sf15=String.format("name is %s",name2);  
		String sf16=String.format("value is %f",32.33434);  
		String sf17=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println("format--"+sf15);  //format() method like printf() in java
		System.out.println("format--"+sf16);  
		System.out.println("format--"+sf17); 

		String s18="ABCDEFG";  
		byte[] barr=s18.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println("getBytes"+barr[i]);  
		}
		String s19="this is index of example";  
		//passing substring  
		int index11=s19.indexOf("is");//returns the index of is substring  
		int index2=s19.indexOf("index");//returns the index of index substring  
		System.out.println(index11+" indexof "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s19.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println("indexOf 3--"+index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s19.indexOf('s');//returns the index of s char value  
		System.out.println("indexOf 4--"+index4);//3  

		String s20=new String("hello");  
		String s21="hello";  
		String s22=s21.intern();//returns string from pool, now it will be same as s2  
		System.out.println("s20==s21--"+s20==s21);//false because reference is different  
		System.out.println("s21==s22--"+s21==s22);//true because reference is same  

		String s23="javatpoint is a very good website";  
		String replaceString=s23.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println("replace--"+replaceString); 

		String s24="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString1=s24.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println("replaceAll--"+replaceString1);  

		String s25="java string split method by javatpoint";  
		String[] words=s25.split("\\s");//splits the string based on string  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println("split--"+w);  
		}
		String s26="javatpoint";  
		System.out.println("substring--"+s26.substring(2,4));//returns va  
		System.out.println("substring--"+s26.substring(2));//returns vatpoint  

		String s27="hello";  
		char[] ch2=s27.toCharArray();  //converts this string into character array
		for(int i=0;i<ch2.length;i++){ //It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
		System.out.println("toCharArray--"+ch[i]); 
		}  

		String s28="JAVATPOINT HELLO stRIng";  
		String s28lower=s28.toLowerCase();  
		String s28UPPer=s28.toUpperCase();
		System.out.println(s28lower+"  UPPER-->"+s28UPPer); 

		String s29="  hello string   ";  
		System.out.println(s29+"javatpoint");//without trim()  
		System.out.println(s29.trim()+"javatpoint");//with trim() 

		int value=30;    
		String s30=String.valueOf(value);  
		System.out.println("s30+10--"+s30+10);//concatenating string with 10  
		
		
		Integer i = 10;
		//This returns a String object representing the value of this Integer.
		String s = i.toString();
		//This returns a String object representing the specified integer.
		System.out.println(Integer.toString(12));
		}
}

/*
java
strings
example
v
string length is: 4
6
true
false
0
-5
-14
java string
java string is immutable so assign it explicitly
true
true
false
endsWith--true
startsWith--false
startsWith--true
startsWith--true
equals--true
false
false
format--name is sonoo
format--value is 32.334340
format--value is                  32.334340000000
getBytes65
getBytes66
getBytes67
getBytes68
getBytes69
getBytes70
getBytes71
2 indexof 8
indexOf 3--5
indexOf 4--3
false
false
replace--jevetpoint is e very good website
replaceAll--My name was Khan. My name was Bob. My name was Sonoo.
split--java
split--string
split--split
split--method
split--by
split--javatpoint
substring--va
substring--vatpoint
toCharArray--s
toCharArray--t
toCharArray--r
toCharArray--i
toCharArray--n
javatpoint hello string  UPPER-->JAVATPOINT HELLO STRING
  hello string   javatpoint
hello stringjavatpoint
s30+10--3010
 * */
 