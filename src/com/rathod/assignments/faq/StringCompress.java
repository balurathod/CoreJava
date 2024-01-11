package com.rathod.assignments.faq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCompress {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		String str= "aaabbbbccccc"; 
		StringBuffer str1 = new StringBuffer(str); 
		System.out.println("Input string is "+str1); 
		char prev = str1.charAt(0); 
		char curr;	
		int count=1,prev_index=0; 
		for(int i=1;i<str1.length();i++) 
		{ 
			curr= str1.charAt(i); 
			if(prev==curr)	
				count++;	
			else 
			{ 
				if(count>2) 
				{ 
					int offset= prev_index+count; 
					str1.delete(prev_index+1,offset); 
					str1.insert(prev_index+1, count); 
					count=1; 
					prev = curr;	
					prev_index = prev_index+2; 
					i=prev_index; 
				} 
				else 
				{ 
					str1.deleteCharAt(prev_index+1); 
					str1.insert(prev_index+1, count); 
					count=1; 
					prev=curr; 
					prev_index=prev_index+2;	
				} 
			} 
			if(i==(str1.length()-1)) 
			{ 
			
				int offset= prev_index+count; 
				str1.delete(prev_index+1,offset); 
				str1.insert(prev_index+1, count); 
			
			} 
		} 
		System.out.println("Output string is " +str1); 
		StringCompress.stringCmpress(str);
	} 
	
	
	public static String stringCmpress(String str){ 
		
		StringBuilder objString = new StringBuilder();

	    int count;
	    char match;

        count = str.substring(str.indexOf(str.charAt(1)), str.lastIndexOf(str.charAt(1))).length()+1;
        match = str.charAt(1);
        objString.append(count);
        objString.append(match);
        count = str.substring(str.indexOf(str.charAt(4)), str.lastIndexOf(str.charAt(4))).length()+1;
        match = str.charAt(4);
        objString.append(count);
        objString.append(match);
        count = str.substring(str.indexOf(str.charAt(7)), str.lastIndexOf(str.charAt(7))).length()+1;
        match = str.charAt(7);
        objString.append(count);
        objString.append(match);
        System.out.println("Output string is " +objString.toString()); 
        
        String compressed = str;
        Pattern pattern = Pattern.compile("([\\w])\\1*");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
           String group = matcher.group();
           if (group.length() > 1) compressed += group.length() + "";
           compressed += group.charAt(0);
        }
        System.out.println("Output compressed string is " +compressed); 
        
	    return objString.toString();
	}
}
